package com.goodee.game;

import java.util.Scanner;

public class Game {
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		String again;
		while(true) {
		System.out.print("1.���� 2.���� 3.�� : ");
		int person=sc.nextInt();
		
		GameData gd = new GameData(person);
		gd.output();
		System.out.println("���? 1.�� 2.�ƴϿ�");
		again = sc.next();
		if(!again.equals("1"))
			break;
		}
	}
}
