package array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
//		���� 10�� ������ �迭�� ����� �迭�� ������ Ű����� �Է¹޾� ä���
//		ä������� �հ踦 ���ϰ�
//		��ü�迭��Ҹ� ����ϰ� �������� �հ踦 ����ϱ�
//		for�� 3�� �־���� �Է�, ���, ���
		int[] arr = new int[10];
		int result = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("���ڸ� �Է����ּ���");
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
			result +=arr[j];
		}
		
		System.out.printf("�հ� %d",result);
	}
}
