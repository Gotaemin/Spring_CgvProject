package com.tm.cgv.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bbs/**")
public class BbsController {

	@RequestMapping(value = "boardList",method = RequestMethod.GET)
	public void bbsList() {
		System.out.println("bbs List");
	}
	
	@RequestMapping(value = "boardWrite",method = RequestMethod.GET)
	public void bbsWrite() {
		
		System.out.println("bbs Write Form");
	}
	
}
