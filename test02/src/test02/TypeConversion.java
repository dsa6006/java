package test02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); //b가 int 타입으로 자동 변환
		System.out.println(10/4); //정수 나누기이므로 결과는 2
		System.out.println(10.0/4); // 실수 나누기이므로 결과는 2.5
		System.out.println((char)0x12340041); //char로 변환된 결과 0x0041로서 문자 'A'
		System.out.println((byte)(b+i)); //b+i는 227. 16진수 0xE3. 즉 -29
		System.out.println((int)2.9+1.8);  //int타입이므로 뒤에 0.9가 날아가서 2+1.8이 됨.
		System.out.println((int)(2.9+1.8)); //더하고 날아가서 4가됨.
		System.out.println((int)2.9+(int)1.8); //0.9랑0.8이 날아가서 2+1이되서 3이됨.
	}

}
//실수타입 제외 나머지 타입 + int(정수타입) = int타입으로 자동변환함.




