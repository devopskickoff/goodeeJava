package quiz;

import java.util.Scanner;

public class Quiz9_2 {

	public static void main(String[] args) {
// 			Quiz9_2 
//			�ٷμҵ漼 ���ϱ�
//			1200���� ����                      ����ǥ���� 100���� 6	
//			1200���� �ʰ� 4600���� ����          72���� + (1200���� �ʰ����� ����ǥ���� 100���� 15
//			4600���� �ʰ� 8800���� ����          582���� + (4600���� �ʰ����� ����ǥ���� 100���� 24	
//			8800���� �ʰ�                     1592���� + (8800���� �ʰ����� ����ǥ���� 100���� 35
		
		int pay = 0;
		int tax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ҵ��Է�");
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
		
		System.out.println("�ٷμҵ漼��"+tax+"���� �Դϴ�");

	}

}
