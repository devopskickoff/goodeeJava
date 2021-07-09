package com.goodee.updown;

import java.util.Scanner;

public class Updown1 {

	public void start() {
		
		int computer;
		int user;
		boolean flag = true;
		
		// while문 반복할곳
		computer = (int) (Math.random() * 10) + 1;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.printf("숫자를 넣어주세요 :");
			user = sc.nextInt();
			UpdownData1 ud = new UpdownData1(computer, user);
			ud.output();
			System.out.printf("계속 하시겠습니까? 예-1 아니오2");
			flag = (sc.nextInt()==1)?true:false;
		}
	}

}
