package whileTest;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		/*
		정수 : 4
		정수 : 5
		정수 : -4
		
		합은 9 평균은 4.5 
		*/
		int num, sum, cnt;
		Scanner sc = new Scanner(System.in);
		sum=0;
		cnt=0;
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		while( num>=0 )
		{
			sum+=num;
			cnt++;
			
			System.out.print("정수 : ");
			num = sc.nextInt();
		}
		
		System.out.printf("합계 %d   평균 %d\n", sum, sum/cnt);
		
	}
}
