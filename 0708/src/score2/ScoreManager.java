package score2;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManager {
	//�迭�� ���� �ʰ�  ArrayList - �迭�� �����ѵ� ����Ʈ�� �߰��ϰų� �����ϰų� ������ �� �ִ� 
	//Ŭ������ ����� ���ϴ� 
	//������ å����, �ʰ���, ����...  ���� �� Ŭ������ �� ���� ���� �˷��� �Ѵ� 
	//ArrayList<String> sList = new ArrayList<String>();
	ArrayList<ScoreData> list = new ArrayList<ScoreData>();

	//�����ڸ� ���� ������ ��� �̸� �ְ� �������� 
	public ScoreManager() {
		super(); //����� ������ �θ� ������ ȣ��, �ڹٴ� Object �� ������ ��ӹ޴´� 
		         //Object �� �ڹٰ� ����  
		
		list.add( new ScoreData("ȫ�浿", 300, 200, 150, 170));
		list.add( new ScoreData("��ٿ�", 340, 200, 150, 170));
		list.add( new ScoreData("������", 200, 150, 150, 180));
		list.add( new ScoreData("������", 340, 170, 150, 190));
		list.add( new ScoreData("�ǳ���", 100, 180, 150, 140));
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
		//���� , 800�̻� A, 600�̻� B, 400�̻� C, D��� �������
		for(int i=0; i<list.size(); i++)
		{
			ScoreData sd = list.get(i);
			sd.process();
		}
	}
	
	//�ʱ�� 0~400, ����, �Ŀ�����Ʈ, ����  0~200  ������ ����°��� �����޽��� �Ѹ��� 
	public void append()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name=sc.next();
		
		int write = getScore("�ʱ�", 400);
		int word  = getScore("����", 200);
		int ppt   = getScore("������Ʈ", 200);
		int excel = getScore("��������", 200);
		
		ScoreData sd = new ScoreData(name, write, word,  ppt, excel);
		list.add(sd);
	}
	//������ ���� ������ �ָ� �� �������� �޾Ƽ� ��ȯ�ϰ� �Լ��� ������ 
	int getScore(String subject, int limit)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + " : ");
		int score = sc.nextInt();
		while(score<0 || score>limit)
		{
			System.out.printf("�Է¹����� �ʰ��մϴ�.(0~%d)�� �Է��ϼ���\n",limit);
			System.out.print(subject + " : ");
			score = sc.nextInt();	
		}
		
		return score;
	}
}

















