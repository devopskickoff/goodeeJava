package breakTest;

public class breateTest1 {

	public static void main(String[] args) {
		int i, j, k;
		boolean flag = false; 
		//�� ������ false�� �⺻���� ��� ���� loop�� break������ true�ְ�
		//�ܺ� loop�� true�϶� break �ϸ�ȴ�
		k=1;
		for(i=1;i<=10;i++) {
			for(j=1;j<=10;j++) {
				System.out.print(k);
				k++;
				if(k>47) {
					flag = true;
					break;
				}
					
			}
			if(flag==true)
				break;
			System.out.println();
		}
		

	}

}
