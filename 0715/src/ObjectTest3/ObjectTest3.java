package ObjectTest3;

public class ObjectTest3 {
	public static void main(String[] args) {
		//String Ŭ������ StringBuffer Ŭ���� ����
		//String Ŭ������ ������ �� ������ �ʴ� ���ڿ��� �����ϰų� ������ ���� ���ڿ�
		//StringBuffer Ŭ������ String ���� ������ �����ϴ�
		//������ - û�ұ�, ���� - û�ұ�
		
		//String Ŭ������ �����Ͱ� �ʿ��� ������ �޸� Ȯ��
		//���ο� �����Ͱ� ������ ���� �޸� ���ְ� ���� �����
		//�б⸸ ���� �߰��� ���� �ϳ� �ٲٱ�� �Ұ���
		
		//StringBufferŬ������ �̸� ������ ������ Ȯ���س���
		//���ڸ� ������ �� ������ ä�������ٰ� ������ �����ϸ� ���� ����°�
		//�ƴ϶� �ʿ��� ���� ��ŭ Ȯ���ؼ� ���� ������ �����Ѵ�.(LInkedList)
		//�߰��� ������ ��ȯ�� ����
		
		String s1;
		s1 = new String("rainbow");
		System.out.println(s1.charAt(0));
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("rainbow");
		buffer.setCharAt(0, 'R');
		System.out.println(buffer.toString());
		
		//�ڹٿ��� �ڵ尡 ����Ǵµ� �ɸ��� �ð� �����ϱ�
		long start = System.currentTimeMillis();//���� �ð��� �и��� ������ ��� ��
		//��ǻ�ʹ� 1970�� 1�� 1�Ϸ� �����ؼ� �� ���� 1�� ����Ǿ� 
		int sum = 0;
		for(int i=1; i<=100000; i++)
		{
			sum+=i;
		}
		long end = System.currentTimeMillis();
		
		System.out.printf("�ɸ� �ð� : %d\n", end - start);
		
		start = System.currentTimeMillis();
		for(int i=1; i<=10000; i++)
		{
			s1+=String.valueOf(i); //���ڸ� ���ڿ��� ��ȯ�ϴ� �Լ� String.valueOf
		}
		end = System.currentTimeMillis();
		System.out.printf("�ɸ��ð� : %d\n", end - start);
		
		start = System.currentTimeMillis();
		for(int i=1; i<=10000; i++)
		{
			s1+=String.valueOf(i); //���ڸ� ���ڿ��� ��ȯ�ϴ� �Լ� String.valueOf
		}
		end = System.currentTimeMillis();
		System.out.printf("�ɸ��ð� : %d\n", end - start);
	}
	
}
