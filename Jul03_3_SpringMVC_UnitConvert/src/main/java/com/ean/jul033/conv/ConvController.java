package com.ean.jul033.conv;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConvController {

	@Autowired
	private ConvertDAO ucd;
	
	@RequestMapping(value = "/unit.convert", method = RequestMethod.GET)
	public String printResult(ConvResult cr, HttpServletRequest req) {

		ucd.convert(cr, req);
		
		
		return "output";
	}
}
