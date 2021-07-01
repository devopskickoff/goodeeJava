package quiz;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {

		int j, k;
		int start, end;
		Scanner sc = new Scanner(System.in);
		System.out.println("시작단:");
		start = sc.nextInt();
		System.out.println("끝단 :");
		end = sc.nextInt();

		for (j = start; j <= end; j++) {
			for (k = 2; k <= 9; k++) {
				System.out.printf("%d x %d = %d ", j, k, j * k);
			}
			System.out.println();
		}
	}

}
