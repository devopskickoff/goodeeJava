package com.goodee.score;

import java.util.ArrayList;
import java.util.List;

//���⼭ ���� �Ѵ� - ��񿡼� ������ �а� ���� �뵵 - ������ �а� ���� �� �̿ܿ��� �ϸ� �ȵȴ� 
//�����̳� �����ͺ��̽��� ���� ������ �а� ���⸸ ���� 
public class ScoreDao {
	//�����͸� ��Ƶα� ���� �÷��� ��ü�� ���� �ִ� 
	List<ScoreDto> list = new ArrayList<ScoreDto>();
	
	//������
	public ScoreDao() {
		list.add(new ScoreDto("ȫ�浿", 300, 200, 180, 170));
		list.add(new ScoreDto("�Ӳ���", 100, 100, 80,  70));
		list.add(new ScoreDto("����", 100, 80,  80,  70));
		list.add(new ScoreDto("���浿", 350, 200, 180, 170));
		list.add(new ScoreDto("���¿�", 200, 150, 180, 170));
		list.add(new ScoreDto("��̶�", 350, 200, 180, 170));
		list.add(new ScoreDto("�迬��", 400, 200, 180, 170));
	}
	
	public List<ScoreDto> getList(){
		return list;
	}
	
	public void insert(ScoreDto dto) {
		list.add(dto);
	}
	
}




