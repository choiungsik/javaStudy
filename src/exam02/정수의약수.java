package exam02;

import java.util.Scanner;

public class 정수의약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.print(num+"의 약수 : ");
		for (int i = 1; i < num+1; i++) {
			if (num%i == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
