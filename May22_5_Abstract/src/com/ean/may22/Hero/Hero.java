package com.ean.may22.Hero;

public abstract class Hero {
	private String name;
	private int age;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		System.out.println(name);
		System.out.println(age); 
	}
	public abstract void attack();
	public abstract void smoke();
	public abstract void drive();

	
}
