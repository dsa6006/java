import java.util.Scanner;

public class ex05 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 5�� �Է��ϼ���.");
		
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = sc.nextInt(); // Ű���忡�� ���� �Է�
			if(n <= 0)
				continue; // ����� �ƴ� ��� ���� �ݺ����� ����
			else
				sum +=n; // ����� ��� ����
		}
		System.out.println("����� ���� "+ sum);
		
		sc.close();
	}
}
