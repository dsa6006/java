package test02;

import java.util.Scanner;

public class ex06 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오>> ");
		
		int a = sc.nextInt();
		//십의자리하나
		if (a/10%10 == 3)
		{
			System.out.println("박수 짝");
		}
		if (a/10%10 == 6)
		{
			System.out.println("박수 짝");
		}
		if (a/10%10 == 9)
		{
			System.out.println("박수 짝");
		}
		//일의자리하나
		if (a/1%10 == 3)
		{
			System.out.println("박수 짝");
		}
		if (a/1%10 == 6)
		{
			System.out.println("박수 짝");
		}
		if (a/1%10 == 9)
		{
			System.out.println("박수 짝");
		}
		//둘다오는경우
		if ((a/10%10==3)&&(a/1%10==3))
		{
			System.out.println("박수 짝짝");
		}
		if ((a/10%10==3)&&(a/1%10==6))
		{
			System.out.println("박수 짝짝");
		}
		if ((a/10%10==3)&&(a/1%10==9))
		{
			System.out.println("박수 짝짝");
		}
	}
}
