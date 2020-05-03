package com.tm.cgv.movie;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.cgv.AbstractTestCase;
import com.tm.cgv.util.Pager;

public class MovieDAOTest extends AbstractTestCase{

	@Autowired
	private MovieDAO movieDAO;
	
	@Test
	public void movieList() throws Exception {
		Pager pager = new Pager();
		
		List<MovieDTO> list = movieDAO.movieList(pager);
		assertNotNull(list);
	
	}
	
	@Test
	public void movieListMore() throws Exception{
		Pager pager = new Pager();
		pager.setPerPage(8L);
		
	}
 
}
