package com.goodee.score;

/*
 * 변수값들하고 , getter/setter 그다음 생성자 
 * 간단한 연산의 경우는 가능, 데이터 저장용
 * 딴 한사람 데이터 저장용 클래스  
 */
public class ScoreDto {
	private String name="";
	private int write=0;
	private int word=0;
	private int ppt=0;
	private int excel=0;
	private int total=0;
	private String grade="";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWrite() {
		return write;
	}
	public void setWrite(int write) {
		this.write = write;
	}
	public int getWord() {
		return word;
	}
	public void setWord(int word) {
		this.word = word;
	}
	public int getPpt() {
		return ppt;
	}
	public void setPpt(int ppt) {
		this.ppt = ppt;
	}
	public int getExcel() {
		return excel;
	}
	public void setExcel(int excel) {
		this.excel = excel;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public ScoreDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	//생성자는 입력용데이터만 입력받아야 한다 
	public ScoreDto(String name, int write, int word, int ppt, int excel) {
		super();
		this.name = name;
		this.write = write;
		this.word = word;
		this.ppt = ppt;
		this.excel = excel;
		process();
	}
	
	public void process()
	{
		this.total = this.write + this.word + this.ppt + this.excel;
		switch(this.total/200)
		{
		case 5:
		case 4:
				grade="A등급";  break;
		case 3:
				grade="B등급";  break;
		case 2:
				grade="C등급";  break;
		default:
				grade="D등급";  
		}
	}
	
	public void output()
	{
		System.out.printf("%s %d %d %d %d %d %s\n",
				name, write, word, ppt, excel, total, grade);
	}
	
}









