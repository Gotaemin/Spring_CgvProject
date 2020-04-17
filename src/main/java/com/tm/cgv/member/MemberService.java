package com.tm.cgv.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	//회원가입
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		return memberDAO.memberJoin(memberDTO);
	}
	
	//로그인
	public MemberDTO memberCheck(String id,String pwd) throws Exception{
		return memberDAO.memberCheck(id, pwd);
	}
	
	//회원정보 수정
	
	//회원 탈퇴
}
