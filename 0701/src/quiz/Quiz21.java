package quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		//대문자를 소문자로 입력하기

		String s = "I like star. red star. blue star";
		//char로 받아와서 for 문을 돌린다
		//그 값이 00 이하면 바꾸기
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
