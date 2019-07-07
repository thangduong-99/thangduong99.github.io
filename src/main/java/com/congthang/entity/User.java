package com.congthang.entity;

public class User {
	private int id;
	private String userName;
	private String pass;
	public User(int id, String userName, String pass) {
		super();
		this.id = id;
		this.userName = userName;
		this.pass = pass;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
