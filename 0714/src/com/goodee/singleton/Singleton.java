package com.goodee.singleton;

public class Singleton {
	//1.static 변수로 singleton 객체 저장변수
	static Singleton inst = null;
	
	//2.생성자를 private로 한다
	private Singleton() {
		
	}
	
	//3.객체를 생성해서 반환하는 내부함수를 만들자
	public static Singleton getInstance() {
		if(inst==null) {
			inst = new Singleton();
		}
		return inst;
	}
	
	public int x;
	public int []arr = new int[10];
	
}
