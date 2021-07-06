package algorithm;

public class LinearSearch1 {

	public static void main(String[] args) {
		//선형검색

//		1.키 값을 입력받는다. 
//		2.키 값이 존재하는지를 확인하기 위한 변수 flag 를 선언한다. 
//		3.이 변수의 값이 1이면 키 값이 존재하는 것이고, 이 변수의 값이 0이면 키값은 존재하지 않는것이다. 
//		4.배열의 첫번째 방부터 키값이 있는지 찾는다. 
//		5.만일 없으면 방을 이동하여 검색을 계속한다. 
//		6.찾았으면 flag 값을 1로 세팅하고 검색을 그만 종료한다. 
//		7.flag 값이 1이면 찾은상황의 처리 0이면 찾지 못한 상황의 처리를 해준다. 

		int [] a = new int[] {3,45,2,7,9,11,19,17,26,37};
		int key = 11; //찾을 키 값
		int i = 0;
		boolean flag=false; // 찾으면 true, 못찾으면 false
		while(flag == false&&i<a.length) {
			if(a[i] == key) //일치하는 데이터가 있다면
				flag = true;
			else 
				i++;
		}
		if(flag==true)
			System.out.printf("found %d\n",i);
		else 
			System.out.println("not found");
	}

}
