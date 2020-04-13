package com.tm.cgv.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {

	@RequestMapping(value = "join",method = RequestMethod.GET)
	public void memberJoin() {
		System.out.println("memberJoin");
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public void memberLogin() {
		System.out.println("memberLogin");
		
	}
	
	@RequestMapping(value = "terms",method = RequestMethod.GET)
	public void memberTerms() {
		System.out.println("memberTerms");
	}
	
}
