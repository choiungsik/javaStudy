package exam02;

import java.util.Random;

public class �迭ū��ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Random rand = new Random();
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + rand.nextInt(100);
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		System.out.print("array�� ��� �� : ");
		for (int var : array) {
			System.out.print(var+" ");
		}
	}

}
