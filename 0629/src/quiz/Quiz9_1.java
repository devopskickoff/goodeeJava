package quiz;
import java.util.Scanner;

public class Quiz9_1 {

	public static void main(String[] args) {
		//quiz9 ��Ÿ����� ���� ���ϱ�
		//c*c = a*a+ b*b
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println((int)Math.sqrt(a*a+b*b));
	}

}
