package com.tm.cgv.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.tm.util.DBConnect;

public class BbsDAO {

	//글 등록
	public int bbsWrite(String id,String title,String contents) throws Exception{
		Connection conn = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into bbs values (bbs_seq.nextVal,?,sysdate,0,?,?)"; //title,contents,id
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, contents);
		pstmt.setString(3, id);
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
		return result;
				
	}
	
	//글 목록 리스트 조회
	public ArrayList<BbsDTO> bbsListSelect() throws Exception{
		ArrayList<BbsDTO> bbsList = new ArrayList<BbsDTO>();
		BbsDTO bbsDTO = null;
		
		Connection conn = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from bbs order by no desc";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			bbsDTO = new BbsDTO();
			bbsDTO.setNo(rs.getInt(1));
			bbsDTO.setTitle(rs.getString(2));
			bbsDTO.setHiredate(rs.getDate(3));
			bbsDTO.setCount(rs.getInt(4));
			bbsDTO.setContents(rs.getString(5));
			
			bbsList.add(bbsDTO);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return bbsList;
	}
}
