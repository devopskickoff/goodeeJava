package com.goodee.updown;

import java.util.Scanner;

public class UpdownData1 {
//	������ ����
	int computer;
	int user;
	String result;
	
	public UpdownData1(int computer, int user) {
		this.computer = computer;
		this.user = user;
	}
	
	public void upOrDown() {
		if(user==computer) {
			result = "����";
		} else if (user>computer) {
			result =  "DOWN";
		} else {
			result = "UP";
		}
	}
		
	public void output() {
		upOrDown();
		System.out.printf("��ǻ�� : %s ��� : %s ��� : %s\n",computer, user, result);
	}
	
}
