package test02;

public class BitShiftOperator {
	public static void main (String [] args) {
		short a = (short) 0x55ff;
		short b = 0x00ff;
		
		//��Ʈ ����
		System.out.printf("%x\n", a & b); //printf("%x\n",...)�� ��� ���� 16���� �������� ���
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);
		
		byte c = 20; //0x14 byte = 8bit : 00000000 2���� ǥ��
		/*  0  0  0  0  0  0  0  0  
		   128 64 32 16 8  4  2  1
		   20�� ǥ���ϱ� ���ؼ��� ��� �ؾ� �ұ�?
		   �̰��� 20 : 00010100*/
		byte d = -8; //0xf8.
		/*  0  0  0  0  0  0  0  0  
		   128 64 32 16 8  4  2  1
		   -8�� ǥ���ϱ� ���ؼ��� ��� �ؾ� �ұ�?
		   -8 : 11111000
		   00000111�� �ݴ�ȭ 0�� 1�� �ٲٰ� 1�� 0���� �ٲ۴�.*/
		//����Ʈ ����
		System.out.println(c<<2); //c�� 2��Ʈ ���� ����Ʈ 01010000 = 80
		System.out.println(c>>2); //c�� 2��Ʈ ������ ����Ʈ. 0 ���� 00000101 = 5
		System.out.println(d>>2); //d�� 2��Ʈ ������ ����Ʈ. 1 ���� 11111110 = -2    11111111 = -1
		System.out.printf("%x\n",d>>>2); //d�� 2��Ʈ ������ ����Ʈ. 0 ���� 
	}
}
