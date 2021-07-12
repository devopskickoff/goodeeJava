package com.goodee.score;

import java.util.Scanner;

//공통 클래스 - 보통 함수들을 static으로 만든다 
//객체 안만들고 사용가능 
public class CommonUtil {
	public static Scanner getScanner()
	{
		return new Scanner(System.in);
	}
}
