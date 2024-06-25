package com.ean.jun251.jstlf;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class JSTLFDataMaker {
	public static void make(HttpServletRequest request) {
		int a = 123456789;
		request.setAttribute("a", a);
		
		double b = 123456789;
		request.setAttribute("b", b);
		
		double c = 123456789;
		request.setAttribute("c", c);
		
		Date now = new Date(0);
		request.setAttribute("d", now);
	}
}
