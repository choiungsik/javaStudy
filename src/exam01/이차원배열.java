package exam01;

public class �������迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 26���� ��Ҹ� ���� �� �ִ� �迭 2���� ���� ����(�迭 2���� ��Ұ� ����� ������ �ּҰ��� ���� ����
		int[][] score = new int[2][26];
		
		// 2���� �迭�� ������ �־ length�� �迭�� ������ ��Ÿ��
		System.out.println(score.length);
		System.out.println(score[0].length);
		int num = 0;
		
		int[][] array = new int[5][5];
		
		System.out.println("array�� ��� �� : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				num++;
				array[i][j] = num;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
				// printf�� ��� println�� ���������� �ٹٲ� ����� ���Ե� ����
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("array�� ��� �� : ");
		for (int i = 0; i < array.length; i++) {
			for (int va : array[i]) {
				System.out.print(va+" ");
			}
		}
	}

}
