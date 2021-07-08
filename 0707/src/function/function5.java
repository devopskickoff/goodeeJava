package function;

import java.util.Scanner;

public class function5 {
	//함수에 배열 전달하기 - 배열의 크기는 필요없고 타입 [] 변수명 
	   public static void readArray(int []a)
	   {
	      int i;
	      Scanner sc = new Scanner(System.in);
	      //for문써서 0번 방부터 데이터 입력하기 
	      for(i=0; i<a.length; i++)
	      {
	         System.out.printf("%d : ", i+1);
	         a[i] = sc.nextInt();
	      }
	   }
	   
	   //배열을 받아서 배열의 데이터를 차례대로 출력하는 함수 
	   //함수를 만들때 함수만 쳐다본다 매개변수와 지역변수만 바라보고 코딩하자 
	   public static void writeArray(int []a)
	   {
	      //a  는 매개변수로서 함수를 호출할때 전달되는 변수의 값을 받아온다 
	      int i; //지역변수 - 함수 내부에서만 존재하는 변수로 이 함수 밖에서 사용이 불가능하다
	      for(i=0; i<a.length; i++)
	      {
	         System.out.printf("%3d", a[i]);
	      }
	      System.out.println();
	   }
	   
	   //배열을 전달하면 최대값 위치를 반환하는 함수 
	   //camel  표기법 - 낙타등처럼  처음에 소문자 새로운 단어가 나오면 첫글자만 대문자로
	   //전달할데이터는 배열(int []), 가져올 데이터는 위치값(int)
	   public static  int getMaxPos(int []arr)
	   {
	      int i, max, maxpos; //필요한 변수를 함수내에서 만들어야 한다 
	      
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
