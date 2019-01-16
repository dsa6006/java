package test01;

import java.util.Scanner;

public class quest07 {
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)를 입력하십시오>> ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if ((x >= 100 && x <= 200)&&(y >= 100 && y <= 200))
		{
			System.out.println("("+ x + "," + y +")는 사각형 안에 있습니다.");
		}
		else
		{
			System.out.println("("+ x + "," + y +")는 사각형 안에 없습니다.");
		}
	}
}