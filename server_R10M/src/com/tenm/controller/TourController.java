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
//	http://192.168.200.93:8080/app/kr/경복궁.json
	@RequestMapping(value="/kr/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataKrController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON KR request==========");
		model.addAttribute(areaName, tourService.getLocationDataKrList(areaName));
	}
	
	/**영문 로케이션데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/eng/경복궁.json
	@RequestMapping(value="/eng/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataEngController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON ENG request==========");
		model.addAttribute(areaName, tourService.getLocationDataEngList(areaName));
	}
	
	/**일본어 로케이션데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/jp/경복궁.json
	@RequestMapping(value="/jp/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataJpController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON JP request==========");
		model.addAttribute(areaName, tourService.getLocationDataJpList(areaName));
	}
	
	/**한글 로케이션데이터 맵 컨트롤러*/
//	http://192.168.200.93:8080/app/kr/locationDataMap/경복궁.json
	@RequestMapping(value="/kr/locationDataMap/{areaName}", method=RequestMethod.GET)
	public void jsonLocationMapController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON Map request==========");
		model.addAttribute(areaName, tourService.getLocationDataKrMap(areaName));
	}
	
	/**영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/kr/{locationName}")
	public void streamingVideoController
				(@PathVariable String locationName, Model model){
		System.out.println("==========VIDEO request==========");
		model.addAttribute("videoUrl", tourService.getStremingUrl(locationName));
	}
	
	/**한글 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/kr/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/beacon/kr/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataKrController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon request==========");
		model.addAttribute("regionName", tourService.getBeaconDataKr(new Beacon(uuid, major, minor)).getRegionName());
		model.addAttribute("regionDetail", tourService.getBeaconDataKr(new Beacon(uuid, major, minor)).getRegionDetail());
	}
	
	/**영문 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/eng/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/beacon/eng/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataEngController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon request==========");
		model.addAttribute("regionName", tourService.getBeaconDataEng(new Beacon(uuid, major, minor)).getRegionName());
		model.addAttribute("regionDetail", tourService.getBeaconDataEng(new Beacon(uuid, major, minor)).getRegionDetail());
	}
	
	/**일본어 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/jp/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/beacon/jp/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataJpController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon request==========");
		model.addAttribute("regionName", tourService.getBeaconDataJp(new Beacon(uuid, major, minor)).getRegionName());
		model.addAttribute("regionDetail", tourService.getBeaconDataJp(new Beacon(uuid, major, minor)).getRegionDetail());
	}
	
}
