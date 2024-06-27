package com.ean.jun261.apple;

public class Apple {
	// 약속 ! 
	//	멤버변수명 = DB컬럼명 = 요청파라미터명
	private String a_region;
	private String a_color;
	private String a_taste;
	private int a_price;
	private String a_intro;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(String a_region, String a_color, String a_taste, int a_price, String a_intro) {
		super();
		this.a_region = a_region;
		this.a_color = a_color;
		this.a_taste = a_taste;
		this.a_price = a_price;
		this.a_intro = a_intro;
	}

	public String getA_region() {
		return a_region;
	}

	public void setA_region(String a_region) {
		this.a_region = a_region;
	}

	public String getA_color() {
		return a_color;
	}

	public void setA_color(String a_color) {
		this.a_color = a_color;
	}

	public String getA_taste() {
		return a_taste;
	}

	public void setA_taste(String a_taste) {
		this.a_taste = a_taste;
	}

	public int getA_price() {
		return a_price;
	}

	public void setA_price(int a_price) {
		this.a_price = a_price;
	}

	public String getA_intro() {
		return a_intro;
	}

	public void setA_intro(String a_intro) {
		this.a_intro = a_intro;
	}
	
}
