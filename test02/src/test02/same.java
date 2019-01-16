package test02;

import java.util.Scanner;

public class same {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int a = sc.nextInt();

		if( a<10 || a >99)
		{
			System.out.println("10~99만 입력해주세요");
		} // 추가
		
		int b = a/10;//a=58 58/10 = 5.8 -> 10의 자리 int이기때문에 0.8이 짤림.
		int c = a%10;//a=58 58%10 = 나머지값이 8임.-> 1의 자리.
		
		if(b==c) 
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else 
		{
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		sc.close(); //추가
		return; //추가
	}
}
