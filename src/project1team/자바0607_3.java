package project1team;

public class �ڹ�0607_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char list1[][] = new char[5][5];
		int num = 64;
		int k2 = 0;
		// �ƽ�Ű�ڵ忡�� "A"=65�̹Ƿ� 64���� 1�� ������ ���� �������·� ġȯ�� ���ĺ� ��°���
		
		for (int i = 0; i < 3; i++) {
			// ��ĭ�� \t�� ���ؼ� ������ �ٸ� ���ڵ�� ���� ���� �������� ���·� ����  
			for (int k = 0; k < k2 - i; k++) {
				System.out.printf("%s ", " ");
			}
			k2 += 2;

			// �ѿ��� �ۼ��� ������ ������ �����ϹǷ� ���� +, �ڴ� -���Ѽ� ���Ƚ�� ����
			for (int j = 0 + i; j < 5 - i; j++) {
				if (i <= 2) {
					num++;
					list1[i][j] = (char) num;
					System.out.printf("%s ",list1[i][j]);
				}
			}
			System.out.println();
		}

		// 2��° �� ���Ŀ��� �ٽ� ������ �����ϴ� ������ �ٲ��� ���ϴ� �𷡽ð� ���°� ����
		for (int i = 3; i < 5; i++) {
			// �տ��� k2���� 6�� �Ǿ� �ִ� �����̹Ƿ� �̸� �� ���� ������� �������� ���� �°� ��ĭ����
			// %1$s �������� �� �� ���ڿ��� %s�� �����ϴµ� ���� ���� ���ڰ� ������ 1$�� ù��° ����, 2$�� �ι�° ���ڸ� �����϶�� �Ҹ�
			for (int k = k2 - i - 3; k >= 0; k--) {
				System.out.printf("%s ", " ");
			}

			for (int j = 4 - i; j < 1 + i; j++) {
				if (i <= 5) {
					num++;
					list1[i][j] = (char) num;
					System.out.printf("%s ",list1[i][j]);
				}
			}
			System.out.println();
		}
	}
}
