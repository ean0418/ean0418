package com.ean.may22.animal;

public abstract class Animal {
	// 종, 나이
	private String speices;
	private int age;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String speices, int age) {
		super();
		this.speices = speices;
		this.age = age;
	}

	public String getSpeices() {
		return speices;
	}

	public void setSpeices(String speices) {
		this.speices = speices;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}
	public void printInfo() {
		System.out.println(speices);
		System.out.println(age);
	}
	
	// abstract method : 미완성된 메소드 (내용이 없는)
	// 하위클래스에서 반드시!!! 오버라이딩 해야 !!
	
	// abstract 메소드가 하나라도 있으면
	// abstract 클래스 or interface 여야 함!
	
	public abstract void roar();
	
}
