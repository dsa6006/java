package test02;
	
	import java.util.Scanner;
	
public class SuccessOrFail {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = in.nextInt();
		if (score >= 80) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");}
		else
			{System.out.println("�ƽ����� ���հ��Դϴ�.");}
	}
}
