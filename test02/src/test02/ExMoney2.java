package test02;

import java.util.Scanner;

public class ExMoney2 {
	public static void main (String[] args) 
	{
		int won=0;
		int cnt=0;//ȭ�� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�: ");
		
		won = sc.nextInt();
		
		cnt = won/50000;//5���� ���󰳼�
		won = won%50000;//5������ �� ������
		
		if (cnt >0)
		{
			System.out.println("���������� " + cnt + "�� �Դϴ�.");
		}
		
		cnt = won/10000;
		won = won%10000;
		
		if (cnt >0)
		{
			System.out.println("�������� " + cnt + "�� �Դϴ�.");
		}
		
		cnt = won/1000;
		won = won%1000;
		
		if (cnt >0)
		{
			System.out.println("õ������ " + cnt + "�� �Դϴ�.");
		}
		
		cnt = won/100;
		won = won%100;
		
		if (cnt >0)
		{
			System.out.println("����� " + cnt + "�� �Դϴ�.");
		}
		
		cnt = won/50;
		won = won%50;
		
		if (cnt >0)
		{
			System.out.println("���ʿ��� " + cnt + "�� �Դϴ�.");
		}
		
		cnt = won/10;
		won = won%10;
		
		if (cnt >0)
		{
			System.out.println("�ʿ��� " + cnt + "�� �Դϴ�.");
		}
		cnt = won/1;
		won = won%1;
		
		if (cnt >0)
		{
			System.out.println("�Ͽ��� " + cnt + "�� �Դϴ�.");
		}
	}
}
