package exam02;

// �Ȱ��� ��Ī�� ���� �Լ��� ������ ��� �ִ��� ����ؾߵ�
// �ٵ� �� String�� �߰��� �ȵ���?
import java.util.Scanner;

public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		
		// �빮�� S�� �����ϴ� String���� ���ڿ��� ǥ��(�ݵ�� �빮���ϰ�)
		// ����� ���ǵ�����Ÿ��
		String str = number > 5 ? "5���� ũ��" : "5���� �۴�";
		
		System.out.println(str);
		
		// ���� �Է��� �� �ְ� ����� ��ĳ���Լ��� ������ �����ؼ� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է� : ");
		int num = scan.nextInt();
		
		String res = num % 2 == 1 ? "Ȧ��" : "¦��";
		
		System.out.println(num+"��(��) "+res+"�Դϴ�.");
	}

}
