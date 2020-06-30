package project1team;

import java.util.Scanner;

public class ÀÚ¹Ù0611_4´Ù¸¥¹æ¹ı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("¶Ù¾î°¥ Ä­ÀÇ ÃÑ ¼ö : ");
		int n = scan.nextInt();
		System.out.println(jumpCase(n));
	}
	
	public static int jumpCase(int x) {
		int sum = x;
		if (x>2) {
		sum = jumpCase(x-1) + jumpCase(x-2);
		}
		return sum;
	}

}
