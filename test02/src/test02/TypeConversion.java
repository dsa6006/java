package test02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); //b�� int Ÿ������ �ڵ� ��ȯ
		System.out.println(10/4); //���� �������̹Ƿ� ����� 2
		System.out.println(10.0/4); // �Ǽ� �������̹Ƿ� ����� 2.5
		System.out.println((char)0x12340041); //char�� ��ȯ�� ��� 0x0041�μ� ���� 'A'
		System.out.println((byte)(b+i)); //b+i�� 227. 16���� 0xE3. �� -29
		System.out.println((int)2.9+1.8);  //intŸ���̹Ƿ� �ڿ� 0.9�� ���ư��� 2+1.8�� ��.
		System.out.println((int)(2.9+1.8)); //���ϰ� ���ư��� 4����.
		System.out.println((int)2.9+(int)1.8); //0.9��0.8�� ���ư��� 2+1�̵Ǽ� 3�̵�.
	}

}
//�Ǽ�Ÿ�� ���� ������ Ÿ�� + int(����Ÿ��) = intŸ������ �ڵ���ȯ��.




