package project1team;

import java.util.Scanner;

public class 자바0606_2다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] array = new int [5][5];
		int num = 25;
		
		System.out.println("180도 회전");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = num;
				System.out.printf("%2d ",num);
				num--;
			}
			System.out.println();
		}
	}

}
