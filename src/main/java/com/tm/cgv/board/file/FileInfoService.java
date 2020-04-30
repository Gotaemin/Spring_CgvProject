package com.tm.cgv.board.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileInfoService {

	@Autowired
	private FileInfoDAO fileInfoDAO;
	
	public FileInfoDTO fileSelect(int no) throws Exception{
		return fileInfoDAO.fileSelect(no);
	}
	
}
