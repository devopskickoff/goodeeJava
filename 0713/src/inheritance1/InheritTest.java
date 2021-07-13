package inheritance1;
import java.util.ArrayList;
import java.util.List;

public class InheritTest {
   public static void main(String[] args) {
      Person p1 = new Person();
      
      //모든 클래스는 Object클래스를 상속받는다 
      Object obj = new Person();
      System.out.println(obj.toString());
      
      //자바 언어를 설계하는 사람들이 모든 클래스를 아우르는 데이터타입을 필요
      //그리고 항상 있어야 기본 함수들과 변수를 만들어서  Object 라고 
      //이름을 주고 이걸 강제로 상속받게 함 
      //Overriding - 부모 클래스가 가지고 있는 함수에 새로운 기능을 부여한다
      
      Person p2 = new Person("홍길동", 23, "010-0000-0000");
      System.out.println(p2);
      
      //List  클래스가  ArrayList  의 부모클래스
      //부모클래스 참조는 자식클래스 참조가 가능하다-언제나 
      List<String> list = new ArrayList<String>();
      list.add("피자");
      list.add("치킨");
      list.add("돈까스");
      list.add("파스타");
      list.add("김치찌게");
      list.add("국밥");
      list.add("육개장");
      list.add("만두국");
      list.add(new String("콩나물국밥"));
      
      int pos = list.indexOf("파스타");
      System.out.println(pos);
      
      list.sort(null);//오름차순 정렬 
      for(int i=0; i<list.size(); i++)
         System.out.println(list.get(i));
      
      List<Person> perList = new ArrayList<Person>();
      
      perList.add(new Person("홍길동", 20, "010-0000-0001"));
      perList.add(new Person("고길동", 20, "010-0000-0002"));
      perList.add(new Person("김길동", 20, "010-0000-0003"));
      perList.add(new Person("이길동", 20, "010-0000-0004"));
      perList.add(new Person("박길동", 20, "010-0000-0005"));
      perList.add(new Person("장길동", 20, "010-0000-0006"));
      perList.add(new Person("허길동", 20, "010-0000-0007"));
      
      pos = perList.indexOf(new Person("박길동", 20, "010-0000-0005"));
      System.out.println(pos);
      
      String s1 = new String("홍길동");
      String s2 = new String("임꺽정");
      
      System.out.println(s1.compareTo(s2));
      //s1 > s2 > 0 사전 순서상 뒤쪽이면
      //s1 == s2 0 사전순서상 같으면
      //s1 < s2 <0 사전순서상 앞쪽이면
      list.sort(null);
      
//      perList.sort(null);
//      for(int i=0; i<perList.size(); i++)
//      {
//         System.out.println(perList.get(i));
//      }
   }
}