package com.tm.cgv.member;

public class MemberService {

	private MemberDAO memberDAO;
	
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
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
