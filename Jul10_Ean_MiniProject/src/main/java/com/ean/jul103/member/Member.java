package com.ean.jul103.member;

public class Member {
	private String ms_id;
	private String ms_pw;
	private String ms_name;
	private String ms_fav_movie;
	private String ms_addr;
	private String ms_photo;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String ms_id, String ms_pw, String ms_name, String ms_fav_movie, String ms_addr, String ms_photo) {
		super();
		this.ms_id = ms_id;
		this.ms_pw = ms_pw;
		this.ms_name = ms_name;
		this.ms_fav_movie = ms_fav_movie;
		this.ms_addr = ms_addr;
		this.ms_photo = ms_photo;
	}

	public String getMs_id() {
		return ms_id;
	}

	public void setMs_id(String ms_id) {
		this.ms_id = ms_id;
	}

	public String getMs_pw() {
		return ms_pw;
	}

	public void setMs_pw(String ms_pw) {
		this.ms_pw = ms_pw;
	}

	public String getMs_name() {
		return ms_name;
	}

	public void setMs_name(String ms_name) {
		this.ms_name = ms_name;
	}

	public String getMs_fav_movie() {
		return ms_fav_movie;
	}

	public void setMs_fav_movie(String ms_fav_movie) {
		this.ms_fav_movie = ms_fav_movie;
	}

	public String getMs_addr() {
		return ms_addr;
	}

	public void setMs_addr(String ms_addr) {
		this.ms_addr = ms_addr;
	}

	public String getMs_photo() {
		return ms_photo;
	}

	public void setMs_photo(String ms_photo) {
		this.ms_photo = ms_photo;
	}
	
}
