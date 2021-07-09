package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
//		제네릭 <> ArrayList 클래스는 컬렉션 클래스
//		뭔가를 담아두기 위한 클래스를 컬렉션 클래스
		ArrayList<String> sList = new ArrayList<String>();
		
		sList.add("작약");
		sList.add("백일홍");
		sList.add("목단");
		sList.add("국화");
		sList.add("장미");
		sList.add("백합");
		
		System.out.println("데이터 개수 :"+ sList.size());
		sList.remove(0); //0번삭제 작약이 삭제됨
		sList.set(0, "은방울꽃");
		for(int i=0; i<sList.size();i++) {
			System.out.println(sList.get(i));
		}
	}

}
