package quiz;

public class Quiz3_1 {

	   static void diamond(int line)
	   {
	      if(line%2==0) // ¦���϶� Ȧ���� ������
	         line = line + 1;
	      
	      int i,j;
	      
	      // ������ �׸�
	      /*
	       *      *       ���� 3 2 1 0
	       *       ***       ��(i) 1 2 3 4
	       *      *****
	       *   *******
	       */
	      int line2 = line/2;      
	      for(i=1;i<=line2+1;i++)
	      {
	         for(j=1;j<=(line2+1-i);j++)
	            System.out.print(" ");
	         for(j=1;j<=2*i-1;j++)
	            System.out.print("*");
	         System.out.println();         
	      }
	      /*
	       *  *******
	       *   *****
	       *    ***
	       *     *
	       */
	      
	      for(i=1;i<=line2;i++)
	      {
	         for(j=1;j<=i;j++)
	            System.out.print(" ");
	         for(j=1;j<=2*(line2+1-i)-1;j++)
	            System.out.print("*");
	         System.out.println();         
	      }
	   }
	   public static void main(String[] args) {
	      diamond(8);
	   }


}
