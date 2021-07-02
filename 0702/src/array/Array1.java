package array;

public class Array1 {
   public static void main(String[] args) {
      int []arr;//arr이라는 참조형 변수만 만들고 
      //이 변수는 데이터가 들어갈 공간이 없다. 
      //자바에서 배열은 별도의 메모리 공간을 확보해야 한다
      
      //new  연산자 -  heap 공간에서 메모리를 확보한 후 
      //공간이 충분하면 공간의 첫번째 방 주소, 공간이 부족하면
      //null값을 전달한다 
      
      arr = new int[10];
      System.out.println(arr);
      
      arr = new int[10];// 새로운 메모리와 손을 잡으면서 
      //아까 메모리는 가비지(gabage) 쓰레기가 되고 
      //JVM 에 있는 쓰레기 수집기가 틈날때 쓰레기를 수집한다
      //자바가 안정적이다. 
      System.out.println(arr);
      
      //인덱싱- 방번호로 데이터를 접근할 수 있다 
      //방번호는 0부터 시작한다
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;
      arr[3] = 4;
      arr[4] = 5;
      arr[5] = 6;
      arr[6] = 7;
      arr[7] = 8;
      arr[8] = 9;
      arr[9] = 10;
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
      System.out.println(arr[3]);
      System.out.println(arr[4]);
      System.out.println(arr[5]);
      System.out.println(arr[6]);
      System.out.println(arr[7]);
      System.out.println(arr[8]);
      System.out.println(arr[9]);
      //System.out.println(arr[10]);
      //Index out of range, 실행에러 
      //for 문을 사용하여 10, 20, 30 ....
      //arr[i]=(i+1)*10
      int i;
      for(i=0; i<arr.length; i++)
      {
         arr[i] = (i+1)*10;
      }
      
      for(i=0; i<arr.length; i++)
      {
         System.out.println(arr[i]);
      }
      
      int []a= new int[] {1,2,3,4,5,6,7,8,9,10};
      for(i=0; i<a.length; i++)
      {
         System.out.println(a[i]);
      }
      
      double []d=new double[5];
      d[0]=10.0;
      d[1]=20.0;
      d[2]=30.0;
      for(i=0; i<d.length; i++)
      {
         System.out.println(d[i]);
      }
      
   }
   
   
}