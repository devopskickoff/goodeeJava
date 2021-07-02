package array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
//		정수 10개 저장할 배열을 만들고 배열에 정수를 키보드로 입력받아 채우고
//		채운다음에 합계를 구하고
//		전체배열요소를 출력하고 마지막에 합계를 출력하기
//		for문 3개 있어야함 입력, 계산, 출력
		int[] arr = new int[10];
		int result = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("숫자를 입력해주세요");
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
			result +=arr[j];
		}
		
		System.out.printf("합계 %d",result);
	}
}
