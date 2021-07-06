package quiz;

import java.util.Scanner;

public class TwoDimensionalArrayJungol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가로 세로 입력받아서 지그재그로 값 넣어보기
		int row;
		int col;
		int i;
		int j;
		int k = 1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("가로 개수를 입력해주세요");
		col = sc.nextInt();
		System.out.printf("세로 개수를 입력해주세요");
		row = sc.nextInt();
		int [][] arr = new int[row][col];
		
		for(i=0;i<arr.length;i++) {
			if(i%2==0) {
				//홀수면 순서대로
				for(j=0;j<arr[i].length;j++) {
					arr[i][j] = k;
					k++;
				}	
			}else{
				//짝수면 감소하면서
				for(j=arr[i].length-1;j>=0;j--) {
					arr[i][j] = k;
					k++;
				}
			}
			
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
