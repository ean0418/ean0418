package com.ean.may231.friend;

public class Friend {
	 String name;
	 int age;
	 String nickname;
	 
	 private static final Friend FRIEND = new Friend("안녕",3	, "바보");

	public static Friend getFriend() {
		return FRIEND;
	}

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name, int age, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
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
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickname);
	}
	
}
