package com.tm.cgv.bbs;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {

	@Autowired
	private BbsDAO bbsDAO;
	
	public BbsService(BbsDAO bbsDAO) {
		this.bbsDAO = bbsDAO;
	}
	
	//하나의 글 조회 
	public BbsDTO bbsSelect(int no) throws Exception{
		return bbsDAO.bbsSelect(no);
	}
	
	//글 목록 조회
	public ArrayList<BbsDTO> bbsListSelect() throws Exception{
		return bbsDAO.bbsListSelect();
	}
	
	//글 등록
//	public int bbsWrite(BoardDTO boardDTO) throws Exception{
//		return bbsDAO.boardWrite(boardDTO);
//	}
	public int bbsWrite(BbsDTO bbsDTO) throws Exception{
		return bbsDAO.boardWrite(bbsDTO);
	}
}
