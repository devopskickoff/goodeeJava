package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
//		���׸� <> ArrayList Ŭ������ �÷��� Ŭ����
//		������ ��Ƶα� ���� Ŭ������ �÷��� Ŭ����
		ArrayList<String> sList = new ArrayList<String>();
		
		sList.add("�۾�");
		sList.add("����ȫ");
		sList.add("���");
		sList.add("��ȭ");
		sList.add("���");
		sList.add("����");
		
		System.out.println("������ ���� :"+ sList.size());
		sList.remove(0); //0������ �۾��� ������
		sList.set(0, "������");
		for(int i=0; i<sList.size();i++) {
			System.out.println(sList.get(i));
		}
	}

}
