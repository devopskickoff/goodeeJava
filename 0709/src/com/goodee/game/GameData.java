package com.goodee.game;

public class GameData {
	int computer; //컴퓨터가 생각한 숫자
	int person;   //사람이 생각한 숫자
	int winner;   //승리자 1.컴퓨터 승,2.사람승  3.무승부,
	
	//생성자
	public GameData(int person)
	{
		computer = (int)(Math.random()*3)+1;
		this.person = person;
		winner = whoIsWinner();
	}
	
	//1,2,3  을 반환한다. - 누가 이겼는지 판단한다 
	int whoIsWinner()
	{
		if( computer == person)
			return 3;  //무승부 
		if( computer ==1 && person==3 ||  computer ==2 && person==1 
				 || computer ==3 && person==2  )
			return 1; //컴퓨터가 이긴상황
		
		return 2;
	}
	
	public void output()
	{
		String msg1[]=new String[] {"", "가위", "바위", "보"};
		String msg2[]=new String[] {"", "컴퓨터승", "사람승", "무승부"};
		
		System.out.printf("컴퓨터 : %s  사람:%s  승:%s\n", msg1[computer], msg1[person], msg2[winner]);
	}
	
}


















