package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, end =0;
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���۴�:");
		start = sc.nextInt();
		System.out.println("�������� �����:");
		end = sc.nextInt();

		
		if (start > end) {
			// start�� �� ũ�� ���ҿ�����
			for(i = start; i >= end; i--) {
				for(j=2;j<=9;j++) {
					System.out.printf(" %d x %d �� %d", i, j, i*j);
				}
				System.out.println();
			}
		} else if(start < end) {
			// start�� �� ũ�� ����
			for(i = start; i<=end;i++) {
				for(j = 2; j<=9;j++) {
					System.out.printf(" %d x %d �� %d", i, j, i*j);
				}
				System.out.println();
			}
		}
	}

}
