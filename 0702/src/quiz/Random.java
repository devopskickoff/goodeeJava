package quiz;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		//1.��ǻ�Ͱ� ������ ���� �ϳ� ���� ���� 
		//2.������� (1.���� 2.���� 3.��) �߿� ���� �Է��ϰ�
		//3.���ϱ�
		int com = (int)Math.random()*3+1;
		int user;
		String result="����";
		Scanner sc = new Scanner(System.in);
		System.out.println("1.���� 2.���� 3.��");
		user = sc.nextInt();	
		if(user==com) {
			result = "����";
		} 
		
		if(user==1&&com==3){
			result = "�̰��";		
		} 
	
		if(user==2&&com==1){
			result = "�̰��";
		} 
		
		if(user==3&&com==2) {
			result = "�̰��";
		} 
		
		System.out.println(result);
		
}

}
