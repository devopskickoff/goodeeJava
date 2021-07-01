package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String []ar){
//		int i;
//		char k ='A';
//		for(i=1; i<=100; i++) {
//			System.out.printf("%4c",k);
//			k++;
//			if(k>'Z')
//				k='A';
//			if(i%10==0)
//				System.out.println();
//		}
		
		//Quiz3 A~Z까지 반복해서 100개의 알파벳을 나열하기. 10개씩 띄우기
		int i;
		char k = 'A';
		for(i=1;i<=100;i++) {
			//System.out.print(k);
			System.out.printf("%4c",k);
			k++;
			if(k>'Z') 
				k='A';
			if(i%10==0) {
				System.out.println();
			}
		}

		
	}
}
