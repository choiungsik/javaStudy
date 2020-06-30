package project1team;

import java.util.Random;

public class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[8];
		Random rand = new Random();
		int max = 0;
		int min = 100;

		for (int i = 0; i < array.length; i++) {
			int num = rand.nextInt(100) + 1;
			array[i] = num;
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.print("배열에 있는 모든 값 : ");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);

	}

}
