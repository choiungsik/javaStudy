package project1team;

import java.util.Scanner;

public class �ڹ�0606_2�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] array = new int [5][5];
		int num = 25;
		
		System.out.println("180�� ȸ��");
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
