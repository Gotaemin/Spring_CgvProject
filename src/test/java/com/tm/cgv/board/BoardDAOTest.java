package com.tm.cgv.board;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.cgv.AbstractTestCase;
import com.tm.cgv.bbs.BbsDAO;
import com.tm.cgv.bbs.BbsDTO;

public class BoardDAOTest extends AbstractTestCase{

	
	@Autowired
	private BbsDAO bbsDAO;
	
	@Test
	public void BoardWriteTest() throws Exception {
		BbsDTO bbsDTO = new BbsDTO();
		
		String title ="";
		String contents = "";
		String id = "";
		
		for(int i=0;i<100;i++) {
			
			if(i%3==0) {
				title = "titleText1";
				contents = "contentsText1";
				id = "userID1";
			}else if(i%3==1) {
				title = "titleText2";
				contents = "contentsText2";
				id = "userID2";
			}else if(i%3==2) {
				title = "titleText3";
				contents = "contentsText3";
				id = "userID3";
			}
			
			bbsDTO.setTitle(title);
			bbsDTO.setContents(contents);
			bbsDTO.setId(id);
			
			int result = bbsDAO.boardWrite(bbsDTO);
			
			if(i == 50 ) {
				Thread.sleep(1000);
			}
		}
	}

}
