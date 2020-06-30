package exam02;

import java.util.Random;

public class 홀수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] array = new int[10];
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100)+1;
		}
		
		System.out.print("array에 들어있는 홀수는 ");
		for (int i : array) {
			if (i%2==1) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("이며, 총 "+count+"개 입니다.");
		
	}

}
