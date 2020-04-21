package com.tm.cgv.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.cgv.board.BoardDTO;
import com.tm.cgv.board.BoardService;
import com.tm.cgv.util.Pager;

@Service
public class BbsService implements BoardService{

	@Autowired
	private BbsDAO bbsDAO;

	@Override
	public List<BoardDTO> boardList(Pager pager) throws Exception {
		
		pager.makeRow();
		long totalCount = bbsDAO.boardCount(pager);
		pager.makePage(totalCount);
		
		
		return bbsDAO.boardList(pager);
	}

	@Override
	public BoardDTO boardSelect(int no) throws Exception {
		bbsDAO.countUpdate(no);
		
		return bbsDAO.boardSelect(no);
	}

	@Override
	public int boardWrite(BoardDTO boardDTO) throws Exception {
		return bbsDAO.boardWrite(boardDTO);
	}

	@Override
	public int boardDelete(int no) throws Exception {
		return bbsDAO.boardDelete(no);
	}
	
	@Override
	public int boardUpdate(BoardDTO boardDTO) throws Exception {
		return bbsDAO.boardUpdate(boardDTO);
	}
	

}
