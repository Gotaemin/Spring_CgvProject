package com.tm.cgv.bbs;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tm.cgv.board.BoardDAO;
import com.tm.cgv.board.BoardDTO;

@Repository
public class BbsDAO implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.tm.cgv.bbs.BbsDAO.";
	
	
	//글 목록 리스트 조회
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList(NAMESPACE+"bbsList");
	}

	//글 목록 하나 조회
	@Override
	public BoardDTO boardSelect(int no) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"bbsSelect", no);
	}

	//글 등록
	@Override
	public int boardWrite(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"bbsWrite", boardDTO);
	}
	
	//글 삭제
	@Override
	public int boardDelete(int no) throws Exception {
		return sqlSession.delete(NAMESPACE+"bbsDelete", no);
	}
	
/*
	//글 목록 하나 조회
	public BbsDTO bbsSelect(int no) throws Exception{
		Connection conn = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		BbsDTO bbsDTO = new BbsDTO();
		
		String sql = "select * from bbs where no = ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, no);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			bbsDTO.setNo(rs.getInt(1));
			bbsDTO.setTitle(rs.getString(2));
			bbsDTO.setHiredate(rs.getDate(3));
			bbsDTO.setCount(rs.getInt(4));
			bbsDTO.setContents(rs.getString(5));
			bbsDTO.setId(rs.getString(6));
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		return bbsDTO;
		
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
			bbsDTO.setId(rs.getString(6));
			
			bbsList.add(bbsDTO);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return bbsList;
	}
	
*/
}
