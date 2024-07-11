package com.ean.jul103.movie;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MovieController {

	
		@RequestMapping(value="/movie.go", method=RequestMethod.GET)
		public String goMovie(HttpServletRequest req) {
			req.setAttribute("cp", "movie/movie.jsp");
			return "index";
		}
		
		@RequestMapping(value="/movie1.go", method=RequestMethod.GET)
		public String goMovie1(HttpServletRequest req) {
			req.setAttribute("cp", "movie/movie1.jsp");
			return "index";
		}
		
		@RequestMapping(value="/movie2.go", method=RequestMethod.GET)
		public String goMovie2(HttpServletRequest req) {
			req.setAttribute("cp", "movie/movie2.jsp");
			return "index";
		}
		@RequestMapping(value="/movie3.go", method=RequestMethod.GET)
		public String goMovie3(HttpServletRequest req) {
			req.setAttribute("cp", "movie/movie3.jsp");
			return "index";
		}
		@RequestMapping(value="/movie4.go", method=RequestMethod.GET)
		public String goMovie4(HttpServletRequest req) {
			req.setAttribute("cp", "movie/movie4.jsp");
			return "index";
		}
	
}
