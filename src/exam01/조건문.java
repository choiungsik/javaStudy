package exam01;

import java.util.Scanner;

public class ���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if (���ǽ� ) {
		// ���๮��;
		// ���๮��;
		// } �߰�ȣ ������ �� ctrl+shift+f�� ���� �ڵ����İ���
		// ���๮���� 1���� �� �߰�ȣ ���� ��밡��
		// ���� �������� �Ʒ��� ������ �ٷ� ���� �ִ� �͸� �ν��ؼ� ������
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		if (num%15==0){
			System.out.println("3�� 5�� ������Դϴ�.");
		}else if (num%3==0){
			System.out.println("3�� ����Դϴ�.");
		}else if (num%5==0){
			System.out.println("5�� ����Դϴ�.");
		}else {
			System.out.println("3�� 5�� ����� �ƴմϴ�.");
		}
	}
}
