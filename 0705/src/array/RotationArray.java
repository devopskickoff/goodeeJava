package array;

import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		String direction="";
		int count = 0;
		int i;
		int [] newArr = new int[arr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� R or L");
		direction = sc.nextLine();
		System.out.println("Ƚ���� �Է����ּ���");
		count = sc.nextInt();
		if(direction.equals("R")||direction.equals("r")) {
			//n���� ���� �������� �ٴ´�
			for(i=0;i<count;i++) {
				newArr[i] = arr[arr.length-count+i];
			}
			for(i=0;i<arr.length-count;i++) {
				newArr[count+i] = arr[i];
			}
			
		} else if(direction.equals("L")||direction.equals("l")) {
			//n���� ���� ���������� �ٴ´�			
			for(i=0;i<arr.length-count;i++) {
				newArr[i] = arr[count+i];
			}
			for(i=0;i<count;i++) {
				newArr[arr.length-count+i] = arr[i];
			}
		}
		
		for(int k = 0;k<newArr.length;k++) {
			System.out.print(newArr[k]);
		}
	}

}
