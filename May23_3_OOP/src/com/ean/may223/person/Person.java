package com.ean.may223.person;

import com.ean.may223.ironman.Ironman;

public abstract class Person extends Ironman {
	private String name;
	private Ironman hero;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pick(Ironman i) {
		hero = i;
		System.out.println("픽");
	}

	public void help() {
		hero.attack();
	}
}
