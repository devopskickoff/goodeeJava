package quiz;

import java.util.Scanner;

public class MatchingNumber {

	public static void main(String[] args) {
//		���ڸ��߱� ����
//		1~10 ������ ���� ��ǻ�Ͱ� �����ϰ� �����ؼ� �����ִ�
//		��ǻ�Ͱ� 7�� �����ִ�
//		����� 5�� �Է��ϸ� ����� �۴�
//		����� 6�� �Է��ϸ� ����� �۴�
//		���7�� �Է��ϸ� �´� ���߰ų� 4�� ��ȸ�� �پ��� �����Ѵ�
//		�� ���߸� 3���� ������ϴ� 
//		�����߸� 4���� ��ȸ�� �� ����ϼ̽��ϴ�
		
//		�߰�����: ���? ������ �� 10���߰� 5��������
		
		int cnt=0;
		int allCnt = 0;
		int correct=0;
		int user;
		int cont ;
		Scanner sc = new Scanner(System.in);
		while(cnt<4) {
			cnt++;
			int com = (int)(Math.random()*10)+1;
			System.out.println("���� �Է����ּ���");
			user = sc.nextInt();
			if(user==com) {
				correct ++;
				allCnt++;
				System.out.println("�´�, �����մϱ�? 1.�� 2.�ƴϿ�");
				cont = sc.nextInt();
				if(cont==1) {
					cnt = 0;
				} else {
					break;
				}
			} else if(user>com) {
				allCnt++;
				System.out.println("����� ũ��");
			} else {
				allCnt++;
				System.out.println("����� �۴�");
			}
			if(cnt==4&&correct==0) {
				System.out.println("�� ���� ��ȸ�� ��� ����߽��ϴ�");
				System.out.println("��� �����մϱ�? 1.�� 2.�ƴϿ�");
				cont = sc.nextInt();
				if(cont==1) {
					cnt=0;
				}else {
					break;
				}
			}
		}
		System.out.printf("�� %d���߰� %d�� �����",allCnt,correct);
		
	}

}
