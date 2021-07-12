package com.goodee.score;

import java.util.List;
import java.util.Scanner;

public class ScoreController {
	ScoreDao dao=new ScoreDao();
	
	public void output()
	{
		List<ScoreDto> list = dao.getList();
		for(int i=0; i<list.size(); i++)
		{
			list.get(i).process();
			list.get(i).output();
		}
	}
	
	//�����, ���񸶴� ������ �ٸ��ϱ� �ϳ� ���� �ٸ������� ������ �Ű������� 
	//�ΰ��� �ʿ��ϴ� �����, ���񺰸��� 
	public int getScore(String subject, int limit)
	{
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print(subject + " : ");
		score = sc.nextInt();
		while(score<0 || score>limit)
		{
			System.out.printf("�Է¹����� �ʰ��մϴ�. 0~%d ������ ���� �Է��ϼ���\n", limit);
			System.out.print(subject + " : ");
			score = sc.nextInt();
		}
		
		return score;
	}
	
	public void append()
	{
		//������ �Է¹޾Ƽ� dto ���� list �� �߰��ϱ� 
		ScoreDto dto = new ScoreDto();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		dto.setName(sc.next());
		dto.setWrite( getScore("�ʱ�", 400)      ); //�Լ� �ȿ��� �Լ� ȣ���ϱ� �����Լ��� ���� ����� 
		dto.setWord(  getScore("����", 200)      );
		dto.setPpt(   getScore("���������̼�", 200));
		dto.setExcel( getScore("�������彬Ʈ", 200));
		
		dao.getList().add(dto);
	}

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
			case 1:
					output(); break;
			case 2:
					search(); break;
			case 3: 
					append(); break;
			case 4: 
					modify(); break;
			case 5: 
					delete(); break;
			case 0: 
					System.out.println("���α׷��� �����մϴ�.");
					//break; //switch���� �������� - while���� ���Ḧ ���� �ʴ´� 
					return; //�Լ��� �����Ѵ� 
			}
		}
	}
	
	//�˻�, ����, ���� Ư�� �������� ��ġ�� ã�Ƽ� ���, ����, ���� 
	//�̸����� �˻��ϸ� list���� Ư�� ��ġ�� ã�Ƽ� ��ȯ�ϴ� �Լ��� ������
	//��ã���� ���� �ڹ��Լ����� ������ �߻��ϸ� -1�� ��ȯ�Ѵ�
	//�̸��� �Է����� ��������, ��ġ���� ��ȯ�ؾ� �Ѵ�  int 
	int find(String name)
	{
		for(int i=0; i<dao.getList().size(); i++)
		{
			ScoreDto dto = dao.getList().get(i); //list���� ������ �ϳ��� �����´�  
			if(dto.getName().equals(name))
				return i; //�ش� �����͸� ã���� ���⼭ �Լ��� ����ȴ�. 
		}
		
		return -1; //for���� �������� return �� �ȵƴٸ� �����͸� ��ã�Ҵٴ� �ǹ��̴�
		//�Լ��� �������� int�� ��쿡 ���� �߻��� ���� -1�� ��ȯ�Ѵ� 
		//����������, �������, �Լ����� ����� ������ ������ �ִ�
	}
	
	public void search()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		int pos = find(name); //��ġ���� ��ȯ�޴´� 
		if(pos ==-1)
		{
			System.out.println(name + "�� ã�� �� �����ϴ�.");
			return; //���� �������� �Լ��� �������� 
		}
		
		ScoreDto dto = dao.getList().get(pos);
		dto.output();
		//dao.getList().remove(pos);
	}
	
	public void modify()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		int pos = find(name); //��ġ���� ��ȯ�޴´� 
		if(pos ==-1)
		{
			System.out.println(name + "�� ã�� �� �����ϴ�.");
			return; //���� �������� �Լ��� �������� 
		}
		
		ScoreDto dto = dao.getList().get(pos);//���θ���°� �ƴ϶� ������ü�� �����
	
		System.out.print("�̸� : ");
		dto.setName(sc.next());
		dto.setWrite( getScore("�ʱ�", 400)      ); //�Լ� �ȿ��� �Լ� ȣ���ϱ� �����Լ��� ���� ����� 
		dto.setWord(  getScore("����", 200)      );
		dto.setPpt(   getScore("���������̼�", 200));
		dto.setExcel( getScore("�������彬Ʈ", 200));
	}
	
	public void delete()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		int pos = find(name); //��ġ���� ��ȯ�޴´� 
		if(pos ==-1)
		{
			System.out.println(name + "�� ã�� �� �����ϴ�.");
			return; //���� �������� �Լ��� �������� 
		}
		
		ScoreDto dto = dao.getList().get(pos);
		dao.getList().remove(pos);
		System.out.println("�����Ǿ����ϴ�.");
	}
	
	
}

























