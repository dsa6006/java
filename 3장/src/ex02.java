import java.util.Scanner;

public class ex02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int count=0; //�Էµ� ������ ����
		int sum=0; // ���� ��

		int n = sc.nextInt(); // �����Է�
		while(n != -1) { // -1�� �ԷµǸ� while�� ���
			sum += n;
			count++;
			n = sc.nextInt(); // �����Է�
		}
		
		if(count == 0)
			System.out.println("�Էµ� ������ �����ϴ�.");
		else {
			System.out.print("������ ������ " + count + "���̸�");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
		}
		sc.close();
	}
}

//�����(debugging) 
//1)break point(�ߴ���.���α׷��� ������Ŵ. ��ü�� ������Ű�ų� ������ �ִ� �κ��� ������Ŵ.)
//  ����� ����. ����Ű:F11
//2)step over(���پ� ������) ����Ű:F6
//3)step into(�޼ҵ� ������ ��) ����Ű:F5 , step out(�޼ҵ� ������ ����) 
//4)�ߴ� 1�� �� �߰� . ����Ű:F8-> �߰��� �κб��� �� ������
//5)resume
