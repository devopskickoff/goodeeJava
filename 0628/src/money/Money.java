package money;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
//		(�������� 2) ȭ�󰳼� ����
//		10���� ¥�� ��ǥ�� ���� ���Ǳ⸦ ������� �մϴ�. 
//		���Ǳ⿡ ��ǥ�� �Է��ϸ� �Ž������� ����Ͽ� ��Ȯ�ϰ� �ʿ��� ȭ����� ������ ����Ͽ��� �մϴ�. 
//		�̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int money = 0;
		int omanwon = 0; 
		int manwon = 0; 
		int ocheonwon = 0; 
		int cheonwon = 0; 
		int obackwon = 0; 
		int backwon = 0; 
		int sibwon = 0;
		
		System.out.println("�ݾ��� �Է����ּ���");
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
		
		System.out.println("������"+omanwon+"��"+"����"+manwon+"��"+"��õ��"+ocheonwon+"��"+
		"õ��"+cheonwon+"��"+"�����"+obackwon+"��"+"���"+backwon+"��"+"�ʿ�"+sibwon+"��");
}

}
