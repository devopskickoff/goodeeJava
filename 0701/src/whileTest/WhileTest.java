package whileTest;

public class WhileTest {

	public static void main(String[] args) {
		int i = 0,sum = 0;
		while(sum<=1000) {
			i++;
			sum+=i;
		}
		System.out.println("최초의 수는"+i);
	}

}
