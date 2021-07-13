package inheritance2;

import inheritance1.Person;

public class Student extends Person{
	   String schoolName="";//학교
	   String grade="";//학년
	   String className=""; //반이름 
	   
	   
	   
	   public Student() {
	      super(); //부모 생성자 호출
	      
	   }

	   public Student(String name, int age, String phone, String schoolName, String grade, String className) {
	      
	      super(name, age, phone); //부모생성자 호출
	      //직접 호출하지 않으면 super()  가 호출된다. 
	      //부모클래스에 생성자가 두개가 있으면 둘 중 하나를 선택해서 호출할 수 있다 
	      //특별히 선택하지 않으면 기본생성자를 호출한다 
	      
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
	   
	   //ctrl-space 또는 마우스 오른쪽 - source - override 
	   @Override
	   public String toString() {
	      //super - 부모 객체,  
	      String temp = String.format("%s %d %s %s %s %s",
	            getName(), age, phone, schoolName, grade, className);
	      //name - 부모클래스의  private 멤버라 접근이 안된다. 
	      //age  - protected  라 접근이 된다. 
	      //해결방법 : name의 접근권한을 protected로 바꾸거나  getName()함수를 호출한다
	      
	      //return "데이터 :"  + super.toString()+ " " +  this.schoolName;
	      return temp;
	   }
	   
	}

