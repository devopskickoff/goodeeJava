package score2;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManager {
	//배열을 쓰지 않고  ArrayList - 배열과 유사한데 데이트를 추가하거나 수정하거나 삭제할 수 있는 
	//클래스라 사용이 편하다 
	//가방이 책가방, 옷가방, 필통...  내가 이 클래스에 뭘 담을 지를 알려야 한다 
	//ArrayList<String> sList = new ArrayList<String>();
	ArrayList<ScoreData> list = new ArrayList<ScoreData>();

	//생성자를 만들어서 데이터 몇개를 미리 넣고 시작하자 
	public ScoreManager() {
		super(); //상속을 받으면 부모 생성자 호출, 자바는 Object 를 무조건 상속받는다 
		         //Object 는 자바가 제공  
		
		list.add( new ScoreData("홍길동", 300, 200, 150, 170));
		list.add( new ScoreData("김다운", 340, 200, 150, 170));
		list.add( new ScoreData("박진솔", 200, 150, 150, 180));
		list.add( new ScoreData("최지연", 340, 170, 150, 190));
		list.add( new ScoreData("권나영", 100, 180, 150, 140));
	}
	
	public void output()
	{
		for(int i=0; i<list.size(); i++)
		{
			ScoreData sd = list.get(i);
			System.out.printf("%s %d %d %d %d %d %s\n", sd.getName(), 
					sd.getWrite(), sd.getWord(), sd.getExcel(), sd.getPpt(),
					sd.getTotal(), sd.getGrade());
		}
	}
	
	public void process()
	{
		//총점 , 800이상 A, 600이상 B, 400이상 C, D등급 재시험요망
		for(int i=0; i<list.size(); i++)
		{
			ScoreData sd = list.get(i);
			sd.process();
		}
	}
	
	//필기는 0~400, 워드, 파워포인트, 엑셀  0~200  범위를 벗어나는값을 에러메시지 뿌리기 
	public void append()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name=sc.next();
		
		int write = getScore("필기", 400);
		int word  = getScore("워드", 200);
		int ppt   = getScore("프리젠트", 200);
		int excel = getScore("스프레드", 200);
		
		ScoreData sd = new ScoreData(name, write, word,  ppt, excel);
		list.add(sd);
	}
	//과목명과 과목별 범위를 주면 그 범위값만 받아서 반환하게 함수를 구성함 
	int getScore(String subject, int limit)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + " : ");
		int score = sc.nextInt();
		while(score<0 || score>limit)
		{
			System.out.printf("입력범위를 초과합니다.(0~%d)를 입력하세요\n",limit);
			System.out.print(subject + " : ");
			score = sc.nextInt();	
		}
		
		return score;
	}
}

















