package test02;

import java.util.Scanner;

public class ex06 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99������ ������ �Է��Ͻÿ�>> ");
		
		int a = sc.nextInt();
		//�����ڸ��ϳ�
		if (a/10%10 == 3)
		{
			System.out.println("�ڼ� ¦");
		}
		if (a/10%10 == 6)
		{
			System.out.println("�ڼ� ¦");
		}
		if (a/10%10 == 9)
		{
			System.out.println("�ڼ� ¦");
		}
		//�����ڸ��ϳ�
		if (a/1%10 == 3)
		{
			System.out.println("�ڼ� ¦");
		}
		if (a/1%10 == 6)
		{
			System.out.println("�ڼ� ¦");
		}
		if (a/1%10 == 9)
		{
			System.out.println("�ڼ� ¦");
		}
		//�Ѵٿ��°��
		if ((a/10%10==3)&&(a/1%10==3))
		{
			System.out.println("�ڼ� ¦¦");
		}
		if ((a/10%10==3)&&(a/1%10==6))
		{
			System.out.println("�ڼ� ¦¦");
		}
		if ((a/10%10==3)&&(a/1%10==9))
		{
			System.out.println("�ڼ� ¦¦");
		}
	}
}
