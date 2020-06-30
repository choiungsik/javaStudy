package exam02;

import java.util.Random;

public class 짝수값만출력하는배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Random rand = new Random();
		System.out.print("array에 들어있는 짝수는 ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + rand.nextInt(100);
			if (array[i] % 2 == 0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("입니다.");
		
		System.out.print("array의 숫자 : ");
		for (int var : array) {
			System.out.print(var+" ");
		}
		
	}

}
