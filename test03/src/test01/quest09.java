package test01;

import java.util.Scanner;

public class quest09 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����(x,y)�� ������ �Է�>> ");
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius = sc.nextDouble();
		
		System.out.print("���ο���(x,y)�Է�>> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		//���� ������ �ű��� ������ �Ÿ�
		double distance = 0;
		
		//Math.sqrt(���) �̷��� �־��ָ� ����ؼ� ������
		distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		if (distance < radius)
		{
			System.out.println("�� ���� �� �ȿ� �ִ�.");
		}
		else
		{
			System.out.println("�� ���� �� �ۿ� �ִ�.");
		}
	}
}
