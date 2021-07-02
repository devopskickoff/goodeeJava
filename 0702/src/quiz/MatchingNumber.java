package quiz;

import java.util.Scanner;

public class MatchingNumber {

	public static void main(String[] args) {
//		숫자맞추기 게임
//		1~10 사이의 값을 컴퓨터가 랜덤하게 생각해서 갖고있다
//		컴퓨터가 7을 갖고있다
//		사람이 5를 입력하면 결과가 작다
//		사람이 6을 입력하면 결과가 작다
//		사람7을 입력하면 맞다 맞추거나 4번 기회를 다쓰면 종료한다
//		다 맞추면 3번에 맞췄습니다 
//		못맞추면 4번의 기회를 다 사용하셨습니다
		
//		추가문제: 계속? 끝날때 총 10번했고 5번맞췄음
		
		int cnt=0;
		int allCnt = 0;
		int correct=0;
		int user;
		int cont ;
		Scanner sc = new Scanner(System.in);
		while(cnt<4) {
			cnt++;
			int com = (int)(Math.random()*10)+1;
			System.out.println("값을 입력해주세요");
			user = sc.nextInt();
			if(user==com) {
				correct ++;
				allCnt++;
				System.out.println("맞다, 종료합니까? 1.예 2.아니오");
				cont = sc.nextInt();
				if(cont==1) {
					cnt = 0;
				} else {
					break;
				}
			} else if(user>com) {
				allCnt++;
				System.out.println("결과가 크다");
			} else {
				allCnt++;
				System.out.println("결과가 작다");
			}
			if(cnt==4&&correct==0) {
				System.out.println("네 번의 기회를 모두 사용했습니다");
				System.out.println("계속 진행합니까? 1.예 2.아니오");
				cont = sc.nextInt();
				if(cont==1) {
					cnt=0;
				}else {
					break;
				}
			}
		}
		System.out.printf("총 %d번했고 %d번 맞췄다",allCnt,correct);
		
	}

}
