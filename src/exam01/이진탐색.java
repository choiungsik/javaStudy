package exam01;

public class ����Ž�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ĵ� �����Ϳ����� ��� ����

		int[] array = { 3, 4, 7, 8, 9, 11, 19, 25, 34, 50, 87, 100, 108, 111, 112, 130, 140 };
		int key = 19;
		int left = 0;
		int right = array.length - 1;
		int mid = (left + right) / 2;
		// key���� ���° �ε����� �ִ��� ����Ž���� ���� Ž��

		while (true) {
			if (key < array[mid]) {
				right = mid - 1;
				mid = (left + right) / 2;
				System.out.println("key���� �� �� �۽��ϴ�.");
			} else if (key > array[mid]) {
				left = mid + 1;
				mid = (left + right) / 2;
				System.out.println("key���� �� �� Ů�ϴ�.");
			} else {
				System.out.println(key+"���� "+(mid+1)+"��°�� �ֽ��ϴ�.");
				break;
			}
		}
	}

}
