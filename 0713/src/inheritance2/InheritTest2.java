package inheritance2;


public class InheritTest2 {
   public static void main(String[] args) {
      Student s1 = new Student();
      s1.setName("홍길동");
      s1.setAge(15);
      s1.setPhone("010-2222-2222");
      s1.setSchoolName("신갈중학교");
      s1.setGrade("2학년");
      s1.setClassName("2반");
      
      System.out.println(s1.getName());
      System.out.println(s1.getAge());
      System.out.println(s1.getPhone());
      System.out.println(s1.getSchoolName());
      System.out.println(s1.getGrade());
      System.out.println(s1.getClassName());
      
      //Person 클래스의  toString()이 호출되서 
      //이름하고 나이하고 전화번호만 나옴 
      //부모 클래스의 함수를 오버라이딩 하면 부모 함수를 가리고 내거가 호출된다. 
      System.out.println(s1);
   }
}