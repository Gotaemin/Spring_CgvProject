package com.tm.cgv.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tm.cgv.util.Pager;

@Controller
@RequestMapping("/movie/**")
public class MovieController {
	
	@Autowired
	public MovieService movieService;
	
	@GetMapping("movieList")
	public ModelAndView movieList(Pager pager) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<MovieDTO> list =  movieService.movieList(pager);
		if(list != null) {
			mv.addObject("list", list);
			mv.setViewName("movie/movieList");
		}
		
		return mv;
	}
	
	@GetMapping("movieReservation")
	public void movieReservation() throws Exception{
		
	}
	
	@GetMapping("movieSelect")
	public void movieSelect() throws Exception{
		
	}

}
