package com.ean.may22.Hero;

import com.ean.may22.drive.Drive;
import com.ean.may22.smoke.Smoke;

public abstract class Ironman extends Hero implements Smoke, Drive {

	int property;

	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, int property) {
		super(name, age);
		this.property = property;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(property);
	}

	@Override
	public void smoke() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("ddd");
	}

}
