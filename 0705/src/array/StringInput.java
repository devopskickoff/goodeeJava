package array;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
	      // ī����� �ƹ������� �Է¹޴´�
	      // �����ڰ� ��� �߻��ߴ��� ī��Ʈ�ϱ�
	      // aabbbcccff -> a:2, b:3...z:0
	      String s;
	      Scanner sc = new Scanner(System.in);
	      int []count = new int[26];
	      
	      System.out.println("������ �Է��ϼ���");
	      s = sc.nextLine();
	      int i;
	      for(i=0; i<s.length(); i++)
	      {
	         char c = s.charAt(i);
	         if(c>='A' && c<='Z')
	            count[c-'A']++;
	         else if(c>='a' && c<='z')
	            count[c-'a']++;   
	      }
	      for (i=0; i<count.length; i++)
	      {
	         System.out.printf("%c ==> %d\n", 'A'+i, count[i]);
	      }
	}

}
