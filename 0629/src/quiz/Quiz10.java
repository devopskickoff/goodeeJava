package quiz;
import java.util.Date;
import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// Quiz10 (연습문제 10) 날짜를 입력받아 그 날이 한 해의 몇번째 일인지를 결정하는 프로그램을 작성하시오.
		// 예를 들어 2006년 1월 1일 의 경우에는 첫번째 날 2006 년 2월 2일의 경우에는 33번째 날 이다.
		// 입력값은 각각 년도 월 일로 받는다.
		// 4로 나누어 떨어지면 그 해는 윤년이다.
		// 100으로 나누어 떨어지는 해는 윤년이 아니다.
		// 400으로 나누어 떨어지는 윤년이다.
		// 전체 일수를 출력하라
		int year;
		int month;
		int day;
		String yearType;
		int feb;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("년도");
		year = sc.nextInt();
		System.out.println("월");
		month = sc.nextInt();
		System.out.println("일");
		day = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			yearType = "윤년";
			feb = 29;
		} else {
			yearType = "평년";
			feb = 28;
		}
		

//		if (month == 1) {
//			System.out.println(day+"일");
//		} else if(month == 2) {
//			System.out.println(31+day+"일");
//		} else if(month == 3) {
//			System.out.println(31+feb+day+"일");
//		} else if(month == 4) {
//			System.out.println(31+feb+31+day+"일");
//		} else if(month == 5) {
//			System.out.println(31+feb+31+30+day+"일");
//		} else if(month == 6) {
//			System.out.println(31+feb+31+30+31+day+"일");
//		} else if(month == 7) {
//			System.out.println(31+feb+31+30+31+30+day+"일");
//		} else if(month == 8) {
//			System.out.println(31+feb+31+30+31+30+31+day+"일");
//		} else if(month == 9) {
//			System.out.println(31+feb+31+30+31+30+31+31+day+"일");
//		} else if(month == 10) {
//			System.out.println(31+feb+31+30+31+30+31+31+30+day+"일");
//		} else if(month == 11) {
//			System.out.println(31+feb+31+30+31+30+31+31+30+31+day+"일");
//		} else if(month == 12) {
//			System.out.println(31+feb+31+30+31+30+31+31+30+31+30+day+"일");
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

		
		
		
		
		System.out.println("이번해는"+yearType+"입니다 총 일은 "+count+"입니다");
		
		
	}

}
