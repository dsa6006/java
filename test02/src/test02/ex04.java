package test02;

import java.util.Scanner;

public class ex04 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");
		
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		if ((f>s)&&(f<t))
		{
			System.out.println("�߰����� " + f + "�Դϴ�.");
		}
		else if ((f<s)&&(f>t))
		{
			System.out.println("�߰����� " + f + "�Դϴ�.");
		}
		
		if ((s>f)&&(s<t))
		{
			System.out.println("�߰����� " + s + "�Դϴ�.");
		}
		else if ((s<f)&&(s>t))
		{
			System.out.println("�߰����� " + s + "�Դϴ�.");
		}
		
		if ((t>f)&&(t<s))
		{
			System.out.println("�߰����� " + t + "�Դϴ�.");
		}
		else if ((t<f)&&(t>s))
		{
			System.out.println("�߰����� " + t + "�Դϴ�.");
		}
	}
}
