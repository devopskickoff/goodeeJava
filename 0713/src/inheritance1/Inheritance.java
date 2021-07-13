package inheritance1;

import java.util.ArrayList;

public class Inheritance {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		//모든 클래스는 Object클래스를 상속받는다
		Object obj = new Person();
		
		System.out.println(obj);
		
//		Person p2 = new Person("홍길동",23,"01000000000");
//		System.out.println(p2);
//		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("닭도리탕");
//		list.add("콩나물비빔밥");
//		list.add("떡볶이");
//		
//		int pos = list.indexOf("떡볶이");
//		System.out.println(pos);
//		
//		list.sort(null); // 오름차순 정렬
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		ArrayList<Person> perList = new ArrayList<>();
		perList.add(new Person("고길동",20,"010-0000-0001"));
		perList.add(new Person("나길동",20,"010-0000-0002"));
		perList.add(new Person("라길동",20,"010-0000-0003"));
		perList.add(new Person("바길동",20,"010-0000-0004"));
		perList.add(new Person("마길동",20,"010-0000-0005"));
		
		int pos = perList.indexOf(new Person("마길동",20,"010-0000-0005"));
		System.out.println(pos);
		
		perList.sort(null);
	}
}
