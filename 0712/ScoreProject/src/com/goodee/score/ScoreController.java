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
	
	//과목명, 과목마다 만점이 다르니까 하나 만들어서 다목적으로 쓰려면 매개변수가 
	//두개가 필요하다 과목명, 과목별만점 
	public int getScore(String subject, int limit)
	{
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print(subject + " : ");
		score = sc.nextInt();
		while(score<0 || score>limit)
		{
			System.out.printf("입력범위를 초과합니다. 0~%d 사이의 값만 입력하세요\n", limit);
			System.out.print(subject + " : ");
			score = sc.nextInt();
		}
		
		return score;
	}
	
	public void append()
	{
		//데이터 입력받아서 dto 만들어서 list 에 추가하기 
		ScoreDto dto = new ScoreDto();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		dto.setName(sc.next());
		dto.setWrite( getScore("필기", 400)      ); //함수 안에서 함수 호출하기 내부함수가 먼저 실행됨 
		dto.setWord(  getScore("워드", 200)      );
		dto.setPpt(   getScore("프리젠테이션", 200));
		dto.setExcel( getScore("스프레드쉬트", 200));
		
		dao.getList().add(dto);
	}

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
					System.out.println("프로그램을 종료합니다.");
					//break; //switch문만 빠져나감 - while문이 종료를 하지 않는다 
					return; //함수를 종료한다 
			}
		}
	}
	
	//검색, 수정, 삭제 특정 데이터의 위치를 찾아서 출력, 수정, 삭제 
	//이름으로 검색하면 list에서 특정 위치를 찾아서 반환하는 함수를 만들자
	//못찾으면 보통 자바함수들은 오류가 발생하면 -1을 반환한다
	//이름을 입력으로 가져가서, 위치값을 반환해야 한다  int 
	int find(String name)
	{
		for(int i=0; i<dao.getList().size(); i++)
		{
			ScoreDto dto = dao.getList().get(i); //list에서 데이터 하나를 가져온다  
			if(dto.getName().equals(name))
				return i; //해당 데이터를 찾으면 여기서 함수가 종료된다. 
		}
		
		return -1; //for문을 끝나도록 return 이 안됐다면 데이터를 못찾았다는 의미이다
		//함수의 리턴형이 int일 경우에 오류 발생히 보통 -1을 반환한다 
		//문법적오류, 실행오류, 함수에서 결과를 못내는 오류도 있다
	}
	
	public void search()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		int pos = find(name); //위치값을 반환받는다 
		if(pos ==-1)
		{
			System.out.println(name + "을 찾을 수 없습니다.");
			return; //문제 생겼으면 함수를 종료하자 
		}
		
		ScoreDto dto = dao.getList().get(pos);
		dto.output();
		//dao.getList().remove(pos);
	}
	
	public void modify()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		int pos = find(name); //위치값을 반환받는다 
		if(pos ==-1)
		{
			System.out.println(name + "을 찾을 수 없습니다.");
			return; //문제 생겼으면 함수를 종료하자 
		}
		
		ScoreDto dto = dao.getList().get(pos);//새로만드는게 아니라 이전객체를 덮어쓴다
	
		System.out.print("이름 : ");
		dto.setName(sc.next());
		dto.setWrite( getScore("필기", 400)      ); //함수 안에서 함수 호출하기 내부함수가 먼저 실행됨 
		dto.setWord(  getScore("워드", 200)      );
		dto.setPpt(   getScore("프리젠테이션", 200));
		dto.setExcel( getScore("스프레드쉬트", 200));
	}
	
	public void delete()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		int pos = find(name); //위치값을 반환받는다 
		if(pos ==-1)
		{
			System.out.println(name + "을 찾을 수 없습니다.");
			return; //문제 생겼으면 함수를 종료하자 
		}
		
		ScoreDto dto = dao.getList().get(pos);
		dao.getList().remove(pos);
		System.out.println("삭제되었습니다.");
	}
	
	
}


























