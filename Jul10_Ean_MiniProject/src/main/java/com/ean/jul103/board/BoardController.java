package com.ean.jul103.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@RequestMapping(value="/board.go", method=RequestMethod.GET)
	public String goBoard(HttpServletRequest req) {
		req.setAttribute("cp", "board/board.jsp");
		return "index";
	}
	@RequestMapping(value="/board1.go", method=RequestMethod.GET)
	public String goBoard1(HttpServletRequest req) {
		req.setAttribute("cp", "board/board1.jsp");
		return "index";
	}
	@RequestMapping(value="/board2.go", method=RequestMethod.GET)
	public String goBoard2(HttpServletRequest req) {
		req.setAttribute("cp", "board/board2.jsp");
		return "index";
	}
	@RequestMapping(value="/board3.go", method=RequestMethod.GET)
	public String goBoard3(HttpServletRequest req) {
		req.setAttribute("cp", "board/board3.jsp");
		return "index";
	}
	@RequestMapping(value="/board4.go", method=RequestMethod.GET)
	public String goBoard4(HttpServletRequest req) {
		req.setAttribute("cp", "board/board4.jsp");
		return "index";
	}
}
