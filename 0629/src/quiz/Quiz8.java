package quiz;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// Quiz8 ������ ������ ���ϱ�
		//���ǥ�� ������ ���� �� �� ������ �����뷮�� �Է¹��� �� �������� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//100KW �̸��� 1kw �� 600�����̰� 100KW �̻� ~ 200KW �̸� �� ��쿡��  100KW ������ 1kw �� 600���̰� �������� 1KW�� 700���̴�. 
		//200KW �ʰ��ô�  200KW�̻���ʹ� 1KW�� 800���̴�. 
		
		//�� �ݾ׺��� ���� �׸��� ���Ѵ�  
		
		int kw = 0;
		int pay;
		
		Scanner sc = new Scanner(System.in);		
		kw = sc.nextInt();

		int fee = 0;
		if(kw < 100)
			fee = kw * 600;
		else if(kw<200)
			fee = 100*600 + (kw-100)*700;
		else 
			fee = 100*600 + 100*700 + (kw-200)*800;
		
		
	}

}
