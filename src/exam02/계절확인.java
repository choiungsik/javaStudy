package exam02;

import java.util.Scanner;

public class ����Ȯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("�� �Է� : ");
int mon = scan.nextInt();

// switch�� ���� ���� �� break�� ���� ������ �����ϹǷ� �̸� ���� �������� ���� �־�� �� �ִ�.
switch (mon) {
case 12:
case 1:
case 2:
	System.out.println(mon+"���� �ܿ��Դϴ�.");
	break;

case 3:
case 4:
case 5:
	System.out.println(mon+"���� ���Դϴ�.");
	break;

case 6:
case 7:
case 8:
	System.out.println(mon+"���� �����Դϴ�.");
	break;
	
case 9:
case 10:
case 11:
	System.out.println(mon+"���� �����Դϴ�.");
}
	}

}
