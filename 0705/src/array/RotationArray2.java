package array;

import java.util.Scanner;

public class RotationArray2 {

	 public static void main(String[] args) {
	      int a[]=new int[]{1,2,3,4,5,6,7,8,9,10};
	      int overflow, underflow;
	      //�ѹ��� �Ѱ��� 
	      //�������� �ϳ��� ȸ�� 
	      int i, k;
	      String direction="R";  //���� 
	      int rotate_cnt=1; //��� ȸ���ұ�? 
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("����(L:left, R:right) : ");
	      direction = sc.next();
	      System.out.print("�ݺ�Ƚ�� : ");
	      rotate_cnt = sc.nextInt();
	   
	      if( direction.equals("L") || direction.equals("l"))
	      {
	         for(k=1; k<=rotate_cnt; k++)
	         {
	            overflow = a[0];
	            for(i=1; i<a.length; i++)
	            {
	               a[i-1]=a[i];
	            }
	            a[a.length-1]= overflow; 
	            //�� �������濡 �Ʊ� �����س����� �ű��
	         }
	      }
	      else
	      {
	         //1,2,3,4,5,6,7,8,9,10 
	         //10, 1,2,3,4,5,6,7,8,9  -- 1
	         //9,10,1,2,3,4,5,6,7,8  -- 1   
	         for(k=1; k<=rotate_cnt; k++)
	         {
	            underflow = a[a.length-1];
	            for(i=a.length-1; i>0; i--)
	            {
	               a[i]=a[i-1];
	            }
	            a[0]= underflow; 
	            //�� �������濡 �Ʊ� �����س����� �ű��
	         }
	      }
	      for(i=0; i<a.length; i++)
	      {
	         System.out.printf("%3d", a[i]);
	      }
	      System.out.println();
	   }

}
