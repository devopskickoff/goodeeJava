package inheritance3;

public class Person extends APerson{
	String phone="";
	
	@Override
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
	}

	public Person(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
}
