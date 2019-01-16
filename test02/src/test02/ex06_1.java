package test02;

import java.util.Scanner;

public class ex06_1 
{
	public static void main (String[]args)
	{
		int cnt = 0; //3 6 9 갯수
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오>> ");
		int input = sc.nextInt();
		
		if(input>=1 && input <=99)
		{
			int ten;
			int one;
			ten = input/10; //십자리 숫자
			one = input%10; //일자리 숫자
			
			if((ten !=0) && (ten % 3 == 0))
				cnt++;
			
			if((one !=0) && (one % 3 == 0))
				cnt++;
			
			if(cnt==1)
			{
				System.out.println("박수 짝");
			}
			else if(cnt==2)
			{
				System.out.println("박수 짝짝");
			}
		}
		else
		{
			System.out.println("1~99사이의 정수를 입력하십시오.");
			return;
		}
		sc.close();
	}
}