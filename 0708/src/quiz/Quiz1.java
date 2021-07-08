package quiz;

public class Quiz1 {
	// 사지선답 정답맞추기, 객체지향적으로 생각해서 풀기 
	public static void main(String[] args) {
		String dapAn = "10000100001000010000";
		String jungDap="12345123451234512345";
		int count = 0;
		String result = "";
		for(int i=0;i<jungDap.length();i++) {
			if(dapAn.charAt(i)==jungDap.charAt(i)) {
				result+="O";
				count++;
			} else {
				result+="X";
			}
		}
		System.out.println(result);
		
	}


}
