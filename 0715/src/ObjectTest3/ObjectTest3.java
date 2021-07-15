package ObjectTest3;

public class ObjectTest3 {
	public static void main(String[] args) {
		//String 클래스와 StringBuffer 클래스 사용법
		//String 클래스는 내용이 잘 변하지 않는 문자열을 저장하거나 내용은 작은 문자열
		//StringBuffer 클래스는 String 보다 성능이 월등하다
		//가정집 - 청소기, 공장 - 청소기
		
		//String 클래스는 데이터가 필요한 공간만 메모리 확보
		//새로운 데이터가 들어오면 기존 메모리 없애고 새로 만든다
		//읽기만 가능 중간에 글자 하나 바꾸기는 불가능
		
		//StringBuffer클래스는 미리 데이터 공간을 확보해놓고
		//글자를 넣으면 빈 공간을 채워나가다가 공간이 부족하면 새로 만드는게
		//아니라 필요한 공간 만큼 확보해서 앞의 공간과 연결한다.(LInkedList)
		//중간에 데이터 변환도 가능
		
		String s1;
		s1 = new String("rainbow");
		System.out.println(s1.charAt(0));
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("rainbow");
		buffer.setCharAt(0, 'R');
		System.out.println(buffer.toString());
		
		//자바에서 코드가 실행되는데 걸리는 시간 측정하기
		long start = System.currentTimeMillis();//현재 시간을 밀리초 단위로 들고 옴
		//컴퓨터는 1970년 1월 1일로 생각해서 초 마다 1씩 가산되어 
		int sum = 0;
		for(int i=1; i<=100000; i++)
		{
			sum+=i;
		}
		long end = System.currentTimeMillis();
		
		System.out.printf("걸린 시간 : %d\n", end - start);
		
		start = System.currentTimeMillis();
		for(int i=1; i<=10000; i++)
		{
			s1+=String.valueOf(i); //숫자를 문자열로 전환하는 함수 String.valueOf
		}
		end = System.currentTimeMillis();
		System.out.printf("걸린시간 : %d\n", end - start);
		
		start = System.currentTimeMillis();
		for(int i=1; i<=10000; i++)
		{
			s1+=String.valueOf(i); //숫자를 문자열로 전환하는 함수 String.valueOf
		}
		end = System.currentTimeMillis();
		System.out.printf("걸린시간 : %d\n", end - start);
	}
	
}
