
public class ex01 {
	public static void main(String[]args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {//1~10까지 반복
			sum +=i; // sum +=는 sum=sum+i 와 같은뜻임.
			System.out.print(i); // 더하는 수 출력
			if (i<=9) //1~9까지는 '+'출력
				System.out.print("+");
			else { //i가 10인 경우
				System.out.print("="+sum); //'='출력하고 덧셈결과(sum) 출력
			}
		}
	}
}
