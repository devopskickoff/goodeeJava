package breakTest;

public class breateTest1 {

	public static void main(String[] args) {
		int i, j, k;
		boolean flag = false; 
		//이 변수에 false를 기본으로 담고 내부 loop가 break했을때 true넣고
		//외부 loop는 true일때 break 하면된다
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
