package com.ean.jul103.store;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StoreController {

	@RequestMapping(value="/store.go",method=RequestMethod.GET)
	public String Store(HttpServletRequest req) {
		req.setAttribute("cp", "store/store.jsp");
		
		return "index";
	}
}
