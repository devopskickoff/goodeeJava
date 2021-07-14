package com.goodee.classTest;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		this(2021, 1, 1);
		System.out.println("default constructor");
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("parameter int constructor");
	}

	public MyDate(String date) {
		String[] s = date.split("-");
		this.year = Integer.parseInt(s[0]);
		this.month = Integer.parseInt(s[1]);
		this.day = Integer.parseInt(s[2]);
		System.out.println("parameter String constructor");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {

		if (this.month != 2) {
			this.day = day;
			return;
		}

		if (day < 1 || day > 28)
			this.day = 1;
		else
			this.day = day;

	}

	@Override
	public String toString() {
		String s = String.format("%04d-%02d-%02d", year, month, day);
		return s;
	}
}