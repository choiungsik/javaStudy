package exam02;

import java.util.Random;

public class ¦����������ϴ¹迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Random rand = new Random();
		System.out.print("array�� ����ִ� ¦���� ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + rand.nextInt(100);
			if (array[i] % 2 == 0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("�Դϴ�.");
		
		System.out.print("array�� ���� : ");
		for (int var : array) {
			System.out.print(var+" ");
		}
		
	}

}
