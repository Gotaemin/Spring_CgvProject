package com.tm.cgv.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.cgv.util.Pager;

@Service
public class MovieService {

	@Autowired
	private MovieDAO movieDAO;
	
	public List<MovieDTO> movieList(Pager pager) throws Exception{
		
		pager.setPerPage(7L);
		pager.makeRow();
		
		//ajax로 more버튼 클릭시 curPage를8로 perPage를 totalCount로 변경해주어야됨
		//totalCount는 Mapper생성해야 함
		
		return movieDAO.movieList(pager);
	}
	
}
