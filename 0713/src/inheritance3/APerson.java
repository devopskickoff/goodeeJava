package inheritance3;

public abstract class APerson {
	String name = "";
	int age = 20;
	
	abstract void display(); //추상메서드
	//추성메서드를 포함하는 클래스는 추상클래스이고 
	//상속받는 쪽에서 추상메서드를 재정의 안해주면 자식도
	//추상클래스가되고 개체 생성을 못한다
	//추상메서드는 abstract 키워드를 함수앞에 붙이고 구현부분이 없어야한다.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
