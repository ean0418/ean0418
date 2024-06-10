package com.ean.franc.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ean.db.manager.EanDBManager;
import com.ean.franc.reservation.Reservation;
import com.ean.franc.restaurant.Restaurant;

public class DAO {
	// MVC패턴의 M
	// DAO / DTO 패턴
	// DAO (DATA ACCESS OBJECT)
	// : M 중에서 DB관련한 작업을 전담하는 클래스
	// DTO (DATA TRANSFER / TEMP OBJECT)
	// : DAO의 작업결과를 표현하는 클래스 (Reservation / Restaurant)

	// java.util.Date - 주력 (Spring에서는 이걸 원함)
	// java.sql.Date - JDBC에서는 이걸 원함

	// java.util.Date => java.sql.Date
	// : new Date(클래스명.get날짜관련멤버변수명().getTIME());

	// java.sql.Date => java.util.Date : 알아서 바꿔줌
	// 1. 예약하기
	public static String book(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = EanDBManager.connect();
			String sql = "insert into jun10_reservation " + "values(j_reservation_seq.nextval, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getName());
			pstmt.setDate(2, new Date(rsv.getTime().getTime()));
			pstmt.setString(3, rsv.getPhone());
			pstmt.setString(4, rsv.getLocation());

			if (pstmt.executeUpdate() == 1) {
				return "예약성공";

			}
			return ""; // 문법상 억지로
		} catch (Exception e) {
			e.printStackTrace();
			return "예약실패";
		} finally {
			EanDBManager.close(con, pstmt, null);
		}
	}

	// 2. 매장 등록
	public static String registerRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = EanDBManager.connect();
			String sql = "insert into jun10_restaurant values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rst.getLocation());
			pstmt.setString(2, rst.getOwner());
			pstmt.setInt(3, rst.getSeat());

			if (pstmt.executeUpdate() == 1) {
				return "매장등록 성공";
			}
			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "매장 등록 실패";
		} finally {
			EanDBManager.close(con, pstmt, null);
		}
	}

	// 3. 전체 예약 확인 (예약번호 오름차순 정렬)
	public static ArrayList<Reservation> getAllReserve() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = EanDBManager.connect();
			String sql = "select * from jun10_reservation order by r_no";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();

			Reservation r = null;
			while (rs.next()) {
				r = new Reservation();
				r.setNo(rs.getInt("r_no"));
				r.setName(rs.getString("r_name"));
				r.setTime(rs.getDate("r_time"));
				r.setPhone(rs.getString("r_phone"));
				r.setLocation(rs.getString("r_location"));
				rsvs.add(r);
			}
			return rsvs;
		} catch (Exception e) {
			return null;
		} finally {
			EanDBManager.close(con, pstmt, rs);
		}

	}

	// 4. 전체 매장 확인 (지점명 오름차순 정술)
	public static ArrayList<Restaurant> getAllRest() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = EanDBManager.connect();
			String sql = "select * from jun10_restaurant order by r_location";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			ArrayList<Restaurant> rst = new ArrayList<Restaurant>();

			Restaurant r = null;
			while (rs.next()) {
				r = new Restaurant();
				r.setLocation(rs.getString("r_location"));
				r.setOwner(rs.getString("r_owner"));
				r.setSeat(rs.getInt("r_seat"));
				rst.add(r);
			}
			return rst;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			EanDBManager.close(con, pstmt, rs);
		}
	}

	// 5. 매장 찾기 (입력한 좌석 수 이상을 가지고 있는 매장, 지점명 오름차순 정렬)
	public static ArrayList<Restaurant> findRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = EanDBManager.connect();
			String sql = "select * from jun10_restaurant where r_seat >= ? order by r_location";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rst.getSeat());
			rs = pstmt.executeQuery();

			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>();

			while (rs.next()) {
				rsts.add(new Restaurant(rs.getString("r_location"), rs.getString("r_owner"), rs.getInt("r_seat")));
			}
			return rsts;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		} finally {
			EanDBManager.close(con, pstmt, rs);
		}

	}

	// 6. 예약 찾기 (예약자의 이름으로 찾기, 예약번호 오름차순 정렬)
	public static ArrayList<Reservation> findRsvs(Reservation rsvs) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = EanDBManager.connect();
			String sql = "select * from jun10_reservation where r_name like '%'||?||'%' order by r_no";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsvs.getName());
			rs = pstmt.executeQuery();

			ArrayList<Reservation> rsv = new ArrayList<Reservation>();

			Reservation r = null;
			while (rs.next()) {
				r = new Reservation();
				r.setName(rs.getString("r_name"));
				r.setLocation(rs.getString("r_location"));
				r.setPhone(rs.getString("r_Phone"));
				r.setTime(rs.getDate("r_time"));
				r.setNo(rs.getInt("r_no"));
				rsv.add(r);
			}
			return rsv;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		} finally {
			EanDBManager.close(con, pstmt, rs);
		}
	}

	// 7. 예약정보수정 (예약자의 전화번호 수정하기)
	public static String updateReserve(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = EanDBManager.connect();
			String sql = "update jun10_reservation set r_phone = ? where r_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getPhone());
			pstmt.setInt(2, rsv.getNo());

			if (pstmt.executeUpdate() == 1) {
				return "예약수정 성공";
			}
			return "예약정보 없음";
		} catch (Exception e) {
			// TODO: handle exception
			return "예약 수정 실패";
		} finally {
			EanDBManager.close(con, pstmt, null);
		}
	}

	// 8. 예약취소 (예약 번호로 취소하기)
	public static String deleteReserve(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = EanDBManager.connect();
			String sql = "delete from jun10_reservation where r_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rsv.getNo());

			if (pstmt.executeUpdate() == 1) {
				return "예약취소 성공";
			}
			return "예약정보 없음";
		} catch (Exception e) {
			e.printStackTrace();
			return "예약취소 실패";
		} finally {
			EanDBManager.close(con, pstmt, null);
		}
	}
}