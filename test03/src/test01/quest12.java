package test01;

import java.util.Scanner;

public class quest12 {
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("����>> ");
		
		double a = sc.nextDouble();
		String str = sc.next();
		double b = sc.nextDouble();
		
		double sum = 0;
		
		if (str.equals("+")){
			sum =  a+b;
			System.out.println(a+str+b+"��� �����"+sum);
		}
		else if (str.equals("-")){
			sum =  a-b;
			System.out.println(a+str+b+"��� �����"+sum);
		}
		else if (str.equals("*")){
			sum =  a*b;
			System.out.println(a+str+b+"��� �����"+sum);
		}
		else if (str.equals("/")){	
			if(a==0 || b==0){
				System.out.println("���Ұ�");
			}
		else{
				sum =  a/b;
				System.out.println(a+str+b+"��� �����"+sum);
			}
		}
		else
		{
			System.out.println("��Ģ������ �ƴմϴ�.");
		}
	}
}
