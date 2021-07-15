package MyShop1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student extends Object implements Comparable
{
   private String name="";//이름
   private int grade=1; //학년
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getGrade() {
      return grade;
   }
   public void setGrade(int grade) {
      this.grade = grade;
   }
   
   public Student() {
      super();
   }
   public Student(String name, int grade) {
      super();
      this.name = name;
      this.grade = grade;
   }
   
   @Override
   public int hashCode() {
      
      return name.hashCode();
   }
   @Override
   public boolean equals(Object obj) {
      Student s=(Student)obj;//다운캐스팅 
      
      return name.equals(s.name);
   }
   
   @Override
   public String toString() {
      
      String s = String.format("%s %d",  name, grade);
      return s;
   }
   
   @Override
   public int compareTo(Object o) {
      Student s=(Student)o;
      return name.compareTo(s.name);
   }
}

class MyList
{
   Object []obs= new Object[10];
   int size=0;
   
   public int size()
   {
      return size;
   }
   
   public void set(int i, Object obj)
   {
      if(i<0 || i>=10)//오류
         return;
      obs[i]=obj;
   }
   public Object get(int index)
   {
      if(index<0 || index>=size)
         return null;
      return obs[index];
   }
   
   public void add(Object obj)
   {
      if(size<10)
      {
         obs[size]= obj;
         size++;
      }
   }
   
   int indexOf(Object ob)
   {
      for(int i=0; i<size; i++)
      {
         if(obs[i].equals(ob))
            return i;
      }
      
      return -1;
   }
}


public class ObjectTest2 {
   public static void main(String[] args) {
	   
	  int num1 = 3;
	  int num2  = num1;

	  //클래스는 무조건 선언되었을때 생성이되고 객체화된다
      Student s1 = new Student("송창환", 1);
      Object obj1 = s1;  //Object 타입변수 = Student  객체 
      //Student -> Object 타입으로 : upcasting 이라 부르고 언제나 허용된다.
      
      s1 = (Student)obj1; //원본체는  Student -> Object -> Student
       //다운캐스팅이 가능한 경우는 원상복구 상태만 가능하다 
      
      //자바 4.0일때는 - 지금은 이렇게 사용안함 
      //List list = new ArrayList();
      MyList list = new MyList();
      list.add( new Student("조승연",  2)); //업캐스팅
      list.add( new Student("유재석",  3));
      list.add( new Student("샘킴",    1));
      list.add( new Student("유희열",  2));
      list.add( new Student("정승환",  3));
      //list.add( new String("김우석"));
      
      for(int i=0; i<list.size(); i++)
      {
         Student s = (Student)list.get(i);//다운캐스팅
         System.out.println(i);
         System.out.println(s);
      }
      
      //자바 4.0 이하에서는 제네릭, 어노테이션 사용못함
      //자바 5.0 이상부터 제네릭(템플릿)이 들어온다 
      //지금은 무조건 이렇게 쓰자
      List<Student> list2 = new ArrayList<Student>();
      list2.add( new Student("조승연",  2)); //업캐스팅
      list2.add( new Student("유재석",  3));
      list2.add( new Student("샘킴",    1));
      list2.add( new Student("유희열",  2));
      list2.add( new Student("정승환",  3));
      //list2.add( new String("김우석"));
      for(int i=0; i<list2.size(); i++)
      {
         Student s = list2.get(i);//다운캐스팅 안함
         System.out.println(s);
      }
      
      list2.sort(null);
      for(int i=0; i<list2.size(); i++)
      {
         Student s = list2.get(i);//다운캐스팅 안함
         System.out.println(s);
      }
      
      //정렬할때 두 대상을 비교해주는 특별한 클래스 - 제네릭 나오면서 
      //인터페이스 말고 별도로 비교자 이름의 클래스 
      //자바에서 사용하는 익명의 클래스 - 이름이 없음, 클래스정의하면서 바로 객체를 만든다  
      Comparator<Student> stComp = new Comparator<Student>() {

         @Override
         public int compare(Student o1, Student o2) {
            //앞에거가 크면 0보다 큰값
            //같으면 0
            //뒤에가 크면 0보다 작은값 
            return o1.getName().compareTo(o2.getName());
         }
      };
      
      list2.sort(stComp);
      for(int i=0; i<list2.size(); i++)
      {
         Student s = list2.get(i);//다운캐스팅 안함
         System.out.println(s);
      }
   }
}
