package test01;

import java.util.Scanner;

public class quest10 {
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 원의 중심과 반지름을 입력하십시오>> ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radi1 = sc.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름을 입력하십시오>> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radi2 = sc.nextDouble();
		
		double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double rediusSum = radi1 + radi2;
				
		if (distance < rediusSum)
		{
			System.out.println("두 원은 서로 겹친다.");
		}
		else
		{
			System.out.println("두 원은 서로 겹친다.");
		}
		
	}
}
