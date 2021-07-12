package com.goodee.score;

import java.util.ArrayList;
import java.util.List;

//여기서 일을 한다 - 디비에서 데이터 읽고 쓰기 용도 - 데이터 읽고 쓰기 일 이외에는 하면 안된다 
//파일이나 데이터베이스로 부터 데이터 읽고 쓰기만 하자 
public class ScoreDao {
	//데이터를 담아두기 위한 컬렉션 객체를 갖고 있다 
	List<ScoreDto> list = new ArrayList<ScoreDto>();
	
	//생성자
	public ScoreDao() {
		list.add(new ScoreDto("홍길동", 300, 200, 180, 170));
		list.add(new ScoreDto("임꺽정", 100, 100, 80,  70));
		list.add(new ScoreDto("장길산", 100, 80,  80,  70));
		list.add(new ScoreDto("고길동", 350, 200, 180, 170));
		list.add(new ScoreDto("조승연", 200, 150, 180, 170));
		list.add(new ScoreDto("장미란", 350, 200, 180, 170));
		list.add(new ScoreDto("김연경", 400, 200, 180, 170));
	}
	
	public List<ScoreDto> getList(){
		return list;
	}
	
	public void insert(ScoreDto dto) {
		list.add(dto);
	}
	
}





