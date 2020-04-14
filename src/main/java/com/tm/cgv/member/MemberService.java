package com.tm.cgv.member;

public class MemberService {

	private MemberDAO memberDAO;
	
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
	public MemberDTO memberCheck(String id,String pwd) throws Exception{
		return memberDAO.memberCheck(id, pwd);
	}
}
