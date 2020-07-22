package com.hf.test07;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private int age;
	private char gender;
	private String address;
	
	public User(String name, String password, int age, char gender, String address) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public User(String name, String password, int age, char gender) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}
	public User(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	
}
