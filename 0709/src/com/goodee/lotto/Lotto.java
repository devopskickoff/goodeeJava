package com.goodee.lotto;

	public class Lotto {
		   int []lotto=new int[6];
		   int cnt=0;//�ζǹ�ȣ 6������ �� �Ǿ����� ī��Ʈ �� ����
		   
		   boolean isDuplicate(int key)
		   {
		      for(int i=0; i<cnt; i++)
		      {
		         if(lotto[i] == key)
		            return true;
		      }
		      return false;
		   }
		   public void create()
		   {
		      while(cnt<6)
		      {
		         int num = (int)(Math.random()*10)+1; //1~10��������
		         if(!isDuplicate(num))//�ߺ� �ȵ������� 
		         {
		            lotto[cnt]=num;
		            cnt++;
		         }
		      }
		      for(int i=0; i<cnt; i++)
		         System.out.printf("%4d", lotto[i]);
		            System.out.println();
		   }

}
