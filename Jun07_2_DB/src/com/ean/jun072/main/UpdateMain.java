package com.ean.jun072.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateMain {
	public static void main(String[] args) {
		// 매장명입력 => 그 단어를 포함하는 모든 매장의 상품을 20%할인된 가격으로 바꾸기!
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.9:1521:xe";
			con = DriverManager.getConnection(addr, "hjs980418", "0418");

			Scanner k = new Scanner(System.in);
			System.out.print("매장명 : ");
			String location = k.next();
			
			// 문제점 : 여기는 자바의 영역이기 때문에 !
			// % (formatting) -> %?% => X !
			String sql = "update jun07_product " + "set p_price = p_price * 0.8 "
					+ " where p_m_no in (select m_no from jun07_market "
					+"where m_location like '%'||?||'%' "
					+ ")";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			if (pstmt.executeUpdate() >= 1) {
				System.out.println("success");
			} else {
				System.out.println("그런 매장 없어");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
