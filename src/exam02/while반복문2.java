package exam02;

import java.util.Scanner;

public class while�ݺ���2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			// +=�� ���� Ư����ȣ�� int�� ���� ����� �Ұ���			
			sum += num;
			System.out.println("������� : "+sum);
			if (num == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
		
	}

}
