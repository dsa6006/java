package test02;

import java.util.Scanner;

public class money2 {
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�: ");
		
		int won = sc.nextInt();

		int a=0, b=0, c=0, d=0, e=0, f=0, g=0;

		if (won>=50000)
		{
			a=won/50000;
		}
		if (won>=10000)
		{
			if(a >=1 ) {
				b=won/10000-5;
			}else {
				b=won/10000;
			}	
		}
		if (won>=1000)
		{	
			c=won/1000%10;
		}
		if (won>=100)
		{
			d=won/100%10;
		}
		if (won>=50)
		{
			e=won%100/50; 
		}
		if (won>=10)
		{
			if (d>=1) {
				f=won/10%10-5;
			}else {
				f=won/10%10;
			}
			
		}
		if (won>=1)
		{
			g=won/1%10;
		}
		
		System.out.println("�������� " + a + "��");
		System.out.println("������ " + b + "��");
		System.out.println("õ���� " + c + "��");
		System.out.println("��� " + d + "��");
		System.out.println("���ʿ� " + e + "��");
		System.out.println("�ʿ� " + f + "��");
		System.out.println("�Ͽ� " + g + "��");
	}
}
