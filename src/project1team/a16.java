package project1team;

import java.util.Scanner;

public class a16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		int n = 0;
		int temp = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1+"��° �� �Է� : ");
			n = scan.nextInt();
			array[i] = n;
		}
		
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if(i != j ) {
					if(array[min] > array[j]) {
						min = j;
					}
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		System.out.println("���� �� ");
		for (int i : array) {
			System.out.print(i+ " ");
		}
	}

}
