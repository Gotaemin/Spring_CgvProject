package com.tm.cgv.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.cgv.Info.InfoDTO;
import com.tm.cgv.Info.InfoService;

@Service
public class MemberService implements InfoService{

	@Autowired
	private MemberDAO memberDAO;
	
	
	public int userIdCheck(String id) throws Exception{
		MemberDTO memberDTO = memberDAO.userIdCheck(id);
		int result = 1;
		if(memberDTO != null) {
			result = 0;
		}
		
		return result;
	}

	@Override
	public int infoJoin(InfoDTO infoDTO) throws Exception {
		return memberDAO.infoJoin(infoDTO);
	}

	@Override
	public InfoDTO infoLogin(InfoDTO infoDTO) throws Exception {
		return memberDAO.infoLogin(infoDTO);
	}
	
	
	
	//회원정보 수정
	
	//회원 탈퇴
	
/*
	//회원가입
		public int memberJoin(MemberDTO memberDTO) throws Exception{
			return memberDAO.memberJoin(memberDTO);
		}
		
		//로그인
		public MemberDTO memberCheck(String id,String pwd) throws Exception{
			return memberDAO.memberCheck(id, pwd);
		}
		
*/
}
