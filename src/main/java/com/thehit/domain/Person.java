package com.thehit.domain;

public class Person {

	private String first_name;
	private String last_name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String first_name, String last_name, int age){
		setFirst_name(first_name);
		setLast_name(last_name);
		setAge(age);
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
