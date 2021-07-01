package money;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
//		(연습문제 2) 화폐개수 세기
//		10만원 짜리 수표가 들어가는 자판기를 만들려고 합니다. 
//		자판기에 수표를 입력하면 거스름돈을 계산하여 정확하게 필요한 화폐들의 개수를 계산하여야 합니다. 
//		이를 계산하는 프로그램을 작성하시오.

		int money = 0;
		int omanwon = 0; 
		int manwon = 0; 
		int ocheonwon = 0; 
		int cheonwon = 0; 
		int obackwon = 0; 
		int backwon = 0; 
		int sibwon = 0;
		
		System.out.println("금액을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();
		if(money>=50000) {
			omanwon = money/50000;
			money = money%50000;
		}
		if(money>=10000) {
			manwon = money/10000;
			money = money%10000;
		}
		if(money>=5000) {
			ocheonwon = money/5000;
			money = money%5000;
		}
		if(money>=1000) {
			cheonwon = money/1000;
			money = money%1000;
		}
		if(money>=500) {
			obackwon = money/500;
			money = money%500;
		}
		if(money>=100) {
			backwon = money/100;
			money = money%100;
		}
		if(money>=10) {
			sibwon = money/10;
			money = money%10;
		}
		
		System.out.println("오만원"+omanwon+"장"+"만원"+manwon+"장"+"오천원"+ocheonwon+"장"+
		"천원"+cheonwon+"장"+"오백원"+obackwon+"개"+"백원"+backwon+"개"+"십원"+sibwon+"개");
}

}
