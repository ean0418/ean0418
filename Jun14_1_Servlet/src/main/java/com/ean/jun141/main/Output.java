package com.ean.jun141.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/Output")
public class Output extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String pic = request.getParameter("pic");
		String photo = request.getParameter("photo");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>사진</title><meta charset = 'UTF-8'></head>");
		out.print("<body>");

		out.printf("<h1>제목 : %s</h1>", pic);
		out.printf("<h1>파일명 : %s</h1>", photo);
		out.printf("<img src='%s'>", photo);

		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 기존(주황색) 방식으로 전송된 파라미터 한글처리
//		request.setCharacterEncoding("UTF-8");

		// 기존(주황색) 방식으로 전송된 파라미터 읽기
//		String pic = request.getParameter("pic");

		response.setCharacterEncoding("UTF-8");

		// 파일 업로드를 해봅시다 !

		// 파일이 업로드 될 서버상의 폴더의 절대경로
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path); // 절대 경로의 위치

		// 파일 업로드  ***** 중요중요 숙지숙지~
		MultipartRequest mr = new MultipartRequest(request, path,
				// 허용할 파일의 최대크기(byte)
				10 * 1024 * 1024,
				// 요청파라미터 인코딩 방식
				"UTF-8",
				// 사용자가 업로드한 파일명이 중복될 때 처리
				// 중복시에 파일명 뒤에 숫자를 붙이게 하는 방식
				new DefaultFileRenamePolicy());

		String pic = mr.getParameter("pic");

		// 업로드 한 파일명(중복처리된)
		String photo = mr.getFilesystemName("photo");

		// DB에 파일명 저장할 때 => 용량을 상당히 여유있게 만들어야!!
		/// f_name varchar2(200 char)

		// 그 이유는 : 톰캣이 한글로 된 파일명 인식 못함
		// ㅋ.png => %2A.png (URL 인코딩이면 인식)
		photo = URLEncoder.encode(photo, "UTF-8");

		String photo2 = mr.getFilesystemName("etc");
		photo2 = URLEncoder.encode(photo2, "UTF-8");
		photo2 = photo2.replace("+", " ");

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>사진</title><meta charset = 'UTF-8'></head>");
		out.print("<body>");

		out.printf("<h1>제목 : %s</h1>", pic);
		out.printf("<h1>파일명 : %s</h1>", photo);
		out.printf("<img src='img/%s'>", photo); // 상대경로0
		out.printf("<h1>%s</h1>", photo2);
		out.printf("<a href='img/%s'>다운<a>", photo2);
										//  원래 이름값 넣으려면 디코딩해서 넣기
		out.print("</body>");
		out.print("</html>");
	}

}
