package com.goodee.staticTest;
/*
 	static 키워드
 	
 	클래스안에 선언된 변수와 함수는 객체를 만들어야 사용이 가능하다
 	객체가 본체, 클래스는 설계기 때문에 객체를 안만들면 상요이 불가능하다
 	근데 자바는 모든 코드가 클래스 안에둬야함
 	클래스 밖에 아무것도 못둠
 	main함수 - 존재 안해도 예외로 static 이라는 키워드를 붙여주면 변수도 미리 자리잡고있고
 				함수도 객체 생성여부와 상관없이 존재한다
 */
public class StaticTest {
	//변수
	int x=10;
	void function()
	{
		//이 함수에서 x사용 가능할까요?
		//	>>사용가능
		System.out.println("*********************");
	}
	public static void main(String[] args) {
		//main함수내에서 저 x변수 사용 가능할까요?
		//	>>사용 불가(static이 아닌 변수나 static아닌 함수는 호출할수 없음)
		
	}
}
