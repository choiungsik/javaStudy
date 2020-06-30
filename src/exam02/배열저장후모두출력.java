package exam02;

import java.util.Scanner;

public class 배열저장후모두출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		int count = 0;
		while (array[4] == 0) {
			System.out.print((count + 1) + "번째 입력 >> ");
			array[count] = scan.nextInt();
			count++;
		}

		System.out.print("입력된 점수 : ");
		for (int var : array) {
			System.out.print(var + " ");
		}
		
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" : ");
			for (int j = 0; j < array[i]/10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
