package inheritance4;

public class inheritTest4 {

	public static void main(String[] args) {
		Calculator c1 = new CalculatorImpl();
		System.out.println(c1.add(3, 4));
		System.out.println(c1.sub(3, 4));
		System.out.println(c1.mul(3, 4));
		System.out.println(c1.div(3, 4));
	}

}
