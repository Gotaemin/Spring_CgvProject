package com.tm.cgv.bbs;

import java.util.ArrayList;

public class BbsService {

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
	public int bbsWrite(String id,String title,String contents) throws Exception{
		return bbsDAO.bbsWrite(id, title, contents);
	}
}
