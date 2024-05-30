package com.ean.may291.main;

import java.util.HashMap;
import java.util.Scanner;

public class CMain3 {
	public static void main(String[] args) {
		// 학생의 이름을 입력했을 때
		// 그 학생의 전체 정보를 출력하고 싶음
		Scanner k = new Scanner(System.in);
		System.out.print("입력:");
		String name = k.next();
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("a", new Student("a", 30, 20, 90));
		students.put("b", new Student("b", 40, 80, 60));
		students.put("c",new Student("c", 20, 40, 80));
		students.put("d",new Student("d", 80, 30, 100));
		
		// 입력한 학생이름의 전체 정보를 출력
		students.get(name).printInfo();
	}
}
