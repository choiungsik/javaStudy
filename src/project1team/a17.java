package project1team;

import java.util.Scanner;

public class a17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 n 입력 : ");
		int n = scan.nextInt();
		int[][] array = new int[n][n];
		
		
		for (int i = 0; i < n; i++) {
			int count = i+1;
			for (int j = 0; j < n; j++) {
				array[i][j] = count;
				count += n;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			} System.out.println();
		}
	}

}
