package array;

import java.util.Scanner;

public class RotationArray2 {

	 public static void main(String[] args) {
	      int a[]=new int[]{1,2,3,4,5,6,7,8,9,10};
	      int overflow, underflow;
	      //한번에 한개만 
	      //왼쪽으로 하나만 회전 
	      int i, k;
	      String direction="R";  //방향 
	      int rotate_cnt=1; //몇번 회전할까? 
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("방향(L:left, R:right) : ");
	      direction = sc.next();
	      System.out.print("반복횟수 : ");
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
	            //맨 마지막방에 아까 보관해놓은거 옮기기
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
	            //맨 마지막방에 아까 보관해놓은거 옮기기
	         }
	      }
	      for(i=0; i<a.length; i++)
	      {
	         System.out.printf("%3d", a[i]);
	      }
	      System.out.println();
	   }

}
