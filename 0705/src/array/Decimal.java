package array;

public class Decimal {

	public static void main(String[] args) {
		//10������ �Է¹޾� �������� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ� 
		int num = 10;
		String result = "";
		String result2 = "";
		int mok, nmg, i;
		
		mok = num;
		while (mok!=0) 
		{
			nmg = mok%2;
			result += String.valueOf(nmg);
			mok = mok/2;
			
		}
		System.out.println(result);
		for(i=result.length()-1; i>=0;i--) {
			result2+= result.charAt(i);
		}
		System.out.println(result2);
		
	}

}
