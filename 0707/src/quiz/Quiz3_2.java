package quiz;

import java.util.Scanner;

public class Quiz3_2 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
		int length = 8;
		for(i=1;i<=length;i++) {
			for(j=1;j<=length-i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	

}
