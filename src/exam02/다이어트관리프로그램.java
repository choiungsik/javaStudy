package exam02;

import java.util.Scanner;

public class ���̾�Ʈ�������α׷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ : ");
		int n_wei = scan.nextInt();
		System.out.print("��ǥ ������ : ");
		int g_wei = scan.nextInt();
		int count = 0;
		while (true) {
			count++;
			System.out.print(count + "���� ���� ������ : ");
			int l_wei = scan.nextInt();
			n_wei -= l_wei;
			if (n_wei <= g_wei) {
				System.out.println(n_wei + "kg �޼�!! �����մϴ�!!");
				break;
			}
		}
	}

}
