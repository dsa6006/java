package test02;

public class BitShiftOperator {
	public static void main (String [] args) {
		short a = (short) 0x55ff;
		short b = 0x00ff;
		
		//비트 연산
		System.out.printf("%x\n", a & b); //printf("%x\n",...)는 결과 값을 16진수 형식으로 출력
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);
		
		byte c = 20; //0x14 byte = 8bit : 00000000 2진수 표현
		/*  0  0  0  0  0  0  0  0  
		   128 64 32 16 8  4  2  1
		   20을 표현하기 위해서는 어떻게 해야 할까?
		   이것이 20 : 00010100*/
		byte d = -8; //0xf8.
		/*  0  0  0  0  0  0  0  0  
		   128 64 32 16 8  4  2  1
		   -8을 표현하기 위해서는 어떻게 해야 할까?
		   -8 : 11111000
		   00000111의 반대화 0를 1로 바꾸고 1를 0으로 바꾼다.*/
		//시프트 연산
		System.out.println(c<<2); //c를 2비트 왼쪽 시프트 01010000 = 80
		System.out.println(c>>2); //c를 2비트 오른쪽 시프트. 0 삽입 00000101 = 5
		System.out.println(d>>2); //d를 2비트 오른쪽 시프트. 1 삽입 11111110 = -2    11111111 = -1
		System.out.printf("%x\n",d>>>2); //d를 2비트 오른쪽 시프트. 0 삽입 
	}
}
