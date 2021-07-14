package com.goodee.singleton;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton(); //에러 발생
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		s1.x = 15;
		s1.arr[0] = 20;
		
		System.out.println(s2.x);
		System.out.println(s2.arr[0]);
	}
}
