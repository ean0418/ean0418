package com.ean.may242.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

// Date.java : 아~주 옛날에 (1900년대) 만들어진 Class
//			Y2K에 관심이 없던 시절...(Year 2000 problem)
//			1900년대 당시에 용량이 적었기 때문에 연도 끝에 2자리만...
//			1970년대 이전의 컴퓨터 : 속도가 느리고, 장치들의 용량이 적었음
//			데이터의양을 아까기 위해서 연도처리를 4byte가 아닌 2byte로 할당 
//			문제가 생김 !
//			1900년, 2000년 끝의 두자리가 00으로 인식해서 통일됨 => 구분이 불가능
//				=> 컴퓨터의 오작동 가능성이 높아짐!

// deprecated
//		세월이 흐르고, 컴퓨터도 발전 => 옛날에 만들어 놓은걸 못쓰겠음...
//		프로그래밍언어도 업데이트가 되어야 하는데
//		없애거나 / 기능을 수정할 계획이 생겨버림
// 		현재 자바버전에서는 OK! / 다음 버전에 없어져도 불만갖지 마라!

// Date : 날짜 / 시간
public class DateMain {
	public static void main(String[] args) {
		System.out.println(LocalDate.now()); // 날짜
		System.out.println(LocalTime.now()); // 시간
		System.out.println(LocalDateTime.now()); // 날짜 시간
		
		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
//		System.out.println(c.get(Calendar.));
//		System.out.println(c.get(Calendar.));
//		System.out.println(c.get(Calendar.));

		// Java : java.util.Date
		// SQL : jave.sql.Date

		// 기본 생성 -> 현재 시간 / 날짜
		Date now = new Date();

		// 현재 시간 날짜를 출력
		System.out.println(now);

		// 연도
		System.out.println(now.getYear() + 1900);

		// 월
		System.out.println(now.getMonth() + 1);

		// 일
		System.out.println(now.getDate());

		// 요일
		System.out.println(now.getDay()); // 0 ~ 6 (일 ~ 토)
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(day[now.getDay()] + "요일");
		System.out.println("============================");
		// Date - 형식 지정 => String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E a hh:mm");

		String s1 = sdf.format(now);
		System.out.println(s1);
		System.out.println("============================");

		// 특정 시간 날짜
		Date d2 = new Date(2014, 12, 28);
		System.out.println(d2);
		System.out.println("============================");

		// String - 형식 지정 -> Date
		try {
			String s2 = "1998/04/18";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			Date d3 = sdf2.parse(s2);
			System.out.println(d3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("============================");
		// 10년전 크리스마스 무슨 요일
		try {
			String s3 = "2014.12.25";
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd");
			Date d4 = sdf3.parse(s3);
			System.out.println(d4);
			
			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String d5 = sdf4.format(d4);
			System.out.println(d5 + "요일");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
