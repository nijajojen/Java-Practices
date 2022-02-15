package com.example.demo.pojo;

import java.util.Date;

public class User {
	private Integer Id;
	private String name;
	private String phoneNo;
	private Date dob;
	private String username;
	private String password;
	
	public Integer getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public Date getDob() {
		return dob;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
