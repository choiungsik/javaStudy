package exam02;

import java.util.Random;
import java.util.Scanner;
// ctrl+shift+o�� ����ϸ� �����ȵ� import���� �߰���

public class plusgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("====Plus Game ====");
		String replay = "";

		do {
			int num1 = 1 + rand.nextInt(10);
			int num2 = 1 + rand.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			int res = num1 + num2;
			int ask = scan.nextInt();
			if (res == ask) {
				System.out.println("Success");
				break;
			} else {
				System.out.println("Fail");
				System.out.print("����Ͻðڽ��ϱ�? (Y/N) ");
				replay = scan.next();
			}
			// replay�� "Y"�� ��ġ�� �ٲ� ������ Ȯ���ϴ� ���̱⿡ ���������� �۵���
		} while (replay.equals("Y"));
		System.out.println("������ �����մϴ�.");

	}

}
