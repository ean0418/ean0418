package com.ean.jul103.member;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class MemberDAO {

	@Autowired
	private SqlSession ss;
	
	public void signup(Member m, HttpServletRequest req) {
		try {
			String path = req.getSession().getServletContext().getRealPath("resources/img");
			System.out.println(path);
			
			MultipartRequest mr = new MultipartRequest(req, path, 30*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
			m.setMs_id(mr.getParameter("ms_id"));
			m.setMs_pw(mr.getParameter("ms_pw"));
			m.setMs_name(mr.getParameter("ms_name"));
			m.setMs_fav_movie(mr.getParameter("ms_fav_movie"));
		
			String ms_addr1 = mr.getParameter("ms_addr1");
			String ms_addr2 = mr.getParameter("ms_addr2");
			String ms_addr3 = mr.getParameter("ms_addr3");
			String ms_addr = ms_addr2 + "!" + ms_addr3 + "!" + ms_addr1;
			m.setMs_addr(ms_addr);
			
			String ms_photo = mr.getFilesystemName("ms_photo");
			String ms_photo_kor = URLEncoder.encode(ms_photo, "UTF-8").replace("+", " ");
			m.setMs_photo(ms_photo_kor);
			
			if (ss.getMapper(MemberMapper.class).signupMember(m) == 1) {
				req.setAttribute("r", "가입 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "가입 실패");
		}
	}
	public Members memberIdCheck(Member m) {
		return new Members(ss.getMapper(MemberMapper.class).getMemberById(m));
	}
	
	public void login(Member m, HttpServletRequest req) {
		try {
			List<Member> members = ss.getMapper(MemberMapper.class).getMemberById(m);
			if (members.size() !=0) {
				Member dbM = members.get(0);
				
				if (dbM.getMs_pw().equals(m.getMs_pw())) {
					req.setAttribute("r", "로그인 성공");
					req.getSession().setAttribute("loginMember", dbM);
					req.getSession().setMaxInactiveInterval(600);
				
				}else {
					req.setAttribute("r", "로그인 실패(pw오류)");
				} 
			} else {
				req.setAttribute("r", "로그인 실패(ID 없음)");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "로그인 실패(db서버)");
		}
	}
	
	public void logout(HttpServletRequest req) {
		try {
			req.getSession().setAttribute("loginMember", null);
			req.setAttribute("r", "로그아웃 성공");
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "로그아웃 실패");
		}
	}
	
	public void delete(HttpServletRequest req) {
		try {
			Member m = (Member) req.getSession().getAttribute("loginMember");
			if (ss.getMapper(MemberMapper.class).deleteMember(m)==1) {
				req.setAttribute("r", "탈퇴 성공");
				req.getSession().setAttribute("loginMember", null);
				
				String ms_photo = m.getMs_photo();
				ms_photo = URLDecoder.decode(ms_photo, "UTF-8");
				String path = req.getSession().getServletContext().getRealPath("resources/img");
				File f = new File(path + "/" + ms_photo);
				f.delete();
			}else {
				req.setAttribute("r", "이미 탈퇴처림 됨");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "탈퇴실패(db서버)");
		}
	}
	
	public void update(HttpServletRequest req) {
		String path = null;
		Member m = (Member) req.getSession().getAttribute("loginMember");
		MultipartRequest mr = null;
		String old_ms_photo = m.getMs_photo();
		String new_ms_photo = null;
		
		try {
			path = req.getSession().getServletContext().getRealPath("resources/img");
			mr = new MultipartRequest(req, path, 30 *1024*1024,"UTF-8",new DefaultFileRenamePolicy());
		
			new_ms_photo = mr.getFilesystemName("ms_photo");
			
			if (new_ms_photo != null) {
				new_ms_photo = URLEncoder.encode(new_ms_photo, "UTF-8").replace("+", " ");
			}else {
				new_ms_photo = old_ms_photo;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		try {
			m.setMs_pw(mr.getParameter("ms_pw"));
			m.setMs_name(mr.getParameter("ms_name"));
			m.setMs_fav_movie(mr.getParameter("ms_fav_movie"));
			m.setMs_photo(new_ms_photo);
			
			String ms_addr1 = mr.getParameter("ms_addr1");
			String ms_addr2 = mr.getParameter("ms_addr2");
			String ms_addr3 = mr.getParameter("ms_addr3");
			String ms_addr = ms_addr2 + "!" + ms_addr3 + "!" +ms_addr1;
			m.setMs_addr(ms_addr);
			
			if (!new_ms_photo.equals(old_ms_photo)) {
				new File(path +"/" + URLDecoder.decode(old_ms_photo,"UTF-8")).delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "정보업데이트실패(DB서버)");
			if (!new_ms_photo.equals(old_ms_photo)) {
				try {
					new File(path +"/" + URLDecoder.decode(old_ms_photo,"UTF-8")).delete();
				} catch (UnsupportedEncodingException e2) {
					e2.printStackTrace();
				}
				
			}
		}
	}
	
	
}
