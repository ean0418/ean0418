package com.ean.may291.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

// Set 계열
//		가변사이즈
//		중복데이터 자동 삭제
//			같은 데이터 여러번 들어가면 하나만 남김
//		순서가 랜덤//		HashSet, TreeSet, ...
//			=> 실전에서는 그닥 유용하지 않음

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("ㅁㅁ");
		hs.add("ㄴㄴ");
		hs.add("ㅎㅎ");
		hs.add("ㄹㄹ");
		hs.add("ㅎㅎ");
		hs.add("ㄹㄹ");
		System.out.println(hs.size());
		System.out.println("-------------------");
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("----------------------");

		// ArrayList로 데이터를 넣자! => 정수 - 10개 (같은 값이 있도록)
		// 중복 제거해서
		// 내림차순 정렬 출력

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(30);
		al.add(60);
		al.add(70);
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println("--------------------------");

		HashSet<Integer> hs2 = new HashSet<Integer>(al); // set에 list들 담아 중복제거
		for (Integer i : hs2) {
			System.out.println(i);
		}
		System.out.println("--------------");

		al = new ArrayList<Integer>(hs2); // 중복제거 후 다시 list로

		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		al.sort(c);
		for (Integer i : al) {
			System.out.println(i);
		}
	}
}
