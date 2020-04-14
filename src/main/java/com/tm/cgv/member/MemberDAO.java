package com.tm.cgv.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tm.util.DBConnect;

public class MemberDAO {
	
	
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

}
