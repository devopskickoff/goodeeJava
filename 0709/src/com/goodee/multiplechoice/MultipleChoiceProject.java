package com.goodee.multiplechoice;

public class MultipleChoiceProject {

	public static void main(String[] args) {
		MultipleChoiceDao dao = new MultipleChoiceDao();
		dao.append();
		dao.process();
		dao.output();
	}

}
