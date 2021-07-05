package array;

public class DeepCopy {

		public static void main(String[] args) {
			int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
			int b[]=null;
			
			//자바는 배열변수 선언만으로는 메모리가 없다 
			//배열변수는 참조 변수라서 데이터가 있는 곳의 주소를 저장하기 위한 변수이다
			//new int[10];  이때 heap 이라는 공간에 정수가 들어갈 메모리 
			//              10개를 확보하고 첫번째 방의 주소를 전달한다 
			//              메모리를 못줄때  null값을 전달 
			
			b = a; //얕은복사,  soft copy라고 부른다 
			//a가 가르키는 데이터 공간 주소만 복사, 참조 복사 
			//a 와 b는 같은 기억공간을 가르킨다. 
			a[0]=100;
			
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+ " ");
			}
			System.out.println();
			for(int i=0; i<b.length; i++)
			{
				System.out.print(b[i] + " " );
			}
			System.out.println();
			//배열 a를 배열 b로 복사하기 - hard copy  깊은복사 
			b = new int[a.length];
			for(int i=0; i<a.length; i++)
			{
				b[i] = a[i];
			}
			
			a[0]=1;
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+ " ");
			}
			System.out.println();
			
			for(int i=0; i<b.length; i++)
			{
				System.out.print(b[i]+ " ");
			}
			System.out.println();
		}
}
