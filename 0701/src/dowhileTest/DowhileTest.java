package dowhileTest;

import java.util.Scanner;

public class DowhileTest {
   public static void main(String[] args) {
      int sel;
      int radius;
      final double PI=3.14;
      int width, height;
      double surface;
      String again; //"N" 가 들어오면 끝난다 
      Scanner sc = new Scanner(System.in);
      
      do
      {
         System.out.println("1. 원의면적");
         System.out.println("2. 삼각형면적");
         System.out.println("3. 사각형의면적");
               
         System.out.print("선택 : ");
         sel = sc.nextInt();
         
         switch(sel)
         {
         case 1: 
            System.out.print("반지름 : ");
            radius = sc.nextInt();
            surface = radius*radius*PI;
            break;
         case 2:
            System.out.println("삼각형의면적");
            break;
         case 3:
            System.out.println("사각형의면적");
            break;   
         }
         System.out.println("계속?y/n");
         again = sc.next();
      }while(again.equals("y") || again.equals("Y"));
      System.out.println("종료");
   }
}