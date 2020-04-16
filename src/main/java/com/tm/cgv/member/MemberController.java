package com.tm.cgv.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "terms", method = RequestMethod.GET)
	public void memberTerms() {
		// System.out.println("memberTerms");
	}

	// 회원가입
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void memberJoin() {
		// System.out.println("memberJoinForm");
	}

	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String memberJoin2(String id, String pwd, String name, String year, String month, String day, String phone,
			String email, Model model) throws Exception {
		// System.out.println("memberJoinDB");

		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPwd(pwd);
		memberDTO.setName(name);
		memberDTO.setBirth(year + "/" + month + "/" + day);
		memberDTO.setPhone(phone);
		memberDTO.setEmail(email);

		int result = memberService.memberJoin(memberDTO);

		String msg = "회원가입에 실패하였습니다.";
		String path = "/member/join";

		if (result > 0) {
			System.out.println("resut : " + result);
			msg = "회원 가입에 성공하였습니다.";
			path = "redirect:../";
		}

		// model.addAttribute("path", path);
		// model.addAttribute("msg", msg);

		// return "common/result";

		return "redirect:../";
	}

	// 로그인
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void memberLogin() {
		// System.out.println("memberLoginForm");
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String memberLogin2(String id, String pwd, HttpSession session) throws Exception {
		// System.out.println("memberLoginDB");

		MemberDTO memberDTO = memberService.memberCheck(id, pwd);

		String command = "/member/login";
		if (memberDTO != null) {
			session.setAttribute("memberDTO", memberDTO);
			command = "redirect:/";
		}
		return command;
	}

	// 로그아웃
	@RequestMapping(value = "logout")
	public String memberLogout(HttpSession session) {
		session.invalidate();

		return "redirect:/";
	}

	// 로그인 확인
	@RequestMapping(value = "loginCheck")
	public String loginCheck(HttpSession session,Model model) throws Exception {
		 MemberDTO memberDTO = (MemberDTO)session.getAttribute("memberDTO");
		 
		 
		 if(memberDTO == null) {
			 
			 model.addAttribute("msg", "로그인필요");
			 model.addAttribute("path", "login");
			 
			 return "common/confirm";
		 }
		 
		 return "redirect:../bbs/boardWrite";
	}
	

}

















