package inheritance1;

import java.util.ArrayList;

public class Inheritance {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		//��� Ŭ������ ObjectŬ������ ��ӹ޴´�
		Object obj = new Person();
		
		System.out.println(obj);
		
//		Person p2 = new Person("ȫ�浿",23,"01000000000");
//		System.out.println(p2);
//		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("�ߵ�����");
//		list.add("�ᳪ�������");
//		list.add("������");
//		
//		int pos = list.indexOf("������");
//		System.out.println(pos);
//		
//		list.sort(null); // �������� ����
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		ArrayList<Person> perList = new ArrayList<>();
		perList.add(new Person("��浿",20,"010-0000-0001"));
		perList.add(new Person("���浿",20,"010-0000-0002"));
		perList.add(new Person("��浿",20,"010-0000-0003"));
		perList.add(new Person("�ٱ浿",20,"010-0000-0004"));
		perList.add(new Person("���浿",20,"010-0000-0005"));
		
		int pos = perList.indexOf(new Person("���浿",20,"010-0000-0005"));
		System.out.println(pos);
		
		perList.sort(null);
	}
}
