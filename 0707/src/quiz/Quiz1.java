package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// �빮�ڸ� �Է¹޾� �ҹ��ڸ� ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.next();
		System.out.println(readString(alphabet));
		
	}
	
	public static String readString(String alphabet) {
		
		return Character.toString(alphabet.charAt(0)+32);
		
	}
	
	

}
