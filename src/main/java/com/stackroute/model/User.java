package com.stackroute.model;

public class User {
	private int code;
	private String uname;
	private String city;
	private String pwd;
	
	public User() {
		
	}

	public User(int code, String uname, String city, String pwd) {
		super();
		this.code = code;
		this.uname = uname;
		this.city = city;
		this.pwd = pwd;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [code=" + code + ", uname=" + uname + ", city=" + city + ", pwd=" + pwd + "]";
	}
}
