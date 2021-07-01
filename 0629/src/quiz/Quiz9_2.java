package quiz;

import java.util.Scanner;

public class Quiz9_2 {

	public static void main(String[] args) {
// 			Quiz9_2 
//			근로소득세 구하기
//			1200만원 이하                      과세표준의 100분의 6	
//			1200만원 초과 4600만원 이하          72만원 + (1200만원 초과분의 과세표준의 100분의 15
//			4600만원 초과 8800만원 이하          582만원 + (4600만원 초과분의 과세표준의 100분의 24	
//			8800만원 초과                     1592만원 + (8800만원 초과분의 과세표준의 100분의 35
		
		int pay = 0;
		int tax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("소득입력");
		pay = sc.nextInt();
		
		
		if(pay <= 1200) {
			tax = (int) (pay*0.06);
		}else if(pay > 1200 && pay <=4600) {
			tax =  (int)(72+(pay-1200)*0.15);
		}else if(pay > 4600 && pay <= 8800) {
			tax = (int)(584+(pay-4600)*0.24);
		}else if(pay > 8800) {
			tax = (int)(1592+(pay-8800)*0.15);
		}
		
		System.out.println("근로소득세는"+tax+"만원 입니다");

	}

}
