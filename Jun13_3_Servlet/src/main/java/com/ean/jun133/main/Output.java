package com.ean.jun133.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Output")
public class Output extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String gender = request.getParameter("GD");
		String region = request.getParameter("LC");
		String[] hobby = request.getParameterValues("HB");
		String introMyself = request.getParameter("IND");
		
		// textarea에서 엔터 : \r\n
		// 웹페이지에서 줄바꾸기 : <br>
		introMyself = introMyself.replace("\r\n", "<br>");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>회원가입</title><meta charset = 'UTF-8'></head>");
		out.print("<body>");
		out.print("<h1>가입결과</h1>");
		out.printf("<h2>ID : %s</h2>", id);
		out.print("<br>");
		out.printf("<h2>PW : %s</h2>", pw);
		out.print("<br>");
		out.printf("<h2>성별 : %s</h2>", gender);
		out.print("<br>");
		out.printf("<h2>지역 : %s</h2>", region);
		out.print("<br>");
		if (hobby != null) {
			out.print("<h2>취미 : ");
			for (String s : hobby) {
				out.print(s +" ");
			}
			out.print("</h2>");
		}
		out.print("<br>");
		out.printf("<h2>자기소개 : %s</h2>", introMyself);
		out.print("</body>");
		out.print("</html>");
	}

}
