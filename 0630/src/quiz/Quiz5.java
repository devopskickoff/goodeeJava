package quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// Quiz5 1~100���� �߿��� ¦���� �հ� Ȧ���� �� ���� ���ϱ�
		int odd = 0;
		int odd_sum = 0;
		int even = 0;
		int even_sum = 0;
		int num;
		int i;
		
		for(i = 0; i < 10; i++) {
			System.out.println("���� �Է����ּ��� :");
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
			System.out.printf("¦���� ��� %d\n", even_sum/even);
	
		if(odd>0)
			System.out.printf("Ȧ���� ��� %d\n", odd_sum/odd);
	}

}
