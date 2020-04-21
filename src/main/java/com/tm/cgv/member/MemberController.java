package com.tm.cgv.member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tm.cgv.Info.InfoDTO;

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

		int result = memberService.infoJoin(memberDTO);

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
	public String memberLogin2(InfoDTO infoDTO,String remember, HttpSession session,HttpServletResponse response,Model model) throws Exception {
		
		//쿠키 생성 및 전달
		Cookie cookie = new Cookie("cookieId", "");
		
		if(remember != null) {
			cookie.setValue(infoDTO.getId());
		}
		response.addCookie(cookie);
		
		
		
		infoDTO = memberService.infoLogin(infoDTO);

		String command = "/member/login";
		if (infoDTO != null) {
			session.setAttribute("memberDTO", infoDTO);
			command = "redirect:/";
		}else {
			model.addAttribute("msg", "로그인 실패");
			model.addAttribute("path", "login");
			command = "common/result";
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
	
	//마이페이지
	@RequestMapping(value = "myPage")
	public void myPage() throws Exception{
		
	}

}

















