package exam02;

import java.util.Random;

public class Ȧ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] array = new int[10];
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100)+1;
		}
		
		System.out.print("array�� ����ִ� Ȧ���� ");
		for (int i : array) {
			if (i%2==1) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("�̸�, �� "+count+"�� �Դϴ�.");
		
	}

}
