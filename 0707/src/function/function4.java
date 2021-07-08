package function;

public class function4 {

	   /* void - 함수내의 수행결과를 직접 출력하는 경우에 사용을 하고 
	    *      - 수행결과를 함수 외부로 보내야 할때는 보내야될 값의 형을 지정한다 
	    *      int, double, String, .....
	    *      이럴때는 반드시   return  구문으로 값을 보내야 한다 
	    *      void 의 경우는 생략 가능하다  
	    */
	   public static int add(int x, int y)
	   {
	      return x+y;
	   }
	   
	   public static void add2(int x, int y)
	   {
	      System.out.printf("%d + %d= %d\n", x, y, x+y);
	      return;
	   }
	   
	   public static int sigma(int limit)
	   {
	      int sum=0;
	      for(int i=1; i<=limit; i++)
	         sum+=i;
	      return sum;   
	   }
	   
	   public static void main(String[] args) {
	      
	      int result = add(10, 6);
	      System.out.println(result);
	      
	      System.out.println(add(100,200));
	      
	      //result = add2(10, 10);
	      //System.out.println(add2(100,2100));
	            
	      add2(4,8);
	      
	      System.out.println(sigma(10));
	      System.out.println(sigma(100));
	      System.out.println(sigma(1000));
	      
	      
	      function4 m = new function4(); //객체를 만든다 
	      //객체를 통해서 호출하기 -   static   키워드가 있어도 되고 없어도 된다. 
	      System.out.println( m.sigma(100) );
	      
	   }


}
