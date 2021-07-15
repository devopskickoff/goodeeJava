package CollectionTest;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		//ArrayList와 LinkedList는 List라는 인터페이스를 상속받아 만들었음
		//ArrayList에서 내부 데이터를 저장하는 방법은 배열을 사용한다.-MyList클래스처럼
		//LinkedList 내부에 데이터를 데이터 | 다음데이터주소 연결고리를 만들어서 데이터를 저장
		List<String> list = new Stack<String>();
		list.add("시루떡");
		list.add("바람떡");
		list.add("절편");
		list.add("가래떡");
		list.add("백설기");
		list.add("꿀떡");
		
		//때로는 지원하지 않는 클래스로 있다.
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		//언제나 지원 - Iterator 인터페이스
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("red", "빨간색"); // key - value 쌍을 이룬다.
		map.put("green", "초록색");
		map.put("blue", "파란색");
		map.put("white", "흰색");
		map.put("black", "검은색");
		
		System.out.println(map.get("red"));
		
		//키값을 순서대로 출력하기
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext())
		{
			String key = it2.next();
			System.out.printf("%s %s\n",key, map.get(key));
		}
	}
}
