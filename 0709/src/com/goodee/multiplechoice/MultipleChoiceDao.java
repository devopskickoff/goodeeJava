package com.goodee.multiplechoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleChoiceDao {
	String jungdap = "12345123451234512345";
	List<MultipleChoiceDto> list = new ArrayList<MultipleChoiceDto>();
	
	public MultipleChoiceDao() { //생성자 만들어서 테스트 데이터 넣어놓기
		list.add(new MultipleChoiceDto("홍길동","12345123451234512345"));
		list.add(new MultipleChoiceDto("홍길동","12345123422221234512"));
		list.add(new MultipleChoiceDto("홍길동","12345123455334512345"));
		list.add(new MultipleChoiceDto("홍길동","12345111112334512345"));
	}

	public void append() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("답안:");
		String dap = sc.next();
		MultipleChoiceDto dto = new MultipleChoiceDto(name, dap);
	}
	
	public void process() {
		
		for(int i=0; i<list.size(); i++) {
			
			MultipleChoiceDto dto = list.get(i);
			
			for(int j=0; j<dto.getDap().length();j++) {
				
				if(dto.getDap().charAt(j)== jungdap.charAt(i)) {
					
					dto.setCount(dto.getCount()+1);
					dto.setOx(dto.getOx()+"O");
				}else {
					dto.setOx(dto.getOx()+"X");
				}
			}
		}
	}
	public void output() {
		for(int i=0; i<list.size(); i++) {
			
			MultipleChoiceDto dto = list.get(i);
			
			System.out.println(dto.ox);
		}
	}
}
