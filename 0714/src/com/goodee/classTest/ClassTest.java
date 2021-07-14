package com.goodee.classTest;

public class ClassTest {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.setMonth(2);
		d1.setDay(31);
		MyDate d2 = new MyDate(2020,1,2);
		MyDate d3 = new MyDate("2020-1-1");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
