package test02;

import java.util.Scanner;

public class Grading2 {
	public static void main (String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while(a.hasNext()) // a.hasNext() => true와 같음.
		{ 
			int score = a.nextInt();
			switch(score/10)
			//score값이 Int값으로 들어온다. 정수 / 정수 = 정수... 정수값에는 소수점이 짤린다.
			{
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default://위에 있는 case의 값을 제외한 모든 값
				grade = 'F';
			}
		System.out.println("학점은 "+grade+"입니다.");
		}
	}
}
