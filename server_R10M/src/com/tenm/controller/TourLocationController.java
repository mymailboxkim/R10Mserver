package com.tenm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tenm.service.TourService;

@Controller
@RequestMapping("/location")
public class TourLocationController {
	
	@Autowired
	@Qualifier("tourServiceImpl")
	private TourService tourService;

	public TourLocationController() {
		System.out.println("========== TourLocationController Constructor ==========");
	}
	
	/**한글 로케이션데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/location/ko/경복궁.json
//	http://mycafe24kim.cafe24.com/app/location/ko/경복궁.json
	@RequestMapping(value="/ko/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataKoController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON KO request==========");
		model.addAttribute(areaName, tourService.getLocationDataKoList(areaName));
	}
	
	/**영문 로케이션데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/location/en/경복궁.json
	@RequestMapping(value="/en/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataEnController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON EN request==========");
		model.addAttribute(areaName, tourService.getLocationDataEnList(areaName));
	}
	
	/**일본어 로케이션데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/location/jp/경복궁.json
	@RequestMapping(value="/jp/{areaName}", method=RequestMethod.GET)
	public void jsonLocationDataJpController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON JP request==========");
		model.addAttribute(areaName, tourService.getLocationDataJpList(areaName));
	}
	
	/**한글 로케이션데이터 맵 컨트롤러*/
//	http://192.168.200.93:8080/app/location/ko/locationDataMap/경복궁.json
	@RequestMapping(value="/ko/locationDataMap/{areaName}", method=RequestMethod.GET)
	public void jsonLocationMapController
				(@PathVariable String areaName, Model model){
		System.out.println("==========JSON Map request==========");
		model.addAttribute(areaName, tourService.getLocationDataKoMap(areaName));
	}
	
	
	
	//location streaming controller
	
	/**한글 로케이션 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/ko/{locationName}")
	public void locationVideoKoController
				(@PathVariable String locationName, Model model){
		System.out.println("==========LOCATION VIDEO KO request==========");
		model.addAttribute("videoUrl", tourService.getLocationStremingUrlKo(locationName));
		//return "redirect:/"+tourService.getBeaconStremingUrlKr(locationName);
	}
	
	/**영문 로케이션 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/En/{locationName}")
	public void locationVideoEnController
				(@PathVariable String locationName, Model model){
		System.out.println("==========LOCATION VIDEO EN request==========");
		model.addAttribute("videoUrl", tourService.getLocationStremingUrlEn(locationName));
		//return "redirect:/"+tourService.getLocationStremingUrlEng(locationName);
	}
	
	/**일본어 로케이션 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/jp/{locationName}")
	public void locationVideoJpController
				(@PathVariable String locationName, Model model){
		System.out.println("==========LOCATION VIDEO JP request==========");
		model.addAttribute("videoUrl", tourService.getLocationStremingUrlJp(locationName));
		//return "redirect:/"+tourService.getLocationStremingUrlJp(locationName);
	}

}
