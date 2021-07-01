package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		int i, j, k, l ;
		
		// Quiz2 다이아몬드 그리기
		for(i = 0; i < 5; i++) {
			//" "
			for(j = 0; j < 4-i;j++) 
				System.out.print(" ");			
			for(k = 0; k <= i; k++)
				System.out.print("*");
			for(l = 0; l < i; l++)
				System.out.print("*");
			System.out.println("");
		}
		
//		for(i = 1; i<=4; i++) {
//			for(j = 0; j <= i-1; j++)
//				System.out.print(" ");
//			for(k = 0; k < 5-i; k++)
//				System.out.print("*");
//			for(l = 0; l < 4-i; l++)
//				System.out.print("*");
//			System.out.println("");
//		}
		
		for(i = 0 ; i < 4; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(k = 0; j < 5-i; j++) {
				System.out.print("*");
			}
//			for(l = 0; l < 3-i; l++) {
//				System.out.print("*");
//			}
			System.out.println("");
		} 
		

	}

}
