package quiz;
import java.util.Scanner;

public class Quiz9_1 {

	public static void main(String[] args) {
		//quiz9 피타고라스의 정리 구하기
		//c*c = a*a+ b*b
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println((int)Math.sqrt(a*a+b*b));
	}

}
