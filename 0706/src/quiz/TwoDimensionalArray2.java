package quiz;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		int arr[][]=new int[10][10];
		int i;
		int j;
		int k=1;
		
//		for(i=0;i<arr.length;i++) {
//			for(j=arr.length-1;j>=arr.length-1-i;j--) {
//				arr[i][j] = k;
//				k++;
//			}
//		}
		
		for(i=0;i<arr.length;i++) {
			for(j=arr.length-1-i;j<arr.length;j++) {
				arr[i][j] = k;
				k++;
			}
		}
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
