package algorithm;

public class Quiz17 {

	public static void main(String[] args) {
		// 객관식 성적처리 맞은 개수와 점수 출력하기
		String jungDap = "12345123451234512345";
		String answer =  "11111111111111112345";
		int count = 0;
		
		for(int i = 0; i<jungDap.length();i++) {
			if(answer.charAt(i)==jungDap.charAt(i)) {
				count++;
			}
		}
		System.out.printf("맞은 개수는 %d개 점수는 %d점 입니다",count,count*5);
	}

}
