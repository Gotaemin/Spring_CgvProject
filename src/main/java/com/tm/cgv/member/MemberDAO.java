package com.tm.cgv.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tm.cgv.Info.InfoDAO;
import com.tm.cgv.Info.InfoDTO;

@Repository
public class MemberDAO implements InfoDAO{

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.tm.cgv.member.MemberDAO.";
	
	
	public MemberDTO userIdCheck(String id) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"userIdCheck", id);
	}
	
	
	@Override
	public int infoJoin(InfoDTO infoDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"infoJoin", infoDTO);
	}
	@Override
	public InfoDTO infoLogin(InfoDTO infoDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"infoLogin", infoDTO);
	}
	
	
	
/*
	//회원가입
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		Connection conn = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into member values(?,?,?,?,?,?)"; //id,pwd,name,birth,phone,email
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, memberDTO.getId());
		pstmt.setString(2, memberDTO.getPwd());
		pstmt.setString(3, memberDTO.getName());
		pstmt.setString(4, memberDTO.getBirth());
		pstmt.setString(5, memberDTO.getPhone());
		pstmt.setString(6, memberDTO.getEmail());
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
		return result;		
	}
	
	//로그인 
	public MemberDTO memberCheck(String id,String pwd) throws Exception{
		MemberDTO memberDTO = null;
		
		Connection conn = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where id=? and pwd = ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			memberDTO = new MemberDTO();
			memberDTO.setId(id);
			memberDTO.setPwd(pwd);
			memberDTO.setName(rs.getString(3));
			memberDTO.setBirth(rs.getString(4));
			memberDTO.setPhone(rs.getString(5));
			memberDTO.setEmail(rs.getString(6));
		}
	
		rs.close();
		pstmt.close();
		conn.close();		
		
		return memberDTO;
	}
	
//	public static void main(String[] args) {
//		MemberDAO memberDAO = new MemberDAO();
//		
//		try {
//			MemberDTO dto =  memberDAO.memberCheck("admin", "1234");
//			
//			if(dto != null) {
//				System.out.println(dto.getId());
//				System.out.println(dto.getEmail());
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
*/
}
