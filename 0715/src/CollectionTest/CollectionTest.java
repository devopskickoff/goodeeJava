package CollectionTest;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		//ArrayList�� LinkedList�� List��� �������̽��� ��ӹ޾� �������
		//ArrayList���� ���� �����͸� �����ϴ� ����� �迭�� ����Ѵ�.-MyListŬ����ó��
		//LinkedList ���ο� �����͸� ������ | �����������ּ� ������� ���� �����͸� ����
		List<String> list = new Stack<String>();
		list.add("�÷綱");
		list.add("�ٶ���");
		list.add("����");
		list.add("������");
		list.add("�鼳��");
		list.add("�ܶ�");
		
		//���δ� �������� �ʴ� Ŭ������ �ִ�.
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		//������ ���� - Iterator �������̽�
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("red", "������"); // key - value ���� �̷��.
		map.put("green", "�ʷϻ�");
		map.put("blue", "�Ķ���");
		map.put("white", "���");
		map.put("black", "������");
		
		System.out.println(map.get("red"));
		
		//Ű���� ������� ����ϱ�
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext())
		{
			String key = it2.next();
			System.out.printf("%s %s\n",key, map.get(key));
		}
	}
}
