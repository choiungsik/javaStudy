package exam02;

import java.util.Scanner;

public class while�ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڸ� �Է¹޴µ� Ȧ������ ¦���� ������ Ȯ���ϰ� -1�� �ԷµǾ��� �� �����ϴ� ���α׷�
		
		Scanner scan = new Scanner(System.in);
		int count_o = 0;     // Ȧ���� ���� odd
		int count_t = 0;     // ¦���� ���� even
		
		while (true) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			if (num == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}if (num%2==0) {
				count_t++;
			}else {
				count_o++;
			}
			System.out.println("¦������ : "+count_t);
			System.out.println("Ȧ������ : "+count_o);
		}
		
	}

}
