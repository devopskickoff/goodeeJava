package rectangle;
import java.util.Scanner;

/* 1.������ ���� ���� (�Էµ�����, ��µ�����)
	 �Էµ����� : ����, ����
	 ��µ����� : ����
	 
   2. ����� ����� ������ ������
   		int width, height;
   		int surface;
   3.������ �Է�
   4.��� - �Է¹��� ������ ���
   5.���
*/

public class Rectangle {
	public static void main(String[] args) {
		int width, height;
		int surface;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� :");
		width = sc.nextInt();
		System.out.println("���� :");
		height = sc.nextInt();
		
		surface = width * height;
		System.out.println("������" + surface + "�Դϴ�");
		
	}
}
