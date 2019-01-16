package test02;

import java.util.Scanner;

public class ex04 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		if ((f>s)&&(f<t))
		{
			System.out.println("중간값은 " + f + "입니다.");
		}
		else if ((f<s)&&(f>t))
		{
			System.out.println("중간값은 " + f + "입니다.");
		}
		
		if ((s>f)&&(s<t))
		{
			System.out.println("중간값은 " + s + "입니다.");
		}
		else if ((s<f)&&(s>t))
		{
			System.out.println("중간값은 " + s + "입니다.");
		}
		
		if ((t>f)&&(t<s))
		{
			System.out.println("중간값은 " + t + "입니다.");
		}
		else if ((t<f)&&(t>s))
		{
			System.out.println("중간값은 " + t + "입니다.");
		}
	}
}
