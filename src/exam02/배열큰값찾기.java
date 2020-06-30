package exam02;

import java.util.Random;

public class 배열큰값찾기 {

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
		System.out.println("가장 큰 값은 "+max+"입니다.");
		System.out.print("array의 모든 값 : ");
		for (int var : array) {
			System.out.print(var+" ");
		}
	}

}
