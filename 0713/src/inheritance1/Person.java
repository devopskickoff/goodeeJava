package inheritance1;

//�������̽� - Ŭ���� ���ο� �Լ� �Ӹ��븸 ���� �� �ִ� Ŭ����
public class Person implements Comparable{
	private String name = ""; // �θ�Ŭ������������
	protected int age = 0; // �θ� �ڽİ����� public
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
	
	//per1.equals(per2); //Person ��ü�� Object�� ����ȯ�� �̷���� ���޵ȴ�
	// ȫ�浿 -> ��� �ڽ�Ÿ�� -> �θ�Ÿ�� (��ĳ����) �ö󰡴� ����ȯ, �̰� ������ ���
	// ��� -> ȫ�浿 �θ�Ÿ�� -> �ڽ�Ÿ�� (�ٿ�ĳ����) �������� ����ȯ, ��Ģ������ ������� �ʴ´�
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
