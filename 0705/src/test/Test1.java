package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, end =0;
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 시작단:");
		start = sc.nextInt();
		System.out.println("구구단의 종료단:");
		end = sc.nextInt();

		
		if (start > end) {
			// start가 더 크면 감소연산자
			for(i = start; i >= end; i--) {
				for(j=2;j<=9;j++) {
					System.out.printf(" %d x %d 는 %d", i, j, i*j);
				}
				System.out.println();
			}
		} else if(start < end) {
			// start가 더 크면 증가
			for(i = start; i<=end;i++) {
				for(j = 2; j<=9;j++) {
					System.out.printf(" %d x %d 는 %d", i, j, i*j);
				}
				System.out.println();
			}
		}
	}

}
