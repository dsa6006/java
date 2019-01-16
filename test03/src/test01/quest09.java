package test01;

import java.util.Scanner;

public class quest09 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중점(x,y)과 반지름 입력>> ");
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius = sc.nextDouble();
		
		System.out.print("새로운점(x,y)입력>> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		//원의 중점과 신규점 사이의 거리
		double distance = 0;
		
		//Math.sqrt(계산) 이렇게 넣어주면 계산해서 나와줌
		distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		if (distance < radius)
		{
			System.out.println("새 점이 원 안에 있다.");
		}
		else
		{
			System.out.println("새 점이 원 밖에 있다.");
		}
	}
}
