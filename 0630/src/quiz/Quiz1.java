package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// Quiz1 성적나누기
		// 이름, 국어, 영어, 수학 성적을 입력받아 총점과 평균을 구하시오.
		// 90점 이상은 수, 80점 이상은 우 70점 이상은 미 60점 이상은 양 그 이외는 가

		String name;
		int kor;
		int math;
		int eng;
		int ave;
		int score;
		int grade;

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		name = sc.next();
		System.out.println("국어점수를 입력해주세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요");
		math = sc.nextInt();

		score = kor + eng + math;

		ave = score / 3;

		switch ((int) (ave / 10)) {
		case 10: grade = '수'; break;
		case 9: grade = '수'; break;
		case 8: grade = '우'; break;
		case 7: grade = '미'; break;
		case 6:	grade = '양'; break;
		default: grade = '가'; break;
		}

		System.out.printf("이름은 %s이고 총 점수는 %d 입니다 등급은 %c 입니다", ave, score, grade);
	}

}
