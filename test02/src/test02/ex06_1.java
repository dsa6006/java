package test02;

import java.util.Scanner;

public class ex06_1 
{
	public static void main (String[]args)
	{
		int cnt = 0; //3 6 9 ����
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99������ ������ �Է��Ͻÿ�>> ");
		int input = sc.nextInt();
		
		if(input>=1 && input <=99)
		{
			int ten;
			int one;
			ten = input/10; //���ڸ� ����
			one = input%10; //���ڸ� ����
			
			if((ten !=0) && (ten % 3 == 0))
				cnt++;
			
			if((one !=0) && (one % 3 == 0))
				cnt++;
			
			if(cnt==1)
			{
				System.out.println("�ڼ� ¦");
			}
			else if(cnt==2)
			{
				System.out.println("�ڼ� ¦¦");
			}
		}
		else
		{
			System.out.println("1~99������ ������ �Է��Ͻʽÿ�.");
			return;
		}
		sc.close();
	}
}