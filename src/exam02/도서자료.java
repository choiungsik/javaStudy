package exam02;

import java.util.Scanner;

public class �����ڷ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookData[] bookArr = new BookData[5];
		
		bookArr[0] = new BookData("Java", 21000, "ȫ�浿");
		bookArr[1] = new BookData("C++", 29000, "�ڹ���");
		bookArr[2] = new BookData("Database", 31000, "���嵶");
		bookArr[3] = new BookData("Android", 18000, "�̼���");
		bookArr[4] = new BookData("Web", 26000, "��ö��");

		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = scan.nextInt();
		System.out.println("���� ������ å ���");
		for (int i = 0; i < bookArr.length; i++) {
			if (money >= bookArr[i].getPrice()) {
			System.out.println("["+bookArr[i].getTitle()+", "+bookArr[i].getWriter()+", "+bookArr[i].getPrice()+"��]");
			}
		}
		
	}

}
