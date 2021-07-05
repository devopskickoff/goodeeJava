package array;

public class ChangeOrder {

	public static void main(String[] args) {
		// 배열의 데이터 순서 바꾸기 arr는 1,2,3,4,5,6,7,8,9,10
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int [] newArr = new int[arr.length];
		for(int i=1;i<=arr.length;i++) {
			newArr[i-1] = arr[arr.length-i];
		}
		for(int j=0;j<newArr.length;j++) {
			System.out.println(newArr[j]);
		}
	}

}
