package com.goodee.updown;

import java.util.Scanner;

public class UpdownData1 {
//	직접적 로직
	int computer;
	int user;
	String result;
	
	public UpdownData1(int computer, int user) {
		this.computer = computer;
		this.user = user;
	}
	
	public void upOrDown() {
		if(user==computer) {
			result = "맞춤";
		} else if (user>computer) {
			result =  "DOWN";
		} else {
			result = "UP";
		}
	}
		
	public void output() {
		upOrDown();
		System.out.printf("컴퓨터 : %s 사람 : %s 결과 : %s\n",computer, user, result);
	}
	
}
