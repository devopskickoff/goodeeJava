package algorithm;

public class Quiz17 {

	public static void main(String[] args) {
		// ������ ����ó�� ���� ������ ���� ����ϱ�
		String jungDap = "12345123451234512345";
		String answer =  "11111111111111112345";
		int count = 0;
		
		for(int i = 0; i<jungDap.length();i++) {
			if(answer.charAt(i)==jungDap.charAt(i)) {
				count++;
			}
		}
		System.out.printf("���� ������ %d�� ������ %d�� �Դϴ�",count,count*5);
	}

}
