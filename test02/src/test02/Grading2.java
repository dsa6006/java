package test02;

import java.util.Scanner;

public class Grading2 {
	public static void main (String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while(a.hasNext()) // a.hasNext() => true�� ����.
		{ 
			int score = a.nextInt();
			switch(score/10)
			//score���� Int������ ���´�. ���� / ���� = ����... ���������� �Ҽ����� ©����.
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
			default://���� �ִ� case�� ���� ������ ��� ��
				grade = 'F';
			}
		System.out.println("������ "+grade+"�Դϴ�.");
		}
	}
}
