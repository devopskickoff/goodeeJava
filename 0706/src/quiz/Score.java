package quiz;

public class Score {
	public static void main(String[] args) {
		//ü�� �������ϱ� 8���� ������ 1~10������ ������ �Է��ϸ� ���� ���� ������ ���� ���� ������ ������ ������ ������ ����� ���Ѵ�
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
		System.out.printf("�� ���� %d ����� %d",hap,hap/(arr.length-2));
	}
}
