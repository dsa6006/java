package test02;

import java.util.Scanner;

public class ex05 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요.>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a+b)>c||(a+c)>b||(b+c)>a) // &&로 해줘야함.
		{
			System.out.println("삼각형이 됩니다.");
		}
		else
		{
			System.out.println("삼각형이 되지 않습니다.");
		}
	}
}
