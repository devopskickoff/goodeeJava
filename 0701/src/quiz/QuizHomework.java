package quiz;

import java.util.Scanner;

public class QuizHomework {

	public static void main(String[] args) {
		//노동부에서 동일직종에서 남녀간 임금차가 있는지를 확인한다

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
			System.out.println("성별입력 M or F / 끝내기 Z :");
			gender = sc.next();
			System.out.println("연봉입력: ");
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
		result = (mAvg==fAvg)?"서로 같습":(mAvg>fAvg)?"남성이 높습":"여성이 높습";
		System.out.printf("남성의 평균 연봉은 %d 여성의 평균연봉은 %d 입니다 "
				+ "임금차이는 %d으로 %s니다", mAvg, fAvg, Math.abs(mAvg-fAvg),result);
	}

}
