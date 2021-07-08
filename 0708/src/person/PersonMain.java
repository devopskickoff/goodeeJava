package person;


//파일에 클래스가 두개이상이면 하나의 클래스만 public 가 가능하다 
class Person //Person  이라는 타입을 만들었음
{
   //이 변수들을 하나로 묶음 
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

//성격이  public 인 클래스는 파일명과 동일해야 한다 
public class PersonMain {
   
   public static void main(String[] args) {
      Person p1; //객체 참조 변수, 메모리가 없다. 
      
      p1 = new Person(); //배열처럼 반드시 new 를 이용해서 대상을 만들어야 한다 
      p1.name = "홍길동";
      p1.age = 12;
      p1.phone="010-0000-0000";
      p1.address="신림동";
      
      System.out.println(p1.name);
      System.out.println(p1.age);
      System.out.println(p1.phone);
      System.out.println(p1.address);
      
      Person p2 = new Person();
      p2.setValue("홍길동", 23, "010-0000-0000", "구로");
      p2.output();
      
      
      //객체 배열 - 객체:참조, 배열:참조  참조의 참조 상황 
      Person persons[] = new Person[5];
      
      // [ , , , , ]  객체의 주소를 저장할 공간만 만들고, 객체를 안만들어 놓음 
//      persons[0]= new Person();
//      persons[1]= new Person();
//      persons[2]= new Person();
//      persons[3]= new Person();
//      persons[4]= new Person();
      
      for(int i=0; i<persons.length; i++)
      {
         persons[i] = new Person();
      }
      persons[0].setValue("A", 20, "010-2222-2222", "서울시");
      persons[1].setValue("B", 20, "010-2222-2222", "서울시");
      persons[2].setValue("C", 20, "010-2222-2222", "서울시");
      persons[3].setValue("D", 20, "010-2222-2222", "서울시");
      persons[4].setValue("E", 20, "010-2222-2222", "서울시");
   
      for(int i=0; i<persons.length; i++)
      {
         persons[i].output();
      }
      
      persons = new Person[] {new Person(), 
               new Person("홍길동1", 24, "010-2222-3331", "서울시"),
               new Person("홍길동2", 25, "010-2222-3332", "부산시"),
               new Person("홍길동3", 26, "010-2222-3333", "인천시"),
               new Person("홍길동4", 27, "010-2222-3334", "대구시"),
               new Person("홍길동5", 28, "010-2222-3335", "광주시"),
            };
      
      for(int i=0; i<persons.length; i++)
      {
         persons[i].output();
      }
      
   }
}

/* 이름, 근무시간, 시간당급여액, 급여 */








