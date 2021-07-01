package quiz;

public class Quiz6 {

	public static void main(String[] args) {
		/*Quiz7-1 이중 포문
		* ABCDEFGHIJKLMNOPQRSTUVWXYZ
		* BCDEFGHIJKLMNOPQRSTUVWXYZA
		* CDEFGHIJKLMNOPQRSTUVWXYZAB
		* DEFGHIJKLMNOPQRSTUVWXYZABC
		* ...
		* ZABCDEFGHIJKLMNOPQRSTUVWXY
		*/
		int i;
		int j;
//		char z;
//		char k = 'A';
//		for(i = 1;i<=26;i++) {
//			System.out.print(k);
//			k++;
//			z=k;
//			for(j =1; j<=25;j++) {
//				if(z>'Z') z = 'A';
//				System.out.print(z++);
//			}
//			System.out.println();
//		}
		int k;
		int z;
		for(i=0; i<26; i++) {
			k='A'+i;
			for(z=0; z<26;z++) {
				System.out.printf("%c", k++);
				if(k>'Z') {
					k = 'A';
				}
			}
			System.out.println();
		}
		
		
		/*Quiz7-2
		 * 1 = 1
		 * 1 + 2 =3
		 * 1 + 2 + 3 = 6
		 */
		
		/*int i;
		int j;
		int hap;
		for(i=1;i<=10;i++) {
			hap = 0;
			for(j=1;j<=i;j++) {
				System.out.print(j);
				if(j!=i) System.out.print("+");
				hap+=j;
			}
			System.out.println("="+hap);
		}
		*/
	}
}
