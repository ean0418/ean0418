package com.ean.may242.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// 학생의 ( 이름/ 생년월일(yyyy.MM.dd)/국어/수학/영어)를 입력받아서
	// 학생의 나이, 총점, 평균점수 값을 출력

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("이름/생년월일(yyyy.MM.dd/국어/수학/영어 :");
		String info = k.next();
		String[] info2 = info.split("/");
		String name = info2[0];
		System.out.printf("이름 : %s\n", name);
		try {
			// 생일(나이)
			String bd = info2[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(bd);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd E");
			String birthdayStr = sdf2.format(birthday);
			System.out.printf("생일 : %s\n", birthdayStr);
			
			Date now = new Date();
			SimpleDateFormat yrFmt = new SimpleDateFormat("yyyy");
			String nowYr = yrFmt.format(now);
			String birthdayYr = yrFmt.format(birthday);
			
			int by = Integer.parseInt(birthdayYr);
			int ny = Integer.parseInt(nowYr);
			int age = ny - by;
			System.out.printf("나이 : %d살\n", age);
			System.out.printf("나이 : %d살\n", now.getYear() - birthday.getYear());
			
			int kor = Integer.parseInt(info2[2]);
			int math = Integer.parseInt(info2[3]);
			int eng = Integer.parseInt(info2[4]);
			System.out.printf("국어 : %d점\n", kor);
			System.out.printf("수학 : %d점\n", math);
			System.out.printf("영어 : %d점\n", eng);
			
			int sum = kor + math + eng;
			System.out.printf("총점 : %d점\n", sum);
			
			double avg = (double) sum / 3;
			System.out.printf("평균 : %.2f점\n", avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
