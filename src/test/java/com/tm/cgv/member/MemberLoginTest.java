package com.tm.cgv.member;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.cgv.AbstractTestCase;
import com.tm.cgv.Info.InfoDTO;

public class MemberLoginTest extends AbstractTestCase{

	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void test() throws Exception{
		InfoDTO infoDTO = new InfoDTO();
		infoDTO.setId("admin");
		infoDTO.setPwd("1234");
		
		
		infoDTO = memberDAO.infoLogin(infoDTO);
		
		assertNotNull(infoDTO);
		
		
	}

}
