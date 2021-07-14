package com.goodee.classTest;

public class Person {
	private String name="";
	private int age=31;
	private MyDate birthday = new MyDate(1991,3,4);
	
	public Person() {
		
	}
	
	public Person(String name, int age, MyDate birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
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

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	
	
	 
}
