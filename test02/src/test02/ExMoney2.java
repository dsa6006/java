package test02;

import java.util.Scanner;

public class ExMoney2 {
	public static void main (String[] args) 
	{
		int won=0;
		int cnt=0;//화폐 개수
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오: ");
		
		won = sc.nextInt();
		
		cnt = won/50000;//5만원 지폐개수
		won = won%50000;//5만원권 뺀 나머지
		
		if (cnt >0)
		{
			System.out.println("오만원권은 " + cnt + "매 입니다.");
		}
		
		cnt = won/10000;
		won = won%10000;
		
		if (cnt >0)
		{
			System.out.println("만원권은 " + cnt + "매 입니다.");
		}
		
		cnt = won/1000;
		won = won%1000;
		
		if (cnt >0)
		{
			System.out.println("천원권은 " + cnt + "매 입니다.");
		}
		
		cnt = won/100;
		won = won%100;
		
		if (cnt >0)
		{
			System.out.println("백원은 " + cnt + "개 입니다.");
		}
		
		cnt = won/50;
		won = won%50;
		
		if (cnt >0)
		{
			System.out.println("오십원은 " + cnt + "개 입니다.");
		}
		
		cnt = won/10;
		won = won%10;
		
		if (cnt >0)
		{
			System.out.println("십원은 " + cnt + "개 입니다.");
		}
		cnt = won/1;
		won = won%1;
		
		if (cnt >0)
		{
			System.out.println("일원은 " + cnt + "개 입니다.");
		}
	}
}
