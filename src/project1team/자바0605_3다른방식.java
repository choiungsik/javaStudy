package project1team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class �ڹ�0605_3�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list1 �� �迭����, list2 �� ����Ʈ����
		Scanner scan = new Scanner(System.in);
		ArrayList list2 = new ArrayList<>();
		// int list1[] = new int[5];
		// int change = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf((i + 1) + "��° �� �Է� : ");
			//list1[i] = scan.nextInt();
			list2.add(scan.nextInt());
		}
		//list1�� �迭���·� ���� collections�� Ȱ������ ����.
		Collections.sort(list2);
		System.out.println("���� ��");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
	}
}
