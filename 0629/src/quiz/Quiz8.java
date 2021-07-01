package quiz;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// Quiz8 가정용 전기요금 구하기
		//요금표가 다음과 같을 때 각 가정의 전기사용량을 입력받은 후 전기요금을 계산하여 출력하는 프로그램을 작성하시오
		//100KW 미만은 1kw 당 600원씩이고 100KW 이상 ~ 200KW 미만 일 경우에는  100KW 까지는 1kw 당 600원이고 나머지는 1KW당 700원이다. 
		//200KW 초과시는  200KW이상부터는 1KW당 800원이다. 
		
		//총 금액부터 뺀다 그리구 더한다  
		
		int kw = 0;
		int pay;
		
		Scanner sc = new Scanner(System.in);		
		kw = sc.nextInt();

		int fee = 0;
		if(kw < 100)
			fee = kw * 600;
		else if(kw<200)
			fee = 100*600 + (kw-100)*700;
		else 
			fee = 100*600 + 100*700 + (kw-200)*800;
		
		
	}

}
