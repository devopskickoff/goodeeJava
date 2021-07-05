package test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		 double num = 0;
		 int count = 0;
		 boolean flag = true;
		 int stop = 0;
		 Scanner sc = new Scanner(System.in);
		 
		 while(flag) {
			 System.out.println("100이하의 자연수를 입력해주세요");
			 num += sc.nextDouble();
			 count++;
			 System.out.println("끝낼까요? 1.예 0.아니오");
			 stop = sc.nextInt();
			 if(stop==1) {
				 System.out.printf("평균은 %.2f\n입니다", num/count);
				 flag = false;
			 }
		 }
	}
}
