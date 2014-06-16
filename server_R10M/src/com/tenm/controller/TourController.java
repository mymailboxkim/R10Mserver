package com.tenm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tenm.domain.Beacon;
import com.tenm.service.TourService;

@Controller
public class TourController {
	
	@Autowired
	@Qualifier("tourServiceImpl")
	private TourService tourService;

	public TourController() {
		System.out.println("========== TourController Constructor ==========");
	}
	
	/**한글 로케이션데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/kr/gyungbokgung.json
	@RequestMapping(value="/kr/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataKrController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON KR request==========");
		model.addAttribute(areaName, tourService.getLocationDataKrList(areaName));
	}
	
	/**영문 로케이션데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/eng/gyungbokgung.json
	@RequestMapping(value="/eng/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataEngController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON ENG request==========");
		model.addAttribute(areaName, tourService.getLocationDataEngList(areaName));
	}
	
	/**한글 로케이션데이터 맵 컨트롤러*/
//	http://192.168.200.93:8080/app/kr/locationDataMap/gyungbokgung.json
	@RequestMapping(value="/kr/locationDataMap/{areaName}", method=RequestMethod.GET)
	public void jsonLocationMapController
				(@PathVariable String areaName, Model model){
		
		System.out.println("==========JSON Map request==========");
		model.addAttribute(areaName, tourService.getLocationDataKrMap(areaName));
	}
	
	/**영상 스트리밍 컨트롤러*/
//	http://192.168.200.93:8080/app/video/Geunjeongjeon.json
	@RequestMapping(value="/video/{locationName}")
	public void streamingVideoController
				(@PathVariable String locationName, Model model){
		System.out.println("==========VIDEO request==========");
		model.addAttribute("videoUrl", tourService.getStremingUrl(locationName));
	}
	
	/**비콘 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/8492E75F-4FD6-469D-B132-043FE94921D8/104/51
	@RequestMapping(value="/beacon/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		
		System.out.println("==========Beacon request==========");
		//model.addAttribute(tourService.getBeaconRegion(new Beacon(uuid, major, minor)));
		model.addAttribute("lat", tourService.getBeaconRegion(new Beacon(uuid, major, minor)).getLat());
		model.addAttribute("lng", tourService.getBeaconRegion(new Beacon(uuid, major, minor)).getLng());
		model.addAttribute("altitude", tourService.getBeaconRegion(new Beacon(uuid, major, minor)).getAltitude());
		model.addAttribute("locationName", tourService.getBeaconRegion(new Beacon(uuid, major, minor)).getLocationName());
		model.addAttribute("locationDetail", tourService.getBeaconRegion(new Beacon(uuid, major, minor)).getLocationDetail());
	}
	
}
