package com.ean.jul082.fruit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FruitController {
	
	@Autowired
	private FruitDAO fDAO;
	
	@RequestMapping(value="/fruit.get", method=RequestMethod.GET)
	public String regFruit(Fruit f, HttpServletRequest req) {
		fDAO.getAllFruit(req);
		return "index";
	}
	@RequestMapping(value="/fruit.getXML", method=RequestMethod.GET,
			produces = "application/xml; charset=UTF-8")		
	public @ResponseBody Fruits getFruitXML(HttpServletRequest req) {
		// @ResposeBody-데이터를 전달할때 사용
		return fDAO.getXML(req);
	}
	
	@RequestMapping(value="/fruit.searchXML", method=RequestMethod.GET,
			produces = "application/xml; charset=UTF-8")		
	public @ResponseBody Fruits searchFruitXML(Fruit f, HttpServletRequest req) {
		return fDAO.searchXML(f, req);
	}
}
