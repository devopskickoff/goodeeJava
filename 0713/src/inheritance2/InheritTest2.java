package inheritance2;


public class InheritTest2 {
   public static void main(String[] args) {
      Student s1 = new Student();
      s1.setName("ȫ�浿");
      s1.setAge(15);
      s1.setPhone("010-2222-2222");
      s1.setSchoolName("�Ű����б�");
      s1.setGrade("2�г�");
      s1.setClassName("2��");
      
      System.out.println(s1.getName());
      System.out.println(s1.getAge());
      System.out.println(s1.getPhone());
      System.out.println(s1.getSchoolName());
      System.out.println(s1.getGrade());
      System.out.println(s1.getClassName());
      
      //Person Ŭ������  toString()�� ȣ��Ǽ� 
      //�̸��ϰ� �����ϰ� ��ȭ��ȣ�� ���� 
      //�θ� Ŭ������ �Լ��� �������̵� �ϸ� �θ� �Լ��� ������ ���Ű� ȣ��ȴ�. 
      System.out.println(s1);
   }
}