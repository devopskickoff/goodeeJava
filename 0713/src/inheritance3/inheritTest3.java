package inheritance3;

public class inheritTest3 {
	public static void main(String[] args) {
		APerson a = new Person("홍길동",20,"010-2222-2222");
		//추상클래스라 객체 생성 불가
		//추상클래스는 객체 상속을 목적으로 만든 클래스
		//설계단계에서 작성하는 클래스, 추상함수를 상속받는 쪽에서
		//반드시 오버라이딩해라
		a.display();
		
	}
}
