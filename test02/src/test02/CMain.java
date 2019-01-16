package test02;

public class CMain {
	//main() 메소드에서 실행 시작
	public static void main(String[] atgs) {
		int i = 20;
		int s;
		char a = '?';

		hello h = new hello();
		//1번 메소드 사용
		s= h.sum(i, 10);	//메소드 호출
		System.out.println(a);	//문자 '?' 출력
		System.out.println("Hello");//"Hello" 문자열 출력
		System.out.println(s); //정수 s 값 30 출력
		}
}