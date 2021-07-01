package rectangle;
import java.util.Scanner;

/* 1.문제에 대한 정의 (입력데이터, 출력데이터)
	 입력데이터 : 가로, 세로
	 출력데이터 : 면적
	 
   2. 충분한 입출력 변수를 만들자
   		int width, height;
   		int surface;
   3.데이터 입력
   4.계산 - 입력받은 데이터 계산
   5.출력
*/

public class Rectangle {
	public static void main(String[] args) {
		int width, height;
		int surface;
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 :");
		width = sc.nextInt();
		System.out.println("세로 :");
		height = sc.nextInt();
		
		surface = width * height;
		System.out.println("면적은" + surface + "입니다");
		
	}
}
