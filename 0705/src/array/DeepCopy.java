package array;

public class DeepCopy {

		public static void main(String[] args) {
			int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
			int b[]=null;
			
			//�ڹٴ� �迭���� �������δ� �޸𸮰� ���� 
			//�迭������ ���� ������ �����Ͱ� �ִ� ���� �ּҸ� �����ϱ� ���� �����̴�
			//new int[10];  �̶� heap �̶�� ������ ������ �� �޸� 
			//              10���� Ȯ���ϰ� ù��° ���� �ּҸ� �����Ѵ� 
			//              �޸𸮸� ���ٶ�  null���� ���� 
			
			b = a; //��������,  soft copy��� �θ��� 
			//a�� ����Ű�� ������ ���� �ּҸ� ����, ���� ���� 
			//a �� b�� ���� �������� ����Ų��. 
			a[0]=100;
			
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+ " ");
			}
			System.out.println();
			for(int i=0; i<b.length; i++)
			{
				System.out.print(b[i] + " " );
			}
			System.out.println();
			//�迭 a�� �迭 b�� �����ϱ� - hard copy  �������� 
			b = new int[a.length];
			for(int i=0; i<a.length; i++)
			{
				b[i] = a[i];
			}
			
			a[0]=1;
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+ " ");
			}
			System.out.println();
			
			for(int i=0; i<b.length; i++)
			{
				System.out.print(b[i]+ " ");
			}
			System.out.println();
		}
}
