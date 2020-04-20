package com.tm.cgv.board;

import java.util.List;

import com.tm.cgv.board.page.BoardPager;

public interface BoardDAO {
	// List
	public List<BoardDTO> boardList(BoardPager pager) throws Exception;

	// Select One
	public BoardDTO boardSelect(int no) throws Exception;

	// Write(Insert)
	public int boardWrite(BoardDTO boardDTO) throws Exception;

	// delete
	public int boardDelete(int no) throws Exception;

	// ListCounter
	public long boardCount(BoardPager pager) throws Exception;

	// countUpdate
	public int countUpdate(int no) throws Exception;

	// update
	public int boardUpdate(BoardDTO boardDTO) throws Exception;

}
