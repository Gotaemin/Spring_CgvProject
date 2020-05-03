package com.tm.cgv.movie;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tm.cgv.util.Pager;

@Repository
public class MovieDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.tm.cgv.movie.MovieDAO.";
	
	
	public long movieNumCount() throws Exception{
		return sqlSession.selectOne(NAMESPACE+"movieNumCount");
	}
	
	public List<MovieDTO> movieList(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"movieList", pager);
	}

}
