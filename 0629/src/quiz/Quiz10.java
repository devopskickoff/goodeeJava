package quiz;
import java.util.Date;
import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// Quiz10 (�������� 10) ��¥�� �Է¹޾� �� ���� �� ���� ���° �������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ��� 2006�� 1�� 1�� �� ��쿡�� ù��° �� 2006 �� 2�� 2���� ��쿡�� 33��° �� �̴�.
		// �Է°��� ���� �⵵ �� �Ϸ� �޴´�.
		// 4�� ������ �������� �� �ش� �����̴�.
		// 100���� ������ �������� �ش� ������ �ƴϴ�.
		// 400���� ������ �������� �����̴�.
		// ��ü �ϼ��� ����϶�
		int year;
		int month;
		int day;
		String yearType;
		int feb;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("�⵵");
		year = sc.nextInt();
		System.out.println("��");
		month = sc.nextInt();
		System.out.println("��");
		day = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			yearType = "����";
			feb = 29;
		} else {
			yearType = "���";
			feb = 28;
		}
		

//		if (month == 1) {
//			System.out.println(day+"��");
//		} else if(month == 2) {
//			System.out.println(31+day+"��");
//		} else if(month == 3) {
//			System.out.println(31+feb+day+"��");
//		} else if(month == 4) {
//			System.out.println(31+feb+31+day+"��");
//		} else if(month == 5) {
//			System.out.println(31+feb+31+30+day+"��");
//		} else if(month == 6) {
//			System.out.println(31+feb+31+30+31+day+"��");
//		} else if(month == 7) {
//			System.out.println(31+feb+31+30+31+30+day+"��");
//		} else if(month == 8) {
//			System.out.println(31+feb+31+30+31+30+31+day+"��");
//		} else if(month == 9) {
//			System.out.println(31+feb+31+30+31+30+31+31+day+"��");
//		} else if(month == 10) {
//			System.out.println(31+feb+31+30+31+30+31+31+30+day+"��");
//		} else if(month == 11) {
//			System.out.println(31+feb+31+30+31+30+31+31+30+31+day+"��");
//		} else if(month == 12) {
//			System.out.println(31+feb+31+30+31+30+31+31+30+31+30+day+"��");
//		} 

		if(month >=1) {
			count = day;
		}
		if(month >=2) {
			count += 31;
		}
		if(month >=3) {
			count += feb;
		}
		if(month >=4) {
			count += 31;
		}
		if(month >=5) {
			count += 30;
		}
		if(month >=6) {
			count += 31;
		}
		if(month >=7) {
			count += 30;
		}
		if(month >=8) {
			count += 31;
		}
		if(month >=9) {
			count += 30;
		}
		if(month >=10) {
			count += 31;
		}
		if(month >=11) {
			count += 30;
		}
		if(month >=12) {
			count += 31;
		}

		
		
		
		
		System.out.println("�̹��ش�"+yearType+"�Դϴ� �� ���� "+count+"�Դϴ�");
		
		
	}

}
