package score2;

//이 클래스는 score1이라는 폴더안에 들어있고
//package는 반드시 첫줄에 와야한다
//클래스 이름앞에 public이 없으면 동일패키지에는 마음대로 접근가능
//다른 패키지에서는 사용을 못한다

public class ScoreData {
	private String name = "";
	private int write = 0;
	private int word = 0;
	private int ppt = 0;
	private int excel = 0;
	private int total = 0;
	private String grade = "";

	// getter/setter 모든 변수에 대해서 함수를 만들어줘야 한다
	// setter 값을 전달한다
	// getter 는 값으 읽어가는 함수이다

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

	public ScoreData(String name, int write, int word, int ppt, int excel) {
		super();
		this.name = name;
		this.write = write;
		this.word = word;
		this.ppt = ppt;
		this.excel = excel;
	}

	public ScoreData() {
		super();
	}

	public void process() {
		   this.total = write + ppt + excel+ word;
		   switch(total/200){
		   		case 5:
			    case 4: grade = "A등급"; break;
				case 3: grade = "B등급"; break;
				case 2: grade = "C등급"; break;
				default: grade = "D등급, 재시험 요망";
		   }
	   }
}
