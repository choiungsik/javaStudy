package project1team;

public class �ڹ�0607_2 {
	public static void main(String[] args) {

		int list1[][] = new int[5][5];
		int num = 0;

		System.out.println("����");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num++;
				list1[j][i] = num;
				System.out.printf("%2d\t",list1[j][i]);
			}
			System.out.println();
		}
		
		// �������� 90�� ȸ���̸� 0��° ��(i)�� ó�� ������Ű�� ��(j)�� 4���� 0���� �ݺ��ϸ� ���ư��� ����
		// ����ϴ� ���� ������ ������ �������� �̴´ٰ� �����ϰ� �ؾ� Ȯ���ϱ� ����
		System.out.println();
		System.out.println("90�� ȸ��");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= 4; j++) {
				System.out.printf("%2d\t",list1[i][j]);
			}
			System.out.println();
		}
	}
}
