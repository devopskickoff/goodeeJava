package quiz;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// Quiz3 �ֱް���ϱ�. �ٹ��ð��� 20�ð��� �ʰ��ϸ� �ʰ��ð��� ���ؼ��� ���� 50%�� �� �����Ѵ�. ������ �� �ð��� 20000���̴�.
		
		int defaultWorkTime = 20;
		int allWorkTime;
		int pay = 20000;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ð��� �Է��ϼ���");
		allWorkTime = sc.nextInt();
		if(allWorkTime>20) {
			result = (int) ((defaultWorkTime*pay)+((allWorkTime-defaultWorkTime)*1.5*20000));
		}
		System.out.println(result);
		 

	}

}
