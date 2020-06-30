package exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class musiclist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

		int input = 0;
		int num = 0;
		while (input != 4) {
			System.out.print("[1]�뷡�߰� [2]�뷡���� [3]�뷡��ȸ [4]���� >> ");
			input = scan.nextInt();
			if (input == 1) {
				musicAdd(scan, musiclist);
			}
			if (input == 2) {
				musicRemove(scan, musiclist);
			}
			if (input == 3) {
				musicList(musiclist);
			}
			System.out.println("=========================");
		}
		System.out.println("���α׷� ����");
	}

	private static void musicList(ArrayList<String> musiclist) {
		int num;
		num = 0;
		System.out.println("====== ���� ��� ��� =======");
		if (musiclist.size() == 0) {
			System.out.println("��� ����� �����ϴ�.");
		} else {
			for (String i : musiclist) {
				num++;
				System.out.println(num + "." + i);
			}
		}
	}

	private static void musicRemove(Scanner scan, ArrayList<String> musiclist) {
		int num;
		System.out.print("[1]���û��� [2]��ü���� >> ");
		int input1 = scan.nextInt();
		num = 0;
		if (input1 == 1) {
			System.out.println("====== ���� ��� ��� =======");
			if (musiclist.size() == 0) {
				System.out.println("��� ����� �����ϴ�.");
			} else {
				for (String i : musiclist) {
					num++;
					System.out.println(num + "." + i);
				}
				System.out.print("������ �뷡���� >> ");
				int n = scan.nextInt();
				musiclist.remove(n - 1);
				System.out.println("�뷡�� �����Ǿ����ϴ�.");
			}
		} else if (input1 == 2) {
			musiclist.clear();
			System.out.println("��� �뷡�� �����Ǿ����ϴ�.");
		}
	}

	private static void musicAdd(Scanner scan, ArrayList<String> musiclist) {
		System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >> ");
		int input1 = scan.nextInt();
		if (input1 == 1) {
			System.out.print("�߰��� �뷡�� �Է��ϼ��� >> ");
			String mu = scan.next();
			musiclist.add(mu);
		} else {
			System.out.print("���ϴ� ��ġ�� �Է��ϼ��� >> ");
			int n = scan.nextInt();
			System.out.print("�߰��� �뷡�� �Է��ϼ��� >> ");
			String mu = scan.next();
			musiclist.add(n + 1, mu);
		}
		System.out.println("�뷡�߰��� �Ϸ�Ǿ����ϴ�.");
	}

}
