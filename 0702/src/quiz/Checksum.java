package quiz;

import java.util.Scanner;

public class Checksum {

	public static void main(String[] args) {
		int i;
		int j=2;
		String idNum = "";
		int sum = 0; 
		int lastNum;
		int rest;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���");
		idNum = sc.next();
		lastNum =idNum.charAt((idNum.length()-1))-'0';
		for(i=0; i<idNum.length()-1;i++) {
			sum+=(idNum.charAt(i)-'0')*j;
			j++;
			if(j==10) {
				j=2;
			}
		}
		rest = sum%11;
		if(11-rest==lastNum) {
			System.out.println("�´�");
		}else {
			System.out.println("Ʋ����");
		}

	}

}
