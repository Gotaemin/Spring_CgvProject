package com.tm.cgv.bbs;

import java.util.ArrayList;

public class BbsService {

	private BbsDAO bbsDAO;
	
	public BbsService(BbsDAO bbsDAO) {
		this.bbsDAO = bbsDAO;
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
