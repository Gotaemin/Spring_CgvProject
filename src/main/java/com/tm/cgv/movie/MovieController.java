package com.tm.cgv.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie/**")
public class MovieController {
	
	@RequestMapping(value = "movieList")
	public void movieList() throws Exception{
		
		
	}

}
