package function;

import java.util.Scanner;

public class function5 {
	//�Լ��� �迭 �����ϱ� - �迭�� ũ��� �ʿ���� Ÿ�� [] ������ 
	   public static void readArray(int []a)
	   {
	      int i;
	      Scanner sc = new Scanner(System.in);
	      //for���Ἥ 0�� ����� ������ �Է��ϱ� 
	      for(i=0; i<a.length; i++)
	      {
	         System.out.printf("%d : ", i+1);
	         a[i] = sc.nextInt();
	      }
	   }
	   
	   //�迭�� �޾Ƽ� �迭�� �����͸� ���ʴ�� ����ϴ� �Լ� 
	   //�Լ��� ���鶧 �Լ��� �Ĵٺ��� �Ű������� ���������� �ٶ󺸰� �ڵ����� 
	   public static void writeArray(int []a)
	   {
	      //a  �� �Ű������μ� �Լ��� ȣ���Ҷ� ���޵Ǵ� ������ ���� �޾ƿ´� 
	      int i; //�������� - �Լ� ���ο����� �����ϴ� ������ �� �Լ� �ۿ��� ����� �Ұ����ϴ�
	      for(i=0; i<a.length; i++)
	      {
	         System.out.printf("%3d", a[i]);
	      }
	      System.out.println();
	   }
	   
	   //�迭�� �����ϸ� �ִ밪 ��ġ�� ��ȯ�ϴ� �Լ� 
	   //camel  ǥ��� - ��Ÿ��ó��  ó���� �ҹ��� ���ο� �ܾ ������ ù���ڸ� �빮�ڷ�
	   //�����ҵ����ʹ� �迭(int []), ������ �����ʹ� ��ġ��(int)
	   public static  int getMaxPos(int []arr)
	   {
	      int i, max, maxpos; //�ʿ��� ������ �Լ������� ������ �Ѵ� 
	      
	      max = arr[0];
	      maxpos = 0;
	      
	      for(i=1; i<arr.length; i++)
	      {
	         if(max < arr[i])
	         {
	            max = arr[i];
	            maxpos = i;
	         }
	      }
	      
	      return maxpos;
	   }
	   
	   
	   
	   public static void main(String[] args) {
	      int a[]=new int[5];
	      int b[]=new int[3];
	      
	      //readArray(a);
	      //readArray(b);
	      
	      //writeArray(a);
	      //writeArray(b);
	      
	      int nums[]=new int[] {4,77,87,99,1,2,3,76,88};
	      System.out.println( getMaxPos(nums) );
	      System.out.println( nums[getMaxPos(nums)] );
	   }


}
