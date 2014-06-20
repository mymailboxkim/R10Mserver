package com.tenm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tourWebController {

	public tourWebController() {
		System.out.println("========== WebController Constructor ==========");
	}
	
//	http://192.168.200.93:8080/main.do
	@RequestMapping(value="/main.do")
	public String mainPageController(){
		System.out.println("==========main.do request==========");
		return "main";
	}
	
//	http://192.168.200.93:8080/aboutus.do
	@RequestMapping(value="/aboutus.do")
	public String aboutusPageController(){
		System.out.println("==========aboutus.do request==========");
		return "aboutus";
	}
	
//	http://192.168.200.93:8080/store.do
	@RequestMapping(value="/store.do")
	public String storePageController(){
		System.out.println("==========store.do request==========");
		return "store";
	}
	
//	http://192.168.200.93:8080/faq.do
	@RequestMapping(value="/faq.do")
	public String faqPageController(){
		System.out.println("==========faq.do request==========");
		return "faq";
	}
	
//	http://192.168.200.93:8080/contactus.do
	@RequestMapping(value="/contactus.do")
	public String contactusPageController(){
		System.out.println("==========contactus.do request==========");
		return "contactus";
	}

}
