package quiz;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		//1.컴퓨터가 랜덤한 값을 하나 갖고 시작 
		//2.사람한테 (1.가위 2.바위 3.보) 중에 값을 입력하게
		//3.비교하기
		int com = (int)Math.random()*3+1;
		int user;
		String result="졌다";
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보");
		user = sc.nextInt();	
		if(user==com) {
			result = "비겼다";
		} 
		
		if(user==1&&com==3){
			result = "이겼다";		
		} 
	
		if(user==2&&com==1){
			result = "이겼다";
		} 
		
		if(user==3&&com==2) {
			result = "이겼다";
		} 
		
		System.out.println(result);
		
}

}
