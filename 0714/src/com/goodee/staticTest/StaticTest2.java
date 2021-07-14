package com.goodee.staticTest;
/*
	myType
	
	isCapital('A') 대문자면 true 반환, 소문자면 false반환
	isAlpha('a')알파벳이면 true반환 아니면 false반환
	isDigit('0') 숫자면 true 아니면 false반환
	toUpper("abc"); ABC 소문자를 대문자로 바꿔주는
	toLower("ABC"); abc 대문자를 소문자로 바꿔주는

	
*/
public class StaticTest2 {
	
	
	public static void main(String[] args) {
		//static 함수는 객체 또는 클래스로 접근이 가능하다
		
		MyType m1 = new MyType();
		System.out.println(m1.isAlpha('A'));
		System.out.println(m1.isAlpha('7'));
		System.out.println(m1.isCapital('A'));
		System.out.println(m1.isCapital('a'));
		System.out.println(m1.isDigit('7'));
		System.out.println(m1.isDigit('A'));
		System.out.println(m1.toUpper("star"));
		System.out.println(m1.toLower("STAR"));
	
		System.out.println(MyType.isAlpha('A'));
		System.out.println(MyType.isAlpha('7'));
		System.out.println(MyType.isCapital('A'));
		System.out.println(MyType.isCapital('a'));
		System.out.println(MyType.isDigit('7'));
		System.out.println(MyType.isDigit('A'));
		System.out.println(MyType.toUpper("star"));
		System.out.println(MyType.toLower("star"));
		
	}
}
