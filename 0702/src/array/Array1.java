package array;

public class Array1 {
   public static void main(String[] args) {
      int []arr;//arr�̶�� ������ ������ ����� 
      //�� ������ �����Ͱ� �� ������ ����. 
      //�ڹٿ��� �迭�� ������ �޸� ������ Ȯ���ؾ� �Ѵ�
      
      //new  ������ -  heap �������� �޸𸮸� Ȯ���� �� 
      //������ ����ϸ� ������ ù��° �� �ּ�, ������ �����ϸ�
      //null���� �����Ѵ� 
      
      arr = new int[10];
      System.out.println(arr);
      
      arr = new int[10];// ���ο� �޸𸮿� ���� �����鼭 
      //�Ʊ� �޸𸮴� ������(gabage) �����Ⱑ �ǰ� 
      //JVM �� �ִ� ������ �����Ⱑ ƴ���� �����⸦ �����Ѵ�
      //�ڹٰ� �������̴�. 
      System.out.println(arr);
      
      //�ε���- ���ȣ�� �����͸� ������ �� �ִ� 
      //���ȣ�� 0���� �����Ѵ�
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;
      arr[3] = 4;
      arr[4] = 5;
      arr[5] = 6;
      arr[6] = 7;
      arr[7] = 8;
      arr[8] = 9;
      arr[9] = 10;
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
      System.out.println(arr[3]);
      System.out.println(arr[4]);
      System.out.println(arr[5]);
      System.out.println(arr[6]);
      System.out.println(arr[7]);
      System.out.println(arr[8]);
      System.out.println(arr[9]);
      //System.out.println(arr[10]);
      //Index out of range, ���࿡�� 
      //for ���� ����Ͽ� 10, 20, 30 ....
      //arr[i]=(i+1)*10
      int i;
      for(i=0; i<arr.length; i++)
      {
         arr[i] = (i+1)*10;
      }
      
      for(i=0; i<arr.length; i++)
      {
         System.out.println(arr[i]);
      }
      
      int []a= new int[] {1,2,3,4,5,6,7,8,9,10};
      for(i=0; i<a.length; i++)
      {
         System.out.println(a[i]);
      }
      
      double []d=new double[5];
      d[0]=10.0;
      d[1]=20.0;
      d[2]=30.0;
      for(i=0; i<d.length; i++)
      {
         System.out.println(d[i]);
      }
      
   }
   
   
}