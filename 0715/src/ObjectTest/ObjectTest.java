package ObjectTest;

public class ObjectTest {
	public static void main(String[] args) {
		int a = 10;//������
		
		//�� Ÿ�� -> ������ ��ȯ ����(�ʿ��ؼ� Integer Ŭ������ ����� ����
		//�� Ÿ���� ��üȭ ��ų �� �ִ� Ŭ������ Wrapper Ŭ������ ��
		Object ob = a; //int -> Integer -> Object
		
		//���� -> �ٷ� ��Ÿ������ �� ���ư�
		// a =ob;
		
		a = (Integer)ob; //Wrapper Ŭ������ �⺻Ÿ������ ��ȯ�� ����
		//���� ����ȯ�� �ؾ� �� Object -> Integer -> int
		//int - ��Ÿ��  Integer - ����Ÿ��
		//���δ� ��Ÿ���� ������ ��ȯ�Ǿ�� �� ��찡 �־ 
		//�� ��Ÿ�� ���� ������ Wrapper Ŭ������ �ִ�.(�ڽ�, ��ڽ�)
		System.out.println(a);
	}
}
