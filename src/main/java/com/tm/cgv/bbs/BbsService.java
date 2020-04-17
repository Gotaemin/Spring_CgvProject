package com.tm.cgv.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.cgv.board.BoardDTO;
import com.tm.cgv.board.BoardService;

@Service
public class BbsService implements BoardService{

	@Autowired
	private BbsDAO bbsDAO;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return bbsDAO.boardList();
	}

	@Override
	public BoardDTO boardSelect(int no) throws Exception {
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
	

}
