package test02;

import java.util.Scanner;

public class ex05_1 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3���� �Է��ϼ���.>>");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1<(n2+n3)&& n2<(n1+n3)&&n3<(n1+n2))
		{
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		else
		{
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		}
}
}