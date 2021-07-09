package com.goodee.game;

public class GameData {
	int computer; //��ǻ�Ͱ� ������ ����
	int person;   //����� ������ ����
	int winner;   //�¸��� 1.��ǻ�� ��,2.�����  3.���º�,
	
	//������
	public GameData(int person)
	{
		computer = (int)(Math.random()*3)+1;
		this.person = person;
		winner = whoIsWinner();
	}
	
	//1,2,3  �� ��ȯ�Ѵ�. - ���� �̰���� �Ǵ��Ѵ� 
	int whoIsWinner()
	{
		if( computer == person)
			return 3;  //���º� 
		if( computer ==1 && person==3 ||  computer ==2 && person==1 
				 || computer ==3 && person==2  )
			return 1; //��ǻ�Ͱ� �̱��Ȳ
		
		return 2;
	}
	
	public void output()
	{
		String msg1[]=new String[] {"", "����", "����", "��"};
		String msg2[]=new String[] {"", "��ǻ�ͽ�", "�����", "���º�"};
		
		System.out.printf("��ǻ�� : %s  ���:%s  ��:%s\n", msg1[computer], msg1[person], msg2[winner]);
	}
	
}


















