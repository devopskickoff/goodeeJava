package algorithm;

public class LinearSearch1 {

	public static void main(String[] args) {
		//�����˻�

//		1.Ű ���� �Է¹޴´�. 
//		2.Ű ���� �����ϴ����� Ȯ���ϱ� ���� ���� flag �� �����Ѵ�. 
//		3.�� ������ ���� 1�̸� Ű ���� �����ϴ� ���̰�, �� ������ ���� 0�̸� Ű���� �������� �ʴ°��̴�. 
//		4.�迭�� ù��° ����� Ű���� �ִ��� ã�´�. 
//		5.���� ������ ���� �̵��Ͽ� �˻��� ����Ѵ�. 
//		6.ã������ flag ���� 1�� �����ϰ� �˻��� �׸� �����Ѵ�. 
//		7.flag ���� 1�̸� ã����Ȳ�� ó�� 0�̸� ã�� ���� ��Ȳ�� ó���� ���ش�. 

		int [] a = new int[] {3,45,2,7,9,11,19,17,26,37};
		int key = 11; //ã�� Ű ��
		int i = 0;
		boolean flag=false; // ã���� true, ��ã���� false
		while(flag == false&&i<a.length) {
			if(a[i] == key) //��ġ�ϴ� �����Ͱ� �ִٸ�
				flag = true;
			else 
				i++;
		}
		if(flag==true)
			System.out.printf("found %d\n",i);
		else 
			System.out.println("not found");
	}

}
