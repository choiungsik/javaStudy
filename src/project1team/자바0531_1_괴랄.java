package project1team;

import java.util.Scanner;

public class �ڹ�0531_1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ���. :");
		int num = sc.nextInt();
		System.out.print(num + " = ");
		String str = "";
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				str += i + "*";
				num = num / i;
			}
		}
		System.out.println(str.substring(0, str.length() - 1));
	}
}
