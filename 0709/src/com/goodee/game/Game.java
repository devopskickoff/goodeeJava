package com.goodee.game;

import java.util.Scanner;

public class Game {
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		String again;
		while(true) {
		System.out.print("1.가위 2.바위 3.보 : ");
		int person=sc.nextInt();
		
		GameData gd = new GameData(person);
		gd.output();
		System.out.println("계속? 1.네 2.아니오");
		again = sc.next();
		if(!again.equals("1"))
			break;
		}
	}
}
