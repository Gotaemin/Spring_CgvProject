package com.tm.cgv.board;

import java.util.List;

import com.tm.cgv.util.Pager;

public interface BoardService {
	// List
	public List<BoardDTO> boardList(Pager pager) throws Exception;

	// Select One
	public BoardDTO boardSelect(int no) throws Exception;

	// Write(Insert)
	public int boardWrite(BoardDTO boardDTO) throws Exception;

	// delete
	public int boardDelete(int no) throws Exception;
	
	// update
	public int boardUpdate(BoardDTO boardDTO) throws Exception;

}
