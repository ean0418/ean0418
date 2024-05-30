package com.ean.may232.academy;

public class Student  {
	private String name;
	private int age;
	private int num;
	public Student(String name, int age, int num) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
	}
	public void printInfo() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(age);
	}
	
}
