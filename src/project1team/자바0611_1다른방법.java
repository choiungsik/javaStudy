package project1team;

import java.util.Arrays;

public class 자바0611_1다른방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] merge = mergeArray(A, B);
	}

	private static int[] mergeArray(int[] A, int[] B) {
		int[] merge=new int[A.length+B.length];
		
		for (int i = 0; i < A.length; i++) {
			merge[i] = A[i];
		}
		for (int i = A.length; i < A.length+B.length; i++) {
			merge[i] = B[i-A.length];
		}
		Arrays.sort(merge);
		System.out.print("Merge : ");
		System.out.println(Arrays.toString(merge));
		
		return merge;
	}
}
