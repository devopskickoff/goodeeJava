package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// Quiz1 ����������
		// �̸�, ����, ����, ���� ������ �Է¹޾� ������ ����� ���Ͻÿ�.
		// 90�� �̻��� ��, 80�� �̻��� �� 70�� �̻��� �� 60�� �̻��� �� �� �ܴ̿� ��

		String name;
		int kor;
		int math;
		int eng;
		int ave;
		int score;
		int grade;

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		name = sc.next();
		System.out.println("���������� �Է����ּ���");
		kor = sc.nextInt();
		System.out.println("���������� �Է����ּ���");
		eng = sc.nextInt();
		System.out.println("���������� �Է����ּ���");
		math = sc.nextInt();

		score = kor + eng + math;

		ave = score / 3;

		switch ((int) (ave / 10)) {
		case 10: grade = '��'; break;
		case 9: grade = '��'; break;
		case 8: grade = '��'; break;
		case 7: grade = '��'; break;
		case 6:	grade = '��'; break;
		default: grade = '��'; break;
		}

		System.out.printf("�̸��� %s�̰� �� ������ %d �Դϴ� ����� %c �Դϴ�", ave, score, grade);
	}

}
