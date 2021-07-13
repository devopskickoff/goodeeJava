package inheritance1;

//인터페이스 - 클래스 내부에 함수 머리통만 만들 수 있는 클래스
public class Person implements Comparable{
	private String name = ""; // 부모클래스내에서만
	protected int age = 0; // 부모 자식간에는 public
	public String phone = "";

	public Person(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		  return name + " " + age + " " + phone;
	}
	
	//per1.equals(per2); //Person 객체가 Object로 형변환이 이루어져 전달된다
	// 홍길동 -> 사람 자시타입 -> 부모타입 (업캐스팅) 올라가는 형전환, 이건 언제나 허용
	// 사람 -> 홍길동 부모타입 -> 자식타입 (다운캐스팅) 내려가는 형전환, 원칙적으로 허용하지 않는다
	@Override
	public boolean equals(Object obj) {
		Person temp = (Person)obj;
		return name.equals(temp.name);
	}

	@Override
	public int compareTo(Object o) {
		Person temp = (Person)o;
		return name.compareTo(temp.name);
	}
	
	
}
