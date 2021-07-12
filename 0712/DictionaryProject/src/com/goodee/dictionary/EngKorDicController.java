package com.goodee.dictionary;

import java.util.List;
import java.util.Scanner;

public class EngKorDicController {
	EngKorDicDao dao = new EngKorDicDao();
	
	//�޴��� ��� �Լ��� ���� ������ 
	public void menuDisplay()
	{
		System.out.println("----------");
		System.out.println("   �޴�    ");
		System.out.println("----------");
		System.out.println("1.��ü���");
		System.out.println("2.�˻�   ");
		System.out.println("3.�Է�   ");
		System.out.println("4.����   ");
		System.out.println("5.����   ");
		System.out.println("0.����   ");
	}
	
	public void start()
	{
		int sel;
		Scanner sc = new Scanner(System.in);
		while(true) //���ѷ���
		{
			menuDisplay();
			System.out.print("���� : ");
			sel = sc.nextInt();
			switch(sel)
			{
			case 1:	output(); break;
			case 2: search(); break;
			case 3: append(); break;
			case 4: modify(); break;
			case 5: delete(); break;
			case 0: 
					System.out.println("���α׷��� �����մϴ�.");
					//break; //switch���� �������� - while���� ���Ḧ ���� �ʴ´� 
					return; //�Լ��� �����Ѵ� 
			}
		}
	}
	
	void output()
	{
		List<EngKorDict> list = dao.getList();
		for(int i=0; i<list.size(); i++)
		{
			EngKorDict dto = list.get(i);
			System.out.printf("%s  ===> %s\n", dto.getEng(), dto.getKor());
		}
	}
	
	int find(String key)
	{
		List<EngKorDict> list = dao.getList();
		for(int i=0; i<list.size(); i++)
		{
			//���ܾ� �ѱ۷ε� ã�� �� �ְ�
			if(list.get(i).getEng().equals(key) || list.get(i).getKor().equals(key))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	void search()
	{
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� �ܾ� : ");
		key = sc.next(); 
		int pos = find(key);
		if( pos == -1)
		{
			System.out.println("ã���ô� �ܾ �����ϴ�.");
			return;
		}
		System.out.println("******* ã���� ********");
		
		EngKorDict dict = dao.getList().get(pos);
		System.out.printf("%s ===> %s\n", dict.getEng(), dict.getKor());
	}
	
	void append()
	{
		Scanner sc = new Scanner(System.in);
		
		String eng, kor;
		System.out.print("���ܾ� : ");
		eng = sc.next();
		System.out.print("�ѱ� : ");
		kor = sc.next();
		
		if( find(eng)!=-1)
		{
			System.out.println("�̹� �ִ� �ܾ��Դϴ�.");
			return;
		}
		
		EngKorDict dict = new EngKorDict(eng, kor);
		dao.insert(dict);
	}
	
	void  modify()
	{
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� �ܾ� : ");
		key = sc.next(); 
		int pos = find(key);
		if( pos == -1)
		{
			System.out.println("ã���ô� �ܾ �����ϴ�.");
			return;
		}
		System.out.println("******* ã���� ********");
		
		EngKorDict dict = dao.getList().get(pos);
		System.out.print("�ܾ� : ");
		dict.setEng(sc.next());
		System.out.print("�� :");
		dict.setKor(sc.next());
	}
	
	void  delete()
	{
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� �ܾ� : ");
		key = sc.next(); 
		int pos = find(key);
		if( pos == -1)
		{
			System.out.println("ã���ô� �ܾ �����ϴ�.");
			return;
		}
		dao.getList().remove(pos);
		System.out.println("******* �������� ********");
	}
}

/*
 * �ּҷ� ����� (�̸�, ��ȭ��ȣ, �̸���) 
 */


