package com.ean.jun251.jstlc;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class JSTLCDataMaker {
	public static void make(HttpServletRequest request) {
		int[] ar = { 123, 456, 78, 91 ,234 };
		request.setAttribute("ar", ar);
		
		ArrayList<Ean> al = new ArrayList<Ean>();
		al.add(new Ean("이안",3,50.5,10.1));
		al.add(new Ean("기안",5,76.7,56.3));
		al.add(new Ean("미안",7,12.1,34.7));
		al.add(new Ean("디안",9,29.2,89.4));
		request.setAttribute("al", al);
	}
}
