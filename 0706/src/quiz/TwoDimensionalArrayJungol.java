package quiz;

import java.util.Scanner;

public class TwoDimensionalArrayJungol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� �Է¹޾Ƽ� ������׷� �� �־��
		int row;
		int col;
		int i;
		int j;
		int k = 1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� ������ �Է����ּ���");
		col = sc.nextInt();
		System.out.printf("���� ������ �Է����ּ���");
		row = sc.nextInt();
		int [][] arr = new int[row][col];
		
		for(i=0;i<arr.length;i++) {
			if(i%2==0) {
				//Ȧ���� �������
				for(j=0;j<arr[i].length;j++) {
					arr[i][j] = k;
					k++;
				}	
			}else{
				//¦���� �����ϸ鼭
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
