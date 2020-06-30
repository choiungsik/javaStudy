package exam01;

public class 이진탐색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정렬된 데이터에서만 사용 가능

		int[] array = { 3, 4, 7, 8, 9, 11, 19, 25, 34, 50, 87, 100, 108, 111, 112, 130, 140 };
		int key = 19;
		int left = 0;
		int right = array.length - 1;
		int mid = (left + right) / 2;
		// key값이 몇번째 인덱스에 있는지 이진탐색을 통해 탐색

		while (true) {
			if (key < array[mid]) {
				right = mid - 1;
				mid = (left + right) / 2;
				System.out.println("key값은 좀 더 작습니다.");
			} else if (key > array[mid]) {
				left = mid + 1;
				mid = (left + right) / 2;
				System.out.println("key값은 좀 더 큽니다.");
			} else {
				System.out.println(key+"값은 "+(mid+1)+"번째에 있습니다.");
				break;
			}
		}
	}

}
