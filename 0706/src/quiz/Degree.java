package quiz;

import java.util.Scanner;

public class Degree {

	public static void main(String[] args) {
		//�Ϸ絿�� ��� ��ȭ����
		//�ð��� �µ��� �Է¹ް� �Ϸ� ��� �µ��� �Ϸ� �� ���� ���� �µ� �ð��� ���� �µ��� ���Ҵ� �ð��� ����Ͻÿ�
		int [] arr = new int[24];
		double avg;
		int hap = 0;
		int i;
		int max;
		int maxIndex = 0;
		int min;
		int minIndex = 0;
		//1.�µ��Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		for(i = 0; i<arr.length;i++) {
			System.out.printf("%d���� �µ��� �Է����ּ��� :",i+1);
			arr[i] = sc.nextInt();
		}
		
		//2.���
		//3.�ִ�
		max = arr[0];
		for(i=0;i<arr.length;i++) {
			hap += arr[i];
			if(max<arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		avg = hap/arr.length;
		//4.����
		min = arr[0];
		for(i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				max = arr[i];
				minIndex = i;
			}
		}
		
		System.out.printf("�Ϸ� ��� �µ��� %d, �Ϸ��� ���� �µ��� ���Ҵ� �ð��� %d�� %d��, ���� �µ��� ���Ҵ� �ð��� %d�� %d��",
				avg, maxIndex+1, max, minIndex+1, min);
	}

}
