package test;

import java.util.Scanner;

public class test04 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String s = sc.next(); //스트링은 여러글자이지만 차르는 한글자.
		char c = s.charAt(0); // 스트링으로 받은 첫번째 글자를 차르 0번째로 바꿔주는것.
		
		for(char i=c; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
