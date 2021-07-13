package inheritance1;
import java.util.ArrayList;
import java.util.List;

public class InheritTest {
   public static void main(String[] args) {
      Person p1 = new Person();
      
      //��� Ŭ������ ObjectŬ������ ��ӹ޴´� 
      Object obj = new Person();
      System.out.println(obj.toString());
      
      //�ڹ� �� �����ϴ� ������� ��� Ŭ������ �ƿ츣�� ������Ÿ���� �ʿ�
      //�׸��� �׻� �־�� �⺻ �Լ���� ������ ����  Object ��� 
      //�̸��� �ְ� �̰� ������ ��ӹް� �� 
      //Overriding - �θ� Ŭ������ ������ �ִ� �Լ��� ���ο� ����� �ο��Ѵ�
      
      Person p2 = new Person("ȫ�浿", 23, "010-0000-0000");
      System.out.println(p2);
      
      //List  Ŭ������  ArrayList  �� �θ�Ŭ����
      //�θ�Ŭ���� ������ �ڽ�Ŭ���� ������ �����ϴ�-������ 
      List<String> list = new ArrayList<String>();
      list.add("����");
      list.add("ġŲ");
      list.add("���");
      list.add("�Ľ�Ÿ");
      list.add("��ġ���");
      list.add("����");
      list.add("������");
      list.add("���α�");
      list.add(new String("�ᳪ������"));
      
      int pos = list.indexOf("�Ľ�Ÿ");
      System.out.println(pos);
      
      list.sort(null);//�������� ���� 
      for(int i=0; i<list.size(); i++)
         System.out.println(list.get(i));
      
      List<Person> perList = new ArrayList<Person>();
      
      perList.add(new Person("ȫ�浿", 20, "010-0000-0001"));
      perList.add(new Person("��浿", 20, "010-0000-0002"));
      perList.add(new Person("��浿", 20, "010-0000-0003"));
      perList.add(new Person("�̱浿", 20, "010-0000-0004"));
      perList.add(new Person("�ڱ浿", 20, "010-0000-0005"));
      perList.add(new Person("��浿", 20, "010-0000-0006"));
      perList.add(new Person("��浿", 20, "010-0000-0007"));
      
      pos = perList.indexOf(new Person("�ڱ浿", 20, "010-0000-0005"));
      System.out.println(pos);
      
      String s1 = new String("ȫ�浿");
      String s2 = new String("�Ӳ���");
      
      System.out.println(s1.compareTo(s2));
      //s1 > s2 > 0 ���� ������ �����̸�
      //s1 == s2 0 ���������� ������
      //s1 < s2 <0 ���������� �����̸�
      list.sort(null);
      
//      perList.sort(null);
//      for(int i=0; i<perList.size(); i++)
//      {
//         System.out.println(perList.get(i));
//      }
   }
}