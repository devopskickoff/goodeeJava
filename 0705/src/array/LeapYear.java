package array;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//for���� �迭�� Ȱ���� ��¥�� �Է¹޾� �� ���� ������ ���° �������� �����ϴ� ���α׷�
		int[] dayArray = new int[] {0,31,0,31,30,31,30,31,31,30,31,30};
		
		int year, month, day,count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("�⵵");
		year = sc.nextInt();
		System.out.println("��");
		month = sc.nextInt();
		System.out.println("��");
		day = sc.nextInt();
		
		if((year%4==0 && year%100 != 0)||year%400==0 ) {
			dayArray[2] = 29;
		} else {
			dayArray[2] = 28;
		}
		for(int i=0;i<month;i++) {
			count += dayArray[i];
		}
		System.out.println(count+day);
		
	}

}
