package quiz;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {
		int arr[][]=new int[10][10];
		int i;
		int j;
		int k=1;

		for(i=0;i<arr.length;i++) {
			for(j=0;j<=i;j++) {
				arr[i][j]=k;
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
