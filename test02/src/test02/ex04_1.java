package test02;

import java.util.Scanner;

public class ex04_1 
{
	public static void main(String[] args)
	{
		int middle_number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		//middle_number = n1;
		
		if((n1>=n2 && n1<=n3) || (n1>=n2 && n1<=n3))
		{
			middle_number = n1;
		}
		else if((n2>=n1 && n1<=n3) || (n2>=n1 && n1<=n3))
		{
			middle_number = n2;
		}
		else 
		{
			middle_number = n3;
		}
		System.out.println("중간값은 " + middle_number);
	}
}
