package exam01;

import java.util.Arrays;

public class 버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 45, 12, 25, 7, 4 };
		int temp = 0;

		for (int i = 1; i < array.length - 1 ; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(array));
	}

}
