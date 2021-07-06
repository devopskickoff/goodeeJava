package twoDimensionalArray;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		int [][]a; //이차원배열 - 참조의 참조이다 
	      
	      a = new int[3][4]; //배열을 담을 배열을 만든다 
	                         //행, 열 
	      
	      a[0][0]=10;
	      a[0][1]=11;
	      a[0][2]=12;
	      a[0][3]=13;
	      
	      a[1][0]=14;
	      a[1][1]=15;
	      a[1][2]=16;
	      a[1][3]=17;
	      
	      a[2][0]=18;
	      a[2][1]=19;
	      a[2][2]=20;
	      a[2][3]=21;
	      
	      int i, j;
	      for(i=0; i<a.length; i++)
	      {
	         for(j=0; j<a[i].length; j++)
	         {
	            System.out.printf("%3d", a[i][j]);
	         }
	         System.out.println();
	      }
	      
	      
	      //가변배열
	      a[0] = new int[3];
	      a[1] = new int[4];
	      a[2] = new int[5];
	      
	      int k =1;
	      for(i=0; i<a.length; i++)
	      {
	         for(j=0; j<a[i].length; j++)
	         {
	            a[i][j] = k++;
	         }
	      }
	      
	      for(i=0; i<a.length; i++)
	      {
	         for(j=0; j<a[i].length; j++)
	         {
	            System.out.printf("%3d", a[i][j]);
	         }
	         System.out.println();
	      }

	      
	      
	      
	}

}
