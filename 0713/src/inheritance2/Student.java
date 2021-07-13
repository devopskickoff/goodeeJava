package inheritance2;

import inheritance1.Person;

public class Student extends Person{
	   String schoolName="";//�б�
	   String grade="";//�г�
	   String className=""; //���̸� 
	   
	   
	   
	   public Student() {
	      super(); //�θ� ������ ȣ��
	      
	   }

	   public Student(String name, int age, String phone, String schoolName, String grade, String className) {
	      
	      super(name, age, phone); //�θ������ ȣ��
	      //���� ȣ������ ������ super()  �� ȣ��ȴ�. 
	      //�θ�Ŭ������ �����ڰ� �ΰ��� ������ �� �� �ϳ��� �����ؼ� ȣ���� �� �ִ� 
	      //Ư���� �������� ������ �⺻�����ڸ� ȣ���Ѵ� 
	      
	      this.schoolName = schoolName;
	      this.grade = grade;
	      this.className = className;
	   }
	   
	   
	   public String getSchoolName() {
	      return schoolName;
	   }
	   public void setSchoolName(String schoolName) {
	      this.schoolName = schoolName;
	   }
	   public String getGrade() {
	      return grade;
	   }
	   public void setGrade(String grade) {
	      this.grade = grade;
	   }
	   public String getClassName() {
	      return className;
	   }
	   public void setClassName(String className) {
	      this.className = className;
	   }
	   
	   //ctrl-space �Ǵ� ���콺 ������ - source - override 
	   @Override
	   public String toString() {
	      //super - �θ� ��ü,  
	      String temp = String.format("%s %d %s %s %s %s",
	            getName(), age, phone, schoolName, grade, className);
	      //name - �θ�Ŭ������  private ����� ������ �ȵȴ�. 
	      //age  - protected  �� ������ �ȴ�. 
	      //�ذ��� : name�� ���ٱ����� protected�� �ٲٰų�  getName()�Լ��� ȣ���Ѵ�
	      
	      //return "������ :"  + super.toString()+ " " +  this.schoolName;
	      return temp;
	   }
	   
	}

