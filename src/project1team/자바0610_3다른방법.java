package project1team;

import java.util.Arrays;

public class �ڹ�0610_3�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] array = score.split(",");
		Arrays.sort(array);
		int count = 0;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("A")) {
				count++;
				sum++;
			} else {
				System.out.println("A : " + count + "��");
				count = 0;
				break;
			}
		}
		for (int i = sum; i < array.length; i++) {
			if (array[i].equals("B")) {
				count++;
				sum++;
			} else {
				System.out.println("B : " + count + "��");
				count = 0;
				break;
			}
		}
		for (int i = sum; i < array.length; i++) {
			if (array[i].equals("C")) {
				count++;
				sum++;
			} else {
				System.out.println("C : " + count + "��");
				count = 0;
				break;
			}
		}
		for (int i = sum; i < array.length; i++) {
			if (array[i].equals("D")) {
				count++;
				sum++;
			} else {
				System.out.println("D : " + count + "��");
				count = 0;
				break;
			}
		}
		for (int i = sum; i < array.length; i++) {
			if (array[i].equals("F")) {
				count++;
				sum++;
			}
		}
		System.out.println("F : " + count + "��");
	}
}
