package com.ean.jul103.boxoffice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BoxOfficeController {

	@Autowired
	private BoxOfficeDAO bDAO;
	
	
	@RequestMapping(value="/k.box.get", method= RequestMethod.GET,
			produces="application/xml; charset=UTF-8")
	public @ResponseBody String getKoreaMovie(HttpServletRequest req) {
		
		
		return bDAO.getKoreaMovie(req);

	}
	@RequestMapping(value="/box", method= RequestMethod.GET)
	public String Movie(HttpServletRequest req) {
		
		
		return "boxoffice/boxoffice";
		
	}
	
	
}


