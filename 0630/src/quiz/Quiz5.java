package quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// Quiz5 1~100까지 중에서 짝수의 합과 홀수의 합 각각 구하기
		int odd = 0;
		int odd_sum = 0;
		int even = 0;
		int even_sum = 0;
		int num;
		int i;
		
		for(i = 0; i < 10; i++) {
			System.out.println("값을 입력해주세요 :");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			
			if(num%2==0) {
				even++;
				even_sum+=num;
			} else {
				odd++;
				odd_sum+=num;
			}
		}
		
		if(even>0)
			System.out.printf("짝수의 평균 %d\n", even_sum/even);
	
		if(odd>0)
			System.out.printf("홀수의 평균 %d\n", odd_sum/odd);
	}

}
