package array;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//for문과 배열을 활용해 날짜를 입력받아 그 날이 한해의 몇번째 일인지를 결정하는 프로그램
		int[] dayArray = new int[] {0,31,0,31,30,31,30,31,31,30,31,30};
		
		int year, month, day,count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("년도");
		year = sc.nextInt();
		System.out.println("월");
		month = sc.nextInt();
		System.out.println("일");
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
