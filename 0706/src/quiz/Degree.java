package quiz;

import java.util.Scanner;

public class Degree {

	public static void main(String[] args) {
		//하루동안 기온 변화조사
		//시간별 온도를 입력받고 하루 평균 온도와 하루 중 가장 높은 온도 시간과 가장 온도가 낮았던 시간을 출력하시오
		int [] arr = new int[24];
		double avg;
		int hap = 0;
		int i;
		int max;
		int maxIndex = 0;
		int min;
		int minIndex = 0;
		//1.온도입력받기
		Scanner sc = new Scanner(System.in);
		for(i = 0; i<arr.length;i++) {
			System.out.printf("%d시의 온도를 입력해주세요 :",i+1);
			arr[i] = sc.nextInt();
		}
		
		//2.평균
		//3.최대
		max = arr[0];
		for(i=0;i<arr.length;i++) {
			hap += arr[i];
			if(max<arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		avg = hap/arr.length;
		//4.최저
		min = arr[0];
		for(i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				max = arr[i];
				minIndex = i;
			}
		}
		
		System.out.printf("하루 평균 온도는 %d, 하루중 가장 온도가 높았던 시간은 %d시 %d도, 가장 온도가 낮았던 시간은 %d시 %d도",
				avg, maxIndex+1, max, minIndex+1, min);
	}

}
