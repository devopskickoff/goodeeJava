package inheritance3;

public abstract class APerson {
	String name = "";
	int age = 20;
	
	abstract void display(); //�߻�޼���
	//�߼��޼��带 �����ϴ� Ŭ������ �߻�Ŭ�����̰� 
	//��ӹ޴� �ʿ��� �߻�޼��带 ������ �����ָ� �ڽĵ�
	//�߻�Ŭ�������ǰ� ��ü ������ ���Ѵ�
	//�߻�޼���� abstract Ű���带 �Լ��տ� ���̰� �����κ��� ������Ѵ�.

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
