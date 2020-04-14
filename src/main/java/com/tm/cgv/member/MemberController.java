package com.tm.cgv.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {

	@RequestMapping(value = "join",method = RequestMethod.GET)
	public void memberJoin() {
		System.out.println("memberJoinForm");
	}
	
	@RequestMapping(value = "join",method = RequestMethod.POST)
	public void memberJoin2() {
		System.out.println("memberJoinDB");
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public void memberLogin() {
		System.out.println("memberLoginForm");
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public void memberLogin2(String id,String pwd) {
		System.out.println("memberLoginDB");
		
		
	}
	
	@RequestMapping(value = "terms",method = RequestMethod.GET)
	public void memberTerms() {
		System.out.println("memberTerms");
	}
	
}
