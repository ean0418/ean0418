package com.ean.jun261.apple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.ean.db.manager.EanDBManager;

public class AppleDAO {
	private int allAppleCount;

	private static final AppleDAO APPLEDAO = new AppleDAO();

	private AppleDAO() {
		// TODO Auto-generated constructor stub
	}

	public static AppleDAO getAppledao() {
		return APPLEDAO;
	}

	// 모든 사과 데이터 다 가져오기

	public void getAllApples(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = EanDBManager.connect("EanPool");

			// sql문 작성
			String sql = "select * from jun26_apple order by a_price";
			pstmt = con.prepareStatement(sql);

			// C / U / D : pstmt.executeUpdate()로 실행
			// => 데이터 몇 개 영향을 받았는지
			// R : pstmt.executeQuery()로 실행
			// => select 결과를 ResultSet으로 보냄

			rs = pstmt.executeQuery();
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;

			while (rs.next()) {
				apple = new Apple();
				apple.setA_region(rs.getString("a_region"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_taste(rs.getString("a_taste"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_intro(rs.getString("a_intro"));
				apples.add(apple);
			}
			request.setAttribute("apples", apples);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void regApples(HttpServletRequest request) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = EanDBManager.connect("EanPool");

			// 데이터 입력하거 받아오기
			request.setCharacterEncoding("UTF-8");
			String region = request.getParameter("a_region");
			String color = request.getParameter("a_color");
			String taste = request.getParameter("a_taste");
			int price = Integer.parseInt(request.getParameter("a_price"));
			String intro = request.getParameter("a_intro");

			// <textArea>에서 엔터친거 : \r\n
			// 웹페이지에서 줄바꾸기 : <br>
			String introduce = request.getParameter("a_intro").replace("\r\n", "<br>");

			// sql문 작성
			String sql = "insert into jun26_apple values(?, ?, ?, ?, ?)";
			// DB관련 총괄매니저
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, region);
			pstmt.setString(2, color);
			pstmt.setString(3, taste);
			pstmt.setInt(4, price);
			pstmt.setString(5, intro);

			if (pstmt.executeUpdate() == 1) {
				request.setAttribute("r", "[등록성공]");
				allAppleCount++;
			}

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("r", "[등록실패]");
		} finally {
			EanDBManager.close(con, pstmt, null);
		}

	}

	// 총 데이터가 몇 개인지
	public void countApples() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = EanDBManager.connect("EanPool");
			String sql = "select count(*) from jun26_apple order by a_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			allAppleCount = rs.getInt("count(*)");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			EanDBManager.close(con, pstmt, rs);
		}
	}

	// DB에 데이터가 100개 있다 ? => 해당 페이지 번호에 맞는 데이터만 가져오기

	public void getApples(int pageNo, HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = EanDBManager.connect("EanPool");

			// allAppleCount : 전체 사과 데이터 수
			System.out.println(allAppleCount);
			int applePerPage = 4; // 한 페이지당 보여줄 사과 데이터 수

			// 페이지 갯수 가져오기
			// Math.ceil : 숫자 올림 (반올림 x)
			int pageCount = (int) Math.ceil(allAppleCount / (double) applePerPage);
			request.setAttribute("pageCount", pageCount);
			////////////////////////////////////////////////////////////
			int start = (applePerPage * (pageNo - 1)) + 1;
			int end = (pageNo == pageCount) ? allAppleCount : (start + applePerPage - 1);

			String sql = "select * from (" + "select rownum as rn, a_region, a_color, a_taste, a_price, a_intro "
					+ "from ( " + "select * from jun26_apple order by a_price" + ") " + ") "
					+ "where rn >= ? and rn <= ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;

			while (rs.next()) {
				apple = new Apple();
				apple.setA_region(rs.getString("a_region"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_taste(rs.getString("a_taste"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_intro(rs.getString("a_intro"));
				apples.add(apple);
			}
			request.setAttribute("apples", apples);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			EanDBManager.close(con, pstmt, rs);
		}
	}

	// 상세정보 가져오기 (primary key)
	// 제대로 데이터를 가져왔으면 : true
	// 실패했으면 : false

	public boolean getAppleDetail(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = EanDBManager.connect("EanPool");
			
			String region = request.getParameter("a_region");
			
			String sql = "select * from jun26_apple where a_region = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, region);
			rs = pstmt.executeQuery();	

			while (rs.next()) {
				Apple apple = new Apple();
				apple.setA_region(rs.getString("a_region"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_taste(rs.getString("a_taste"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_intro(rs.getString("a_intro"));
				request.setAttribute("apple", apple);
				return true;
			}
			return false; // ex) 다른 사람이 그 데이터를 지웠으면 : 데이터 없음
		} catch (Exception e) {
			e.printStackTrace();
			return false; // DB서버 상태가 안좋음 (ex : 서버가 안켜짐)
		}finally {
			EanDBManager.close(con, pstmt, rs);
		}
	}
	public boolean updateAppleDetail(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = EanDBManager.connect("EanPool");
			
			request.setCharacterEncoding("UTF-8");
			String region = request.getParameter("a_region");
			String color = request.getParameter("a_color");
			String taste = request.getParameter("a_taste");
			int price = Integer.parseInt(request.getParameter("a_price"));
			String intro = request.getParameter("a_intro");
			
			String sql = "update jun26_apple set a_color = ?, a_taste = ?, a_price = ?, a_intro = ? "
					+"where a_region=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(5, region);
			pstmt.setString(1, color);
			pstmt.setString(2, taste);
			pstmt.setInt(3, price);
			pstmt.setString(4, intro);
		
			if (pstmt.executeUpdate() == 1) {
				request.setAttribute("r", "[수정 성공]");
				return true;
			}
			request.setAttribute("r", "[수정 실패]");
			return false; 
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("r", "[수정 실패]");
			return false; 
		}finally {
			EanDBManager.close(con, pstmt, null);
		}
	}
	
	public void delete(HttpServletRequest request) {
		Connection con =null;
		PreparedStatement pstmt = null;
		
		try {
			con = EanDBManager.connect("EanPool");
			
			String region = request.getParameter("a_region");
			String sql = "delete from jun26_apple where a_region = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, region);
			
			if (pstmt.executeUpdate() == 1) {
				request.setAttribute("r", "[삭제완료]");
				allAppleCount--;
			}else {
				request.setAttribute("r", "[삭제실패]");
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("r", "[삭제실패]");
		}
		EanDBManager.close(con, pstmt, null);
	}
}
