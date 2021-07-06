package quiz;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		int arr[][]=new int[][] 
				{
					{1,2,3,4,0},
					{5,6,7,8,0},
					{9,10,11,12,0},
					{13,14,15,16,0},
					{0,0,0,0,0}
				};
		int i;
		int j;
//		for(i=0;i<arr.length;i++) {
//			for(j=0;j<arr[i].length;j++) {
//				System.out.printf("%4d", arr[i][j]);
//			}
//			System.out.println();
//		}
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length-1;j++) {
				arr[i][4]+= arr[i][j];
			}
		}
				
//		for(i=0;i<5;i++) {
//			for(j=0;j<4;j++) {
//				arr[4][i] += arr[j][i];
//			}
//		}
		
//		for(i=0;i<arr.length;i++) {
//			for(j=0; j<arr.length-1;j++) {
//				arr[arr.length-1][i]+=arr[j][i];
//			}
//		}
		
		for(i=0;i<arr.length-1;i++) {
			for(j=0; j<arr.length;j++) {
				arr[arr.length-1][j]+=arr[i][j];
			}
		}
		
		
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
