package com.goodee.dictionary;

public class EngKorDict {
	String eng="";
	String kor="";
	
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public EngKorDict(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}
	public EngKorDict() {
		super();
		
	}
	
	
}
