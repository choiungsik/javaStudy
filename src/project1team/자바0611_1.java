package project1team;

import java.util.Arrays;

public class ÀÚ¹Ù0611_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] merge = mergeArray(A, B);
	}

	public static int[] mergeArray(int[] A, int[] B) {
		int[] merge = new int[A.length + B.length - 1];
		int count = 0;
		int count_a = 0;
		int count_b = 0;

		while (true) {
			if (count < merge.length - 1) {
				if (A[count_a] < B[count_b]) {
					merge[count] = A[count_a];
					count++;
					count_a++;
					if (count_a == A.length) {
						merge[count] = B[count_b];
					}
				} else {
					merge[count] = B[count_b];
					count++;
					count_b++;
				}
			} else {
				System.out.print("Merge : ");
				System.out.println(Arrays.toString(merge));
				break;
			}

		}

		return merge;
	}

}
