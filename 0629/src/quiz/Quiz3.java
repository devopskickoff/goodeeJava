package quiz;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// Quiz3 주급계산하기. 근무시간에 20시간을 초과하면 초과시간에 대해서는 수당 50%를 더 지급한다. 수당은 한 시간에 20000원이다.
		
		int defaultWorkTime = 20;
		int allWorkTime;
		int pay = 20000;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("일한 시간을 입력하세요");
		allWorkTime = sc.nextInt();
		if(allWorkTime>20) {
			result = (int) ((defaultWorkTime*pay)+((allWorkTime-defaultWorkTime)*1.5*20000));
		}
		System.out.println(result);
		 

	}

}
