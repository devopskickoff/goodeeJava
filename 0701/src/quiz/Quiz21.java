package quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		//�빮�ڸ� �ҹ��ڷ� �Է��ϱ�

		String s = "I like star. red star. blue star";
		//char�� �޾ƿͼ� for ���� ������
		//�� ���� 00 ���ϸ� �ٲٱ�
		String changeS = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=97&&s.charAt(i)<=122) {
				changeS += (char)(s.charAt(i)-32);
			} else {
				changeS += (char)s.charAt(i);
			}
		}
		System.out.println(changeS);
	}

}
