package com.ean.may291.main;

import java.util.ArrayList;
import java.util.Scanner;

public class CMain2 {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("a", 30, 20, 90));
		students.add(new Student("b", 40, 80, 60));
		students.add(new Student("c", 20, 40, 80));
		students.add(new Student("d", 80, 30, 100));
		
		Scanner k = new Scanner(System.in);
		System.out.print("번호 : ");
		int num = k.nextInt();
		
		// 해당 번호 학생의 전체 정보가 출력되게
		students.get(num - 1).printInfo();

	}
}
