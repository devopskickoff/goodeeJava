package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 대문자를 입력받아 소문자를 반환하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.next();
		System.out.println(readString(alphabet));
		
	}
	
	public static String readString(String alphabet) {
		
		return Character.toString(alphabet.charAt(0)+32);
		
	}
	
	

}
