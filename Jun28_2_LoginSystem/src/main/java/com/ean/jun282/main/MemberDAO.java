package com.ean.jun282.main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberDAO {
	
	// 페이지를 여기저기 다닐건데.. => 로그인이 되어있는지 확인이 되어야겠음!
	public static boolean loginCheck(HttpServletRequest request) {
		Member m = (Member) request.getSession().getAttribute("m");
		//	로그인 유지중이거나 로그인에 성공을 했으면 위의 줄의 attribute가 있을 것!
		return (m!=null);
	}
	
	// 로그인 기능
	public static void login(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("UTF-8");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			// 로그인 성공한 유저 정보
			//		사이트 어디서든지 사용 가능
			//		일정 시간이 지나면 로그인 상태를 풀리게
			//		session 소속의 attribute or cookie
			//		cookie는 위험해!!
			if (id.equals("헬프") && pw.equals("me")) {
				Member m = new Member(id, pw); 
				request.getSession().setAttribute("m", m);
				request.getSession().setMaxInactiveInterval(10);
			}
			
			// 한 번 로그인에 성공했으면, 다음에 이 사이트에 들어왔을 때
			//	<input>에 id가 남아있었으면....
			//	접속을 끊어도, 재부팅해도 남아있는 것... => Cookie
			
			Cookie c = new Cookie("lastLoginId", id);
			c.setMaxAge(600);
			response.addCookie(c);
			
		} catch (Exception e) {
			
		}
	}
	
}
