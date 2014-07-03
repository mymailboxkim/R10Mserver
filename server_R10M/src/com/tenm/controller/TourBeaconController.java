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
@RequestMapping("/beacon")
public class TourBeaconController {
	
	@Autowired
	@Qualifier("tourServiceImpl")
	private TourService tourService;

	public TourBeaconController() {
		System.out.println("========== TourBeaconController Constructor ==========");
	}
	
	/**한글 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/ko/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
//	http://mycafe24kim.cafe24.com/app/beacon/ko/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/ko/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataKoController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon KO request==========");
		Beacon beaconData = tourService.getBeaconDataKo(new Beacon(uuid, major, minor));
		model.addAttribute("regionName", beaconData.getRegionName());
		model.addAttribute("regionDetail", beaconData.getRegionDetail());
	}
	
	/**영문 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/en/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/en/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataEnController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon  EN request==========");
		Beacon beaconData = tourService.getBeaconDataEn(new Beacon(uuid, major, minor));
		model.addAttribute("regionName", beaconData.getRegionName());
		model.addAttribute("regionDetail", beaconData.getRegionDetail());
	}
	
	/**일본어 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/ja/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/ja/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataJaController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon JA request==========");
		Beacon beaconData = tourService.getBeaconDataJa(new Beacon(uuid, major, minor));
		model.addAttribute("regionName", beaconData.getRegionName());
		model.addAttribute("regionDetail", beaconData.getRegionDetail());
	}
	
	
	
	//beacon streaming controller
	
	/**한글 비콘 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/ko/{locationName}")
	public void beaconVideoKoController
				(@PathVariable String locationName, Model model){
		System.out.println("==========BEACON VIDEO KO request==========");
		model.addAttribute("videoUrl", tourService.getBeaconStremingUrlKo(locationName));
		//return "redirect:/"+tourService.getBeaconStremingUrlKo(locationName);
	}
	
	/**영문 비콘 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/en/{locationName}")
	public void beaconVideoEnController
				(@PathVariable String locationName, Model model){
		System.out.println("==========BEACON VIDEO EN request==========");
		model.addAttribute("videoUrl", tourService.getBeaconStremingUrlEn(locationName));
		//return "redirect:/"+tourService.getBeaconStremingUrlEn(locationName);
	}
	
	/**일본어 비콘 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/ja/{locationName}")
	public void beaconVideoJaController
				(@PathVariable String locationName, Model model){
		System.out.println("==========BEACON VIDEO JA request==========");
		model.addAttribute("videoUrl", tourService.getBeaconStremingUrlJa(locationName));
		//return "redirect:/"+tourService.getBeaconStremingUrlJa(locationName);
	}

}
