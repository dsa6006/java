package test01;

import java.util.Scanner;

public class quest12 {
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>> ");
		
		double a = sc.nextDouble();
		String str = sc.next();
		double b = sc.nextDouble();
		
		double sum = 0;
		
		if (str.equals("+")){
			sum =  a+b;
			System.out.println(a+str+b+"계산 결과는"+sum);
		}
		else if (str.equals("-")){
			sum =  a-b;
			System.out.println(a+str+b+"계산 결과는"+sum);
		}
		else if (str.equals("*")){
			sum =  a*b;
			System.out.println(a+str+b+"계산 결과는"+sum);
		}
		else if (str.equals("/")){	
			if(a==0 || b==0){
				System.out.println("계산불가");
			}
		else{
				sum =  a/b;
				System.out.println(a+str+b+"계산 결과는"+sum);
			}
		}
		else
		{
			System.out.println("사칙연산이 아닙니다.");
		}
	}
}
