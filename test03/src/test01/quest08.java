package test01;

import java.util.Scanner;

public class quest08 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2)&&(y >= recty1 && y <= recty2))
			return true;//입력점 1개가 사각형 안에 있다.
		else return false;
	}

	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("두 점 (x1,y1),(x2,y2)를 입력하십시오>> ");
		
		int x1 = sc.nextInt();//첫번째 점
		int y1 = sc.nextInt();
		
		int x2 = sc.nextInt();//두번째 점
		int y2 = sc.nextInt();
		
		//if(비교식 넣으면 논리값이 나옴.)
		if (inRect(x1,y1,100,100,200,200)&&inRect(x2,y2,100,100,200,200)
				&&inRect(x1,y2,100,100,200,200)&&inRect(x2,y1,100,100,200,200))
		{
			System.out.println("새 사각형이 안에 포함 되어있다.");
		}
		else if (inRect(x1,y1,100,100,200,200)||inRect(x2,y2,100,100,200,200)
					||inRect(x1,y2,100,100,200,200)||inRect(x2,y1,100,100,200,200))
			{
				System.out.println("한점이라도 안에있다.");
			}
		else if (inRect(100,100,x1,y1,x2,y2)&&inRect(200,200,x1,y1,x2,y2)
					&&inRect(100,200,x1,y1,x2,y2)&&inRect(200,100,x1,y1,x2,y2))
			{
				System.out.println("새 사각형이 밖에서 포함하고 있다.");
			}
		else
		{
			System.out.println("두 사각형의 충돌이 일어나지 않습니다.");
		}
	}
}
