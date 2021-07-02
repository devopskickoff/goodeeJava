package quiz;

public class Quiz22 {

	   public static void main(String[] args) {
		      String num1 = "123";  // '1', '2', '3'
		      String num2 = "345";  // '3', '4', '5'
		      
		      System.out.println( '0'-'0');
		      System.out.println( '1'-'0');
		      System.out.println( '2'-'0');
		      
		      // "123" - 123 전환하는 방법 
		      /*
		       *  num=0;
		       *  0   * 10 + '1'-'0' = 1
		       *  1   * 10 + '2'-'0' = 12
		       *  12  * 10 + '3'-'0' = 123 
		       *  123 * 10 + '4'-'0' = 1234 
		       *  
		       *  num=0;
		       *  num   * 10 + '1'-'0' = 1
		       *  num   * 10 + '2'-'0' = 12
		       *  num   * 10 + '3'-'0' = 123 
		       *  num   * 10 + '4'-'0' = 1234 
		       *  
		       */
		      
		      int num, i;
		      num=0;
		      for(i=0; i<num1.length(); i++)
		      {
		         num = num *10 + num1.charAt(i)-'0';
		      }
		      System.out.println(num); 
		   }

}
