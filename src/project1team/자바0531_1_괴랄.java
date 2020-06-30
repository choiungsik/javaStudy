package project1team;

import java.util.Scanner;

public class 자바0531_1_괴랄 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. :");
		int num = sc.nextInt();
		System.out.print(num + " = ");
		String str = "";
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				str += i + "*";
				num = num / i;
			}
		}
		System.out.println(str.substring(0, str.length() - 1));
	}
}
