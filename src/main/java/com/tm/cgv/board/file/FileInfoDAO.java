package com.tm.cgv.board.file;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileInfoDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.tm.cgv.board.file.FileInfoDAO.";

	public int fileInsert(FileInfoDTO fileInfoDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"fileInsert", fileInfoDTO);
	}
	
	public FileInfoDTO fileSelect(int no) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"fileSelect", no);
	}
	
}
