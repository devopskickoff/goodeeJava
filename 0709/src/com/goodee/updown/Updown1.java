package com.goodee.updown;

import java.util.Scanner;

public class Updown1 {

	public void start() {
		
		int computer;
		int user;
		boolean flag = true;
		
		// while�� �ݺ��Ұ�
		computer = (int) (Math.random() * 10) + 1;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.printf("���ڸ� �־��ּ��� :");
			user = sc.nextInt();
			UpdownData1 ud = new UpdownData1(computer, user);
			ud.output();
			System.out.printf("��� �Ͻðڽ��ϱ�? ��-1 �ƴϿ�2");
			flag = (sc.nextInt()==1)?true:false;
		}
	}

}
