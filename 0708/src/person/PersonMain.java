package person;


//���Ͽ� Ŭ������ �ΰ��̻��̸� �ϳ��� Ŭ������ public �� �����ϴ� 
class Person //Person  �̶�� Ÿ���� �������
{
   //�� �������� �ϳ��� ���� 
   String name;
   int age;
   String phone;
   String address;
   
   public Person(String name, int age, String phone, String address) {
      this.name = name;
      this.age = age;
      this.phone = phone;
      this.address = address;
   }

   public Person() {
      super();
   }

   void setValue(String n, int a, String p, String addr)
   {
      name = n;
      age = a;
      phone = p;
      address = addr;
   }
   
   void output()
   {
      System.out.printf("%s %d %s %s\n", name, age, phone, address);
   }
}

//������  public �� Ŭ������ ���ϸ�� �����ؾ� �Ѵ� 
public class PersonMain {
   
   public static void main(String[] args) {
      Person p1; //��ü ���� ����, �޸𸮰� ����. 
      
      p1 = new Person(); //�迭ó�� �ݵ�� new �� �̿��ؼ� ����� ������ �Ѵ� 
      p1.name = "ȫ�浿";
      p1.age = 12;
      p1.phone="010-0000-0000";
      p1.address="�Ÿ���";
      
      System.out.println(p1.name);
      System.out.println(p1.age);
      System.out.println(p1.phone);
      System.out.println(p1.address);
      
      Person p2 = new Person();
      p2.setValue("ȫ�浿", 23, "010-0000-0000", "����");
      p2.output();
      
      
      //��ü �迭 - ��ü:����, �迭:����  ������ ���� ��Ȳ 
      Person persons[] = new Person[5];
      
      // [ , , , , ]  ��ü�� �ּҸ� ������ ������ �����, ��ü�� �ȸ���� ���� 
//      persons[0]= new Person();
//      persons[1]= new Person();
//      persons[2]= new Person();
//      persons[3]= new Person();
//      persons[4]= new Person();
      
      for(int i=0; i<persons.length; i++)
      {
         persons[i] = new Person();
      }
      persons[0].setValue("A", 20, "010-2222-2222", "�����");
      persons[1].setValue("B", 20, "010-2222-2222", "�����");
      persons[2].setValue("C", 20, "010-2222-2222", "�����");
      persons[3].setValue("D", 20, "010-2222-2222", "�����");
      persons[4].setValue("E", 20, "010-2222-2222", "�����");
   
      for(int i=0; i<persons.length; i++)
      {
         persons[i].output();
      }
      
      persons = new Person[] {new Person(), 
               new Person("ȫ�浿1", 24, "010-2222-3331", "�����"),
               new Person("ȫ�浿2", 25, "010-2222-3332", "�λ��"),
               new Person("ȫ�浿3", 26, "010-2222-3333", "��õ��"),
               new Person("ȫ�浿4", 27, "010-2222-3334", "�뱸��"),
               new Person("ȫ�浿5", 28, "010-2222-3335", "���ֽ�"),
            };
      
      for(int i=0; i<persons.length; i++)
      {
         persons[i].output();
      }
      
   }
}

/* �̸�, �ٹ��ð�, �ð���޿���, �޿� */








