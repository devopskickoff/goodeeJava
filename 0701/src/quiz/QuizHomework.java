package quiz;

import java.util.Scanner;

public class QuizHomework {

	public static void main(String[] args) {
		//�뵿�ο��� ������������ ���ణ �ӱ����� �ִ����� Ȯ���Ѵ�

		String gender = "";
		int mCount = 0;
		int mTotal = 0;
		int fCount = 0;
		int fTotal = 0;
		int mAvg = 0;
		int fAvg = 0;
		String result = ""; 
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("�����Է� M or F / ������ Z :");
			gender = sc.next();
			System.out.println("�����Է�: ");
			if(gender.equals("M")) {
				mTotal+=sc.nextInt();
				mCount++;
			} else if(gender.equals("F")) {
				fTotal+=sc.nextInt();
				fCount++;
			} else if(gender.equals("Z")){
				flag = false;
			}
		}
		mAvg = mTotal/mCount;
		fAvg = fTotal/fCount;
		result = (mAvg==fAvg)?"���� ����":(mAvg>fAvg)?"������ ����":"������ ����";
		System.out.printf("������ ��� ������ %d ������ ��տ����� %d �Դϴ� "
				+ "�ӱ����̴� %d���� %s�ϴ�", mAvg, fAvg, Math.abs(mAvg-fAvg),result);
	}

}
