package project1team;

import java.util.Scanner;

public class �ڹ�0605_2�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� >> ");
		int num = scan.nextInt();
		int result1[] = new int[num];
		int num_count = num;
		int count = 0;
		
		// math.pow�� ���ؼ� ���ؾ��ϴ� �ڸ� ������ ���ϱ�
		// math.pow(2.i)�� 2�� i�� ���� ���ϴµ� �̸� ���� �������� �ڸ����� ã�ư�
		for (int i = 0; i < num; i++) {
			if (num < Math.pow(2, i)) {
				count = i;
				break;
			}
		}
		// �迭�� �̿��ؼ� �����ϰ� �ű⿡�� ������ϴ� ���
		for (int i = 0; i < count; i++) {
			if (num_count % 2 == 0) {
				result1[i] = 0;
				num_count /= 2;
			} else {
				result1[i] = 1;
				num_count /= 2;
			}
		}
		
		for (int i = count -1; i >= 0; i--) {
			System.out.print(result1[i]+ " ");
			
		}
	}

}
