package com.ean.franc.main;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.ean.franc.reservation.Reservation;
import com.ean.franc.restaurant.Restaurant;

public class ConsoleScreen {
	// 사용자가 콘솔을 볼 수 있거나, 콘솔에 입력할 수 있게 (MVC의 V)
	// 아래 메뉴를 볼 수 있는 기능도 있었으면 !
	public static int showMainMenu() {
		System.out.println(
				"==================================================================================================================");
		System.out.println(
				"1. 예약하기 | 2. 매장등록 | 3. 전체 예약 확인 | 4. 전체 매장 조회 | 5. 매장 찾기 | 6. 예약 찾기 | 7. 예약 정보 수정 | 8. 예약 취소 | 9. 종료");
		System.out.println(
				"==================================================================================================================");
		Scanner k = new Scanner(System.in);
		System.out.print("번호입력 : ");
		return k.nextInt();
	}
	
	public static void printResult(String result) {
		System.out.println(result);
	}
	// 1. 예약하기 (직접 입력, 날짜는 연-월-일/시:분)
	public static Reservation showRsvMenu() throws ParseException {
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : \t");
		String name = k.next();
		
		System.out.print("예약 날짜(YYYY-MM-DD/HH:mm : \t");
		String time = k.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH:mm");
		java.util.Date time2 = sdf.parse(time);
		
		System.out.print("폰번호 : \t");
		String phoneNum = k.next();
		
		System.out.print("예약지역 : \t");
		String location = k.next();
		
		Reservation r = new Reservation(0, name, time2, phoneNum, location);
		return r;
	}
	


		// 2. 매장등록 (지점명, 지점장, 좌석수)
	public static Restaurant showRstMenu() {
		Scanner k = new Scanner(System.in);
		
		System.out.print("지점명 : \t");
		String location = k.next();
		
		System.out.print("지점장 : \t");
		String owner = k.next();
		
		System.out.print("좌석수 : \t");
		int seat = k.nextInt();
		
		return new Restaurant(location, owner, seat);
	}
		
			
		// 3. 전체 예약 확인 (날짜는 연-월-일 요일 오전/오후 시:분)
		public static void showRsvResultMenu(ArrayList<Reservation> rsvs) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm");
			for (Reservation r : rsvs) {
				System.out.printf("%d)", r.getNo());
				System.out.printf("[%s -", r.getName());
				System.out.printf("%s]", r.getPhone());
				System.out.printf(r.getLocation() +"-");
				System.out.println(sdf.format(r.getTime()));
			}
			
		}
		// 4. 전체 매장 조회 (위치(좌석 수) - 사장님 이름 의 형식)
		public static void showRstResultMenu(ArrayList<Restaurant> rst) {
			for (Restaurant r : rst) {
				System.out.printf("%s (%d석) - [%s] \r\n", r.getLocation(),r.getSeat(),r.getOwner());
			}
		}
		// 5. 매장 찾기 (최소 좌석 수 입력 => 좌석 수 이상의 매장의 정보를 출력)
		public static Restaurant showFindRstMenu() {
			Scanner k = new Scanner(System.in);
			System.out.print("최소 좌석 수 : ");
			int seat = k.nextInt();
			return new Restaurant(null, null, seat);
		}
		// 6. 예약 찾기 (예약자 이름)
		public static Reservation showfindRsvMenu() {
			Scanner k = new Scanner(System.in);
			System.out.print("예약자 : ");
			String name = k.next();
			return new Reservation(0, name, null, null, null);
		}
		// 7. 예약 정보 수정 (예약번호를 입력하면, 연락처를 변경)
		public static Reservation updateRsvMenu() {
			Scanner k = new Scanner(System.in);
			System.out.print("예약번호 입력 : ");
			int no = k.nextInt();
			System.out.print("연락처 변경 : ");
			String phone = k.next();
			return new Reservation(no, null, null, phone, null);
		}
		// 8. 예약 취소 (예약번호를 취소)
		public static Reservation showDeleteRsvMenu() {
			Scanner k = new Scanner(System.in);
			System.out.print("예약번호 : ");
			int no = k.nextInt();
			return new Reservation(no, null, null, null, null);			
		}
		// 9. 종료
		
		
	
	}
