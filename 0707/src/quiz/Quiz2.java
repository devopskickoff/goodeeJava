package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력해주세요");
		System.out.println(leapYear(sc.nextInt()));
	}
	public static boolean leapYear(int year) {
		if((year%4==0&&year%100!=0)||year%400==0) {
			return true;
		}else {
			return false;
		}
	}

}
