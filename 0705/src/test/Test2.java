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
			 System.out.println("100������ �ڿ����� �Է����ּ���");
			 num += sc.nextDouble();
			 count++;
			 System.out.println("�������? 1.�� 0.�ƴϿ�");
			 stop = sc.nextInt();
			 if(stop==1) {
				 System.out.printf("����� %.2f\n�Դϴ�", num/count);
				 flag = false;
			 }
		 }
	}
}
