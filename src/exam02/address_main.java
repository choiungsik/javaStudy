package exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class address_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Address> ad = new ArrayList<Address>();
		Scanner scan = new Scanner(System.in);
		int input = 0;
		ad.add(new Address("�ֿ���", 28, "010-5698-7234"));

		while (input != 5) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >> ");
			input = scan.nextInt();

			if (input == 1) {
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.print("���� : ");
				int age = scan.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phoneNumber = scan.next();
				Address add = new Address(name, age, phoneNumber);
				ad.add(add);

			} else if (input == 2) {
				if (ad.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else {
					System.out.println("����  �̸�(����)\t��ȣ");
					for (int i = 0; i < ad.size(); i++) {
						System.out.print(i + 1 + ".  ");
						System.out.print(ad.get(i).getName() + "(" + ad.get(i).getAge() + ") : ");
						System.out.println(ad.get(i).getPhoneNumber() + "\t");
					}
				}

			} else if (input == 3) {
				if (ad.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else {
					int n = 0;
					for (Address i : ad) {
						n++;
						System.out.println(n + "." + i.getName() + "(" + i.getAge() + ") : " + i.getPhoneNumber());
					}
					System.out.print("������ ��ȣ�� �Է��ϼ��� >> ");
					int num = scan.nextInt();
					ad.remove(num - 1);
				}

			} else if (input == 4) {
				System.out.print("[1]�̸��˻� [2]��ȣ�˻� >> ");
				int input2 = scan.nextInt();
				if (input2 == 1) {
					System.out.print("�˻��� �̸��� �Է��ϼ��� >> ");
					String sname = scan.next();
					searchAddressInfo(ad, sname);

				} else if (input2 == 2) {
					System.out.println("ex)010-1111-2222");
					System.out.print("�˻��� ��ȣ�� �Է��ϼ��� >> ");
					String sphone = scan.next();
					searchAddressInfo(ad, sphone);
				}
			}
		}
		System.out.println("���α׷� ����");

	}

	private static void searchAddressInfo(ArrayList<Address> ad, String sname) {
		for (int i = 0; i < ad.size(); i++) {
			if (ad.get(i).getName().equals(sname)) {
				System.out.println(i + "." + ad.get(i).getName() + "(" + ad.get(i).getAge() + ") : "
						+ ad.get(i).getPhoneNumber());
				break;
			} else if (i == ad.size() - 1) {
				System.out.println("ã�� ����� �����ϴ�.");
			}
		}
	}

}
