package function;

import java.util.Scanner;

public class function2 {

	   public static void circle()
	   {
	      final double PI=3.14;
	      double r;
	      Scanner sc = new Scanner(System.in);
	      double surface;
	      
	      System.out.print("반지름 : ");
	      r = sc.nextDouble();
	      
	      surface = r * r * PI;
	      System.out.printf("원의 면적 : %.2f\n", surface);
	   }
	   
	   public static void triangle()
	   {
	      double width, height;
	      Scanner sc = new Scanner(System.in);
	      double surface;
	      
	      System.out.print("밑변 : ");
	      width = sc.nextDouble();
	      
	      System.out.print("높이 : ");
	      height = sc.nextDouble();
	      
	      surface = width*height/2;
	      System.out.printf("삼각형의 면적 : %.2f\n", surface);
	   }
	   
	   public static void rectangle()
	   {
	      double width, height;
	      Scanner sc = new Scanner(System.in);
	      double surface;
	      
	      System.out.print("가로 : ");
	      width = sc.nextDouble();
	      
	      System.out.print("세로 : ");
	      height = sc.nextDouble();
	      
	      surface = width*height/2;
	      System.out.printf("사각형의 면적 : %.2f\n", surface);
	   }
	   
	   public static void main(String[] args) {
	      
	      Scanner sc = new Scanner(System.in);
	      while(true)
	      {
	         System.out.print("1.원의면적 2.삼각형면적 3.사각형면적 0.종료");
	         int sel=sc.nextInt();
	         switch(sel)
	         {
	            case 1: circle();  break;
	            case 2: triangle();  break;
	            case 3: rectangle();  break;
	            case 0: System.out.println("프로그램을 종료합니다.");
	                  return; //함수가 종료된다
	            default: System.out.println("메뉴가 없습니다."); 
	         }
	      }
	      
	   }


}
