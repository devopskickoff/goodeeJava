package com.goodee.updown;

import java.util.Scanner;

public class UpdownData {
   int []numbers=new int[4];
   int []updown=new int[4]; //1.up 2.down 3.match
   int computer;
   int cnt=0;
   boolean match=false;
   
   
   public int[] getNumbers() {
      return numbers;
   }

   public int[] getUpdown() {
      return updown;
   }

   public int getComputer() {
      return computer;
   }

   public void start()
   {
      computer = (int)(Math.random()*10)+1;
      int num;
      Scanner sc = new Scanner(System.in);
      
      do
      {
         System.out.print("���� : ");
         num=sc.nextInt();
         numbers[cnt]=num;
      
         if (computer == numbers[cnt])
         {
            match=true;
            updown[cnt]=3;
         }
         else if( computer > numbers[cnt])
         {
            System.out.println("�� ū ���� ���ϼ���");
            updown[cnt]=2;
         }
         else
         {
            System.out.println("�� ���� ���� ���ϼ���");
            updown[cnt]=1;
         }
         cnt++;
      }while(match==false && cnt<4);   
      
      if (match)
         System.out.printf("%d��°�� ���߼̽��ϴ�.\n", cnt);
      else
         System.out.printf("�����߼̽��ϴ�.\n");
   }
}