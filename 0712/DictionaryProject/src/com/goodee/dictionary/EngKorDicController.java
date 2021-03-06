package com.goodee.dictionary;

import java.util.List;
import java.util.Scanner;

public class EngKorDicController {
	EngKorDicDao dao = new EngKorDicDao();
	
	//메뉴가 길면 함수를 따로 만들자 
	public void menuDisplay()
	{
		System.out.println("----------");
		System.out.println("   메뉴    ");
		System.out.println("----------");
		System.out.println("1.전체출력");
		System.out.println("2.검색   ");
		System.out.println("3.입력   ");
		System.out.println("4.수정   ");
		System.out.println("5.삭제   ");
		System.out.println("0.종료   ");
	}
	
	public void start()
	{
		int sel;
		Scanner sc = new Scanner(System.in);
		while(true) //무한루프
		{
			menuDisplay();
			System.out.print("선택 : ");
			sel = sc.nextInt();
			switch(sel)
			{
			case 1:	output(); break;
			case 2: search(); break;
			case 3: append(); break;
			case 4: modify(); break;
			case 5: delete(); break;
			case 0: 
					System.out.println("프로그램을 종료합니다.");
					//break; //switch문만 빠져나감 - while문이 종료를 하지 않는다 
					return; //함수를 종료한다 
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
			//영단어 한글로도 찾을 수 있고
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
		System.out.print("찾을 단어 : ");
		key = sc.next(); 
		int pos = find(key);
		if( pos == -1)
		{
			System.out.println("찾으시는 단어가 없습니다.");
			return;
		}
		System.out.println("******* 찾았음 ********");
		
		EngKorDict dict = dao.getList().get(pos);
		System.out.printf("%s ===> %s\n", dict.getEng(), dict.getKor());
	}
	
	void append()
	{
		Scanner sc = new Scanner(System.in);
		
		String eng, kor;
		System.out.print("영단어 : ");
		eng = sc.next();
		System.out.print("한글 : ");
		kor = sc.next();
		
		if( find(eng)!=-1)
		{
			System.out.println("이미 있는 단어입니다.");
			return;
		}
		
		EngKorDict dict = new EngKorDict(eng, kor);
		dao.insert(dict);
	}
	
	void  modify()
	{
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 단어 : ");
		key = sc.next(); 
		int pos = find(key);
		if( pos == -1)
		{
			System.out.println("찾으시는 단어가 없습니다.");
			return;
		}
		System.out.println("******* 찾았음 ********");
		
		EngKorDict dict = dao.getList().get(pos);
		System.out.print("단어 : ");
		dict.setEng(sc.next());
		System.out.print("뜻 :");
		dict.setKor(sc.next());
	}
	
	void  delete()
	{
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 단어 : ");
		key = sc.next(); 
		int pos = find(key);
		if( pos == -1)
		{
			System.out.println("찾으시는 단어가 없습니다.");
			return;
		}
		dao.getList().remove(pos);
		System.out.println("******* 삭제성공 ********");
	}
}

/*
 * 주소록 만들기 (이름, 전화번호, 이메일) 
 */



