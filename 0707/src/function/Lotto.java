package function;

public class Lotto {
	static boolean isDuplicate(int[] nums, int key) {
		int i;
		for (i = 0; i < nums.length; i++) {
			if( nums[i] == key) {
				return true;
			}
		}
		return false;
	}
	
	static int[] returnLotto (int[] a) {
		boolean flag = true;
		int num;
		int i = 0;
		while(i!=a.length) {
			num = (int)(Math.random()*45)+1;
			if(isDuplicate(a, num)) {
				continue;
			} else {
				a[i] = num;
				i++;
			}
		}
		return a;
	}

	static void showLotto(int [] lotto) {
		for(int i = 0 ; i<lotto.length;i++) {
			System.out.printf("%4d",lotto[i]);
		}
	}
	public static void main(String[] args) {
		int []a = new int[6];
		int []lotto = returnLotto(a);
		showLotto(lotto);
	}
	
}
