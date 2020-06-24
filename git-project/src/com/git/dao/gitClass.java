package com.git.dao;

public class gitClass {

	private int id;
	private int age;
	
	public int getId() {
		if(true)
			return id+10;
		else
			return id+100;

	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
