package test;

import java.util.Scanner;

public class test04 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
		String s = sc.next(); //��Ʈ���� �������������� ������ �ѱ���.
		char c = s.charAt(0); // ��Ʈ������ ���� ù��° ���ڸ� ���� 0��°�� �ٲ��ִ°�.
		
		for(char i=c; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
