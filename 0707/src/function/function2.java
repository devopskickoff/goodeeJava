package function;

import java.util.Scanner;

public class function2 {

	   public static void circle()
	   {
	      final double PI=3.14;
	      double r;
	      Scanner sc = new Scanner(System.in);
	      double surface;
	      
	      System.out.print("������ : ");
	      r = sc.nextDouble();
	      
	      surface = r * r * PI;
	      System.out.printf("���� ���� : %.2f\n", surface);
	   }
	   
	   public static void triangle()
	   {
	      double width, height;
	      Scanner sc = new Scanner(System.in);
	      double surface;
	      
	      System.out.print("�غ� : ");
	      width = sc.nextDouble();
	      
	      System.out.print("���� : ");
	      height = sc.nextDouble();
	      
	      surface = width*height/2;
	      System.out.printf("�ﰢ���� ���� : %.2f\n", surface);
	   }
	   
	   public static void rectangle()
	   {
	      double width, height;
	      Scanner sc = new Scanner(System.in);
	      double surface;
	      
	      System.out.print("���� : ");
	      width = sc.nextDouble();
	      
	      System.out.print("���� : ");
	      height = sc.nextDouble();
	      
	      surface = width*height/2;
	      System.out.printf("�簢���� ���� : %.2f\n", surface);
	   }
	   
	   public static void main(String[] args) {
	      
	      Scanner sc = new Scanner(System.in);
	      while(true)
	      {
	         System.out.print("1.���Ǹ��� 2.�ﰢ������ 3.�簢������ 0.����");
	         int sel=sc.nextInt();
	         switch(sel)
	         {
	            case 1: circle();  break;
	            case 2: triangle();  break;
	            case 3: rectangle();  break;
	            case 0: System.out.println("���α׷��� �����մϴ�.");
	                  return; //�Լ��� ����ȴ�
	            default: System.out.println("�޴��� �����ϴ�."); 
	         }
	      }
	      
	   }


}
