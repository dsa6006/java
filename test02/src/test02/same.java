package test02;

import java.util.Scanner;

public class same {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int a = sc.nextInt();

		if( a<10 || a >99)
		{
			System.out.println("10~99�� �Է����ּ���");
		} // �߰�
		
		int b = a/10;//a=58 58/10 = 5.8 -> 10�� �ڸ� int�̱⶧���� 0.8�� ©��.
		int c = a%10;//a=58 58%10 = ���������� 8��.-> 1�� �ڸ�.
		
		if(b==c) 
		{
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else 
		{
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
		sc.close(); //�߰�
		return; //�߰�
	}
}
