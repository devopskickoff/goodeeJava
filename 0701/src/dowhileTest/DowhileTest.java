package dowhileTest;

import java.util.Scanner;

public class DowhileTest {
   public static void main(String[] args) {
      int sel;
      int radius;
      final double PI=3.14;
      int width, height;
      double surface;
      String again; //"N" �� ������ ������ 
      Scanner sc = new Scanner(System.in);
      
      do
      {
         System.out.println("1. ���Ǹ���");
         System.out.println("2. �ﰢ������");
         System.out.println("3. �簢���Ǹ���");
               
         System.out.print("���� : ");
         sel = sc.nextInt();
         
         switch(sel)
         {
         case 1: 
            System.out.print("������ : ");
            radius = sc.nextInt();
            surface = radius*radius*PI;
            break;
         case 2:
            System.out.println("�ﰢ���Ǹ���");
            break;
         case 3:
            System.out.println("�簢���Ǹ���");
            break;   
         }
         System.out.println("���?y/n");
         again = sc.next();
      }while(again.equals("y") || again.equals("Y"));
      System.out.println("����");
   }
}