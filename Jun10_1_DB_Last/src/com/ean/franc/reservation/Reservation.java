package com.ean.franc.reservation;

import java.util.Date;

// DTO, VO, JavaBean

public class Reservation {

	private int no;
	private String name;
	private Date time;
	private String phone;
	private String location;

	public Reservation() {

	}

	public Reservation(int no, String name, Date time, String phone, String location) {
		super();
		this.no = no;
		this.name = name;
		this.time = time;
		this.phone = phone;
		this.location = location;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}