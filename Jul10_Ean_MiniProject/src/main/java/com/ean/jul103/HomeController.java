package com.ean.jul103;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ean.jul103.boxoffice.BoxOfficeDAO;

@Controller
public class HomeController {
	
	@Autowired
	private BoxOfficeDAO bDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		req.setAttribute("cp", "home.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/index.go", method = RequestMethod.GET)
	public String home2(HttpServletRequest req) {
		return home(req);
	}
	
	
}
