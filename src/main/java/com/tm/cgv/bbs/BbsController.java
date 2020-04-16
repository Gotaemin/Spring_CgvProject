package com.tm.cgv.bbs;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tm.cgv.member.MemberDTO;

@Controller
@RequestMapping(value = "/bbs/**")
public class BbsController {

	@Autowired
	private BbsService bbsService;
	
	//글 목록 리스트 (GET)
	@RequestMapping(value = "boardList",method = RequestMethod.GET)
	public void bbsList(Model model) throws Exception{
		//System.out.println("bbs List");
		
		ArrayList<BbsDTO> bbsList = bbsService.bbsListSelect();
		
		if(bbsList != null) {
			model.addAttribute("bbsList", bbsList);
		}
	}
	
	
	//글 작성(등록)(GET/POST)
	@RequestMapping(value = "boardWrite",method = RequestMethod.GET)
	public void bbsWrite1(HttpSession session) {
		//System.out.println("bbs Write Form");
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("memberDTO");
		String id = memberDTO.getId();
	}
	@RequestMapping(value = "boardWrite",method = RequestMethod.POST)
	public String bbsWrite2(String id,String title,String contents) throws Exception{
		//System.out.println("bbs Write Form");
		
		int result = bbsService.bbsWrite(id, title, contents);
		
		if(result > 0) {
			
			return "redirect:boardList";
		}
		
		return "boardWrite";
		
	}
	
	
	//글 상세 정보(GET)
	@RequestMapping(value = "boardSelect")
	public void bbsSelect(int no,Model model) throws Exception{
		System.out.println("bbsSelect");
		
		BbsDTO bbsDTO = bbsService.bbsSelect(no);
		if(bbsDTO != null) {
			model.addAttribute("bbsDTO", bbsDTO);
		}
		
	}
	
	
	//글 삭제(GET)
	
	//글 수정(GET/POST)
	
	
}
