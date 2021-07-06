package minmax;

public class Max {

	public static void main(String[] args) {
		int []a = new int[] {5,99,22,77,6,88,75,37,100,10};
		
		int max = a[0];
		for(int i = 1; i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			} 
		}
		System.out.println(max);
	}

}
