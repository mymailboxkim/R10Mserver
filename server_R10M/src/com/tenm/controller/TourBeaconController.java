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
//	http://192.168.200.93:8080/app/beacon/kr/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
//	http://mycafe24kim.cafe24.com/app/beacon/kr/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/ko/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataKoController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon KO request==========");
		model.addAttribute("regionName", tourService.getBeaconDataKo(new Beacon(uuid, major, minor)).getRegionName());
		model.addAttribute("regionDetail", tourService.getBeaconDataKo(new Beacon(uuid, major, minor)).getRegionDetail());
	}
	
	/**영문 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/eng/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/en/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataEnController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon  EN request==========");
		model.addAttribute("regionName", tourService.getBeaconDataEn(new Beacon(uuid, major, minor)).getRegionName());
		model.addAttribute("regionDetail", tourService.getBeaconDataEn(new Beacon(uuid, major, minor)).getRegionDetail());
	}
	
	/**일본어 비콘 데이터 컨트롤러*/
//	http://192.168.200.93:8080/app/beacon/jp/8492e75f-4fd6-469d-b132-043fe94921d8/11/11001
	@RequestMapping(value="/jp/{uuid}/{major}/{minor}", method=RequestMethod.GET)
	public void beaconDataJpController
				(@PathVariable String uuid,
						@PathVariable int major,
						@PathVariable int minor,
						Model model){
		System.out.println("==========Beacon JP request==========");
		model.addAttribute("regionName", tourService.getBeaconDataJp(new Beacon(uuid, major, minor)).getRegionName());
		model.addAttribute("regionDetail", tourService.getBeaconDataJp(new Beacon(uuid, major, minor)).getRegionDetail());
	}
	
	
	
	//beacon streaming controller
	
	/**한글 비콘 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/ko/{locationName}")
	public void beaconVideoKoController
				(@PathVariable String locationName, Model model){
		System.out.println("==========BEACON VIDEO KO request==========");
		model.addAttribute("videoUrl", tourService.getBeaconStremingUrlKo(locationName));
		//return "redirect:/"+tourService.getBeaconStremingUrlKr(locationName);
	}
	
	/**영문 비콘 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/En/{locationName}")
	public void beaconVideoEnController
				(@PathVariable String locationName, Model model){
		System.out.println("==========BEACON VIDEO EN request==========");
		model.addAttribute("videoUrl", tourService.getBeaconStremingUrlEn(locationName));
		//return "redirect:/"+tourService.getBeaconStremingUrlEng(locationName);
	}
	
	/**일본어 비콘 영상 스트리밍 컨트롤러*/
//	호스팅 서버 이용
	@RequestMapping(value="/video/jp/{locationName}")
	public void beaconVideoJpController
				(@PathVariable String locationName, Model model){
		System.out.println("==========BEACON VIDEO JP request==========");
		model.addAttribute("videoUrl", tourService.getBeaconStremingUrlJp(locationName));
		//return "redirect:/"+tourService.getBeaconStremingUrlJp(locationName);
	}

}
