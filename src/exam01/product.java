package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList�� ����� ���� ��ҷ� productclass�� �ְڴٰ� ���� �� ����
		ArrayList<productclass> prolist = new ArrayList<productclass>();
		Scanner scan = new Scanner(System.in);
		int input = 0;

		while (input != 3) {
			System.out.print("[1]���� �߰� [2]���� �Ǹŷ� ��ȸ [3]���� >> ");
			input = scan.nextInt();
			if (input == 1) {
				System.out.print("���� �̸� : ");
				String pname = scan.next();
				System.out.print("�ܰ� : ");
				int pprice = scan.nextInt();
				System.out.print("���� : ");
				int pamount = scan.nextInt();

				// productclass ��ü�� ���� �ְڴٰ� ������ ArrayList�� ����(��ü�� ���� �ּ� ä ����)
				productclass pro = new productclass(pname, pprice, pamount);
				prolist.add(pro);
			} else if (input == 2) {
				if (prolist.size() == 0) {
					System.out.println("�߰��� ������ �����ϴ�.");
				} else {
					System.out.println("��ǰ��\t�ܰ�\t����");
					int total = 0;
					for (int i = 0; i < prolist.size(); i++) {
						System.out.print(prolist.get(i).getName() + "\t");
						System.out.print(prolist.get(i).getUnitPrice() + "��\t");
						System.out.println(prolist.get(i).getAmount() + "��\t");
						total += prolist.get(i).getUnitPrice() * prolist.get(i).getAmount();
					}
					System.out.println("�ǸŽ� ���� : " + total + "��");
				}
			}
		}
		System.out.println("���α׷� ����");
	}

}
