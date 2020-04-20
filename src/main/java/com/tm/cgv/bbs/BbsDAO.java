package com.tm.cgv.bbs;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tm.cgv.board.BoardDAO;
import com.tm.cgv.board.BoardDTO;
import com.tm.cgv.board.page.BoardPager;

@Repository
public class BbsDAO implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.tm.cgv.bbs.BbsDAO.";
	
	
	//글 목록 리스트 조회
	@Override
	public List<BoardDTO> boardList(BoardPager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE+"bbsList",pager);
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
	
	//글의 개수 조회
	@Override
	public long boardCount(BoardPager pager) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"bbsCount", pager);
	}
	

}
