package com.tm.cgv.bbs;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tm.cgv.board.BoardDTO;
import com.tm.cgv.board.BoardService;
import com.tm.cgv.board.file.FileInfoDAO;
import com.tm.cgv.board.file.FileInfoDTO;
import com.tm.cgv.util.FileSaver;
import com.tm.cgv.util.Pager;

@Service
public class BbsService implements BoardService{

	@Autowired
	private BbsDAO bbsDAO;
	@Autowired
	private FileSaver fileSaver;
	@Autowired
	private FileInfoDAO fileInfoDAO;

	@Override
	public List<BoardDTO> boardList(Pager pager) throws Exception {
		
		pager.makeRow();
		long totalCount = bbsDAO.boardCount(pager);
		pager.makePage(totalCount);
		
		return bbsDAO.boardList(pager);
	}

	@Override
	public BoardDTO boardSelect(int no) throws Exception {
		//조회수 증가
		bbsDAO.countUpdate(no);
		
		return bbsDAO.boardSelect(no);
	}

	@Override
	public int boardWrite(BoardDTO boardDTO,MultipartFile file,HttpSession session) throws Exception {
		String path = session.getServletContext().getRealPath("resources/upload/bbs");
		System.out.println(path);
		
		boardDTO.setNo(bbsDAO.boardCount());
		int result = bbsDAO.boardWrite(boardDTO); //bbsInsert
		
		String fileName = fileSaver.saveUtils(file, path);
		
		FileInfoDTO fileInfoDTO = new FileInfoDTO();
		fileInfoDTO.setNo(boardDTO.getNo());
		fileInfoDTO.setFileName(fileName);
		fileInfoDTO.setOriName(file.getOriginalFilename());
		fileInfoDTO.setType(1); //1:bbs
		
		result = fileInfoDAO.fileInsert(fileInfoDTO); //fileInsert
		
		
		return result;
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
