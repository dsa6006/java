package test02;

public class CMain {
	//main() �޼ҵ忡�� ���� ����
	public static void main(String[] atgs) {
		int i = 20;
		int s;
		char a = '?';

		hello h = new hello();
		//1�� �޼ҵ� ���
		s= h.sum(i, 10);	//�޼ҵ� ȣ��
		System.out.println(a);	//���� '?' ���
		System.out.println("Hello");//"Hello" ���ڿ� ���
		System.out.println(s); //���� s �� 30 ���
		}
}