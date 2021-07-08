package person;
class Person2 {
	String name;
	int worktime;
	int pay;

	void setValue(String n, int w, int p) {
		name = n;
		worktime = w;
		pay = p;
	}

	void output() {
		System.out.printf("%s %d %s %s\n", name, worktime, pay);
	}
}

public class PersonMain2 {

	public static void main(String[] args) {
//		�̸�, �ٹ��ð�, �ð��� �޿���, �޿� 
		Person2[] persons = makePersons();		
		output(persons);
	}

	static Person2[] makePersons() {
		Person2[] persons = new Person2[5];
		for(int i=0;i<persons.length;i++) {
			persons[i] = new Person2(); 
		}
		for(int j=0;j<persons.length;j++) {
			persons[j].setValue(String.valueOf((char)('A'+j)), j*100, 10000);
		}
		return persons;
	}
	
	static void output(Person2[] persons) {
		for(int k=0;k<persons.length;k++) {
			System.out.printf("�̸� %s �ٹ��ð� %d �ð���޿��� %d �ѱ޿��� %d\n", 
					persons[k].name,persons[k].worktime,persons[k].pay, 
					persons[k].worktime*persons[k].pay);
		}
	}
	

}
