package score2;

//�� Ŭ������ score1�̶�� �����ȿ� ����ְ�
//package�� �ݵ�� ù�ٿ� �;��Ѵ�
//Ŭ���� �̸��տ� public�� ������ ������Ű������ ������� ���ٰ���
//�ٸ� ��Ű�������� ����� ���Ѵ�

public class ScoreData {
	private String name = "";
	private int write = 0;
	private int word = 0;
	private int ppt = 0;
	private int excel = 0;
	private int total = 0;
	private String grade = "";

	// getter/setter ��� ������ ���ؼ� �Լ��� �������� �Ѵ�
	// setter ���� �����Ѵ�
	// getter �� ���� �о�� �Լ��̴�

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
			    case 4: grade = "A���"; break;
				case 3: grade = "B���"; break;
				case 2: grade = "C���"; break;
				default: grade = "D���, ����� ���";
		   }
	   }
}
