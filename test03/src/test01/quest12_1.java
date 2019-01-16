package test01;

import java.util.Scanner;

public class quest12_1 {
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>> ");
		
		double a = sc.nextDouble();
		String str = sc.next();
		double b = sc.nextDouble();
		
		double sum = 0;
		
		switch(str)
		{
		case "+":
			sum = a+b;
			break;
		case "-":
			sum = a-b;
			break;
		case "*":
			sum = a*b;
			break;
		case "/":
			if(a==0 || b==0){
				System.out.println("계산불가");
				sc.close();
			}
			sum = a/b;
			break;
		}
	}
}
