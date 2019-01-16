package test02;

import java.util.Scanner;

public class money {
	public static void main (String[] args) {
		final int dollar_rate = 1100; //추가
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요 (단위 원): ");
		
		int won = scanner.nextInt();
		double dollar = won/dollar_rate; // => won/1100;
		
		System.out.print(won + "원은 ");
		System.out.println("$" + dollar + "입니다.");
	}
}
