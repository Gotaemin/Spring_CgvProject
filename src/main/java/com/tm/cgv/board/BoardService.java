package com.tm.cgv.board;

import java.util.List;

import com.tm.cgv.board.page.BoardPager;

public interface BoardService {
	// List
	public List<BoardDTO> boardList(BoardPager pager) throws Exception;

	// Select One
	public BoardDTO boardSelect(int no) throws Exception;

	// Write(Insert)
	public int boardWrite(BoardDTO boardDTO) throws Exception;

	// delete
	public int boardDelete(int no) throws Exception;

}
