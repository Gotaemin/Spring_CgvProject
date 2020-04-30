package com.tm.cgv.bbs;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.tm.cgv.board.BoardDTO;
import com.tm.cgv.board.file.FileInfoDTO;
import com.tm.cgv.board.file.FileInfoService;
import com.tm.cgv.member.MemberDTO;
import com.tm.cgv.util.Pager;

@Controller
@RequestMapping(value = "/bbs/**")
public class BbsController {

	@Autowired
	private BbsService bbsService;
	@Autowired
	private FileInfoService fileInfoService;

	// 글 목록 리스트 (GET)
	@RequestMapping(value = "boardList", method = RequestMethod.GET)
	public void bbsList(Pager pager, Model model) throws Exception {
		List<BoardDTO> bbsList = bbsService.boardList(pager);

		if (bbsList != null) {
			model.addAttribute("bbsList", bbsList);
			model.addAttribute("pager", pager);
		}
	}

	// 글 작성(등록)(GET/POST)
	@RequestMapping(value = "boardWrite", method = RequestMethod.GET)
	public void bbsWrite1(HttpSession session) {
		// System.out.println("bbs Write Form");
	}

	@RequestMapping(value = "boardWrite", method = RequestMethod.POST)
	public String bbsWrite2(BbsDTO bbsDTO, MultipartFile file, HttpSession session) throws Exception {
//		System.out.println("bbs Write Form");
		int result = bbsService.boardWrite(bbsDTO, file, session);

		if (result > 0) {
			return "redirect:boardList";
		}
		return "boardWrite";
	}

	// 글 상세 정보(GET)
	@RequestMapping(value = "boardSelect")
	public void bbsSelect(int no, Model model) throws Exception {

		// bbs정보 조회
		BoardDTO bbsDTO = bbsService.boardSelect(no);
		if (bbsDTO != null) {
			model.addAttribute("bbsDTO", bbsDTO);
		}

		// file정보 조회
		FileInfoDTO fileInfoDTO = fileInfoService.fileSelect(no);
		if (fileInfoDTO != null) {
			model.addAttribute("fileInfoDTO", fileInfoDTO);
		}
	}

	// 글 삭제(GET)
	@RequestMapping(value = "boardDelete")
	public String bbsDelete(int no, Model model) throws Exception {
		System.out.println("bbsDelete: no:" + no);
		int result = bbsService.boardDelete(no);

		if (result > 0) {
			return "redirect:boardList";
		}

		return "boardSelect?no=" + no;
	}

	// 글 수정(GET/POST)
	@RequestMapping(value = "boardUpdate")
	public void bbsUpdate(int no, Model model, HttpSession session) throws Exception {

		BoardDTO boardDTO = bbsService.boardSelect(no);

		// file정보 조회
		FileInfoDTO fileInfoDTO = fileInfoService.fileSelect(no);
		if (fileInfoDTO != null) {
			model.addAttribute("fileInfoDTO", fileInfoDTO);
		}

		// Session이용해서 멤버정보 읽어오기
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("memberDTO");
		model.addAttribute("memberDTO", memberDTO);
		model.addAttribute("bbsDTO", boardDTO);
	}

	@RequestMapping(value = "boardUpdate", method = RequestMethod.POST)
	public ModelAndView bbsUpdate2(BbsDTO bbsDTO, ModelAndView mv) throws Exception {
		// DB전달
		int result = bbsService.boardUpdate(bbsDTO);

		System.out.println("boardUpdate");

		if (result > 0) {
			mv.setViewName("redirect:boardList");
		}

		return mv;
	}

}
