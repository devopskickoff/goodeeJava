package function;

public class function4 {

	   /* void - �Լ����� �������� ���� ����ϴ� ��쿡 ����� �ϰ� 
	    *      - �������� �Լ� �ܺη� ������ �Ҷ��� �����ߵ� ���� ���� �����Ѵ� 
	    *      int, double, String, .....
	    *      �̷����� �ݵ��   return  �������� ���� ������ �Ѵ� 
	    *      void �� ���� ���� �����ϴ�  
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
	      
	      
	      function4 m = new function4(); //��ü�� ����� 
	      //��ü�� ���ؼ� ȣ���ϱ� -   static   Ű���尡 �־ �ǰ� ��� �ȴ�. 
	      System.out.println( m.sigma(100) );
	      
	   }


}
