package whileTest;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		/*
		���� : 4
		���� : 5
		���� : -4
		
		���� 9 ����� 4.5 
		*/
		int num, sum, cnt;
		Scanner sc = new Scanner(System.in);
		sum=0;
		cnt=0;
		
		System.out.print("���� : ");
		num = sc.nextInt();
		while( num>=0 )
		{
			sum+=num;
			cnt++;
			
			System.out.print("���� : ");
			num = sc.nextInt();
		}
		
		System.out.printf("�հ� %d   ��� %d\n", sum, sum/cnt);
		
	}
}
