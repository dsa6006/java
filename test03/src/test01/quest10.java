package test01;

import java.util.Scanner;

public class quest10 {
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �߽ɰ� �������� �Է��Ͻʽÿ�>> ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radi1 = sc.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� �������� �Է��Ͻʽÿ�>> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radi2 = sc.nextDouble();
		
		double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double rediusSum = radi1 + radi2;
				
		if (distance < rediusSum)
		{
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else
		{
			System.out.println("�� ���� ���� ��ģ��.");
		}
		
	}
}
