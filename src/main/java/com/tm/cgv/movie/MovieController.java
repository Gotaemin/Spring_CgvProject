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
	
	
	@GetMapping("movieListMore")
	public ModelAndView movieListMore(Pager pager) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		System.out.println(pager.getStartRow());
		
		List<MovieDTO> list =  movieService.movieListMore(pager);
		if(list != null) {
			
			mv.addObject("list", list);
			mv.setViewName("movie/ajax/movieListMore");
		}
		return mv;
		
	}
	
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
	public ModelAndView movieReservation(MovieDTO movieDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		//초기 영화목록 호출
		List<MovieDTO> list = movieService.movieListAll(movieDTO);
		
		//초기 극장리스트 호출 
		
		//초기 날짜 리스트 호출
		
		mv.addObject("list", list);
		mv.setViewName("movie/movieReservation");
		
		return mv;
	}
	
	@GetMapping("movieListSort")
	public ModelAndView movieListSort(MovieDTO movieDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		System.out.println("movieListSort_ kind : "+movieDTO.getKind());
		
		List<MovieDTO> list = movieService.movieListAll(movieDTO);
		
		mv.addObject("list", list);
		mv.setViewName("movie/ajax/movieListSort");
		
		return mv;
	}
	
	@GetMapping("movieSelect")
	public void movieSelect() throws Exception{
		
	}

}
