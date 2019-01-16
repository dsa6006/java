import java.util.Scanner;

public class ex02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int count=0; //입력된 정수의 개수
		int sum=0; // 정수 합

		int n = sc.nextInt(); // 정수입력
		while(n != -1) { // -1이 입력되면 while문 벗어남
			sum += n;
			count++;
			n = sc.nextInt(); // 정수입력
		}
		
		if(count == 0)
			System.out.println("입력된 정수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		sc.close();
	}
}

//디버깅(debugging) 
//1)break point(중단점.프로그램을 정지시킴. 전체를 정지시키거나 문제가 있는 부분을 정지시킴.)
//  디버그 실행. 단축키:F11
//2)step over(한줄씩 내려감) 단축키:F6
//3)step into(메소드 안으로 들어감) 단축키:F5 , step out(메소드 밖으로 나옴) 
//4)중단 1개 더 추가 . 단축키:F8-> 추가한 부분까지 쭉 내려옴
//5)resume
