package test02;

import java.util.Scanner;

public class money {
	public static void main (String[] args) {
		final int dollar_rate = 1100; //�߰�
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ȭ�� �Է��ϼ��� (���� ��): ");
		
		int won = scanner.nextInt();
		double dollar = won/dollar_rate; // => won/1100;
		
		System.out.print(won + "���� ");
		System.out.println("$" + dollar + "�Դϴ�.");
	}
}
