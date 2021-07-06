package quiz;

public class Score {
	public static void main(String[] args) {
		//체조 점수구하기 8명의 심판이 1~10점까지 점수를 입력하면 가장 낮은 점수와 가장 높은 점수를 제외한 나머지 점수의 평균을 구한다
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		
		int max = 0;
		int min = 0;
		int hap = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[max]<arr[i]) {
				max = i;
			} else if(arr[min]>arr[i]) {
				min = i;
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			if(j==min||j==max) {
				continue;
			} else {
				hap += arr[j];
			}
		}
		System.out.printf("총 합은 %d 평균은 %d",hap,hap/(arr.length-2));
	}
}
