package exam02;

import java.util.Scanner;

public class ū��_������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// �ڿ� ln�� ������ �ٷ� ���� �Էµȴ�.
		System.out.print("ù��° �Է� >> ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° �Է� >> ");
		int num2 = scan.nextInt();
		
		int res = num1>num2 ? num1-num2 : num2-num1;
		String str = String.format("�� ���� ���� : %d", res);
		String str2 = String.format("%d�� %d�� ���� : %d", num1, num2, res);
		System.out.println(str);
		System.out.println(str2);
	}

}
