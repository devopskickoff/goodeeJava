package com.goodee.multiplechoice;

//Dto - Data Transfer Object - 데이터만 기술
public class MultipleChoiceDto {
	String name ="";
	String dap ="";
	String ox = "";
	int count=0;
	int score=0;
	
	public MultipleChoiceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MultipleChoiceDto(String name, String dap) {
		super();
		this.name = name;
		this.dap = dap;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDap() {
		return dap;
	}
	public void setDap(String dap) {
		this.dap = dap;
	}
	public String getOx() {
		return ox;
	}
	public void setOx(String ox) {
		this.ox = ox;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
