package ObjectTest;

public class ObjectTest {
	public static void main(String[] args) {
		int a = 10;//값변수
		
		//값 타임 -> 참조로 전환 가능(필요해서 Integer 클래스를 만들어 놓음
		//값 타입을 객체화 시킬 수 있는 클래스를 Wrapper 클래스라 함
		Object ob = a; //int -> Integer -> Object
		
		//참조 -> 바로 값타입으로 못 돌아감
		// a =ob;
		
		a = (Integer)ob; //Wrapper 클래스가 기본타입으로 전환은 가능
		//강제 형전환을 해야 함 Object -> Integer -> int
		//int - 값타입  Integer - 참조타입
		//때로는 값타입이 참조로 전환되어야 할 경우가 있어서 
		//각 값타입 별로 별도의 Wrapper 클래스가 있다.(박싱, 언박싱)
		System.out.println(a);
	}
}
