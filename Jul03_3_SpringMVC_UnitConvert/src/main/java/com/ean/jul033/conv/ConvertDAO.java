package com.ean.jul033.conv;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class ConvertDAO {
	// 1 - 0.393701
	// 1 - 0.3025 
	// 1 - 33.8
	// 1 - 1.609344
	
	private HashMap<String, String> unit;

	public void setUnit(HashMap<String, String> unit) {
		this.unit = unit;
	}



	public void convert(ConvResult cr, HttpServletRequest req) {
		double n1 = cr.getN1();
		String what = req.getParameter("what");
		double n2 = n1 * 1.61;
		if (what.equals("l")) {
			n2 = n1 * 0.39;
		} else if (what.equals("d")) {
			n2 = n1* 0.3;
		} else if (what.equals("t")) {
			n2 = n1*1.8 + 32;
		}
		
		// 단위들은 어떻게 받아올 것인가?
		System.out.println(unit);
		System.out.println(unit.get(what));
		
		String[] u = unit.get(what).split(",");
		
		cr.setN2(n2);
		cr.setU1(u[0]);
		cr.setU2(u[1]);
		
		req.setAttribute("cr", cr);
		
 }
}