package project1team;

import java.util.Scanner;

public class ÀÚ¹Ù0611_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("¶Ù¾î°¥ Ä­ÀÇ ÃÑ ¼ö : ");
		int n = scan.nextInt();
		System.out.println(jumpCase(n));
	}

	public static int jumpCase(int a) {
		int count = 0;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				if (1 * i + 2 * j == a) {
					double ij_count = 1;
					double i_count = 1;
					double j_count = 1;
					for (int b = j; b >= 1; b--) {
						j_count *= b;
					}
					for (int c = i; c >= 1; c--) {
						i_count *= c;
					}
					for (int d = i + j; d >= 1; d--) {
						ij_count *= d;
					}
					count += ij_count / (i_count * j_count);
				}
			}
		}

		return count;
	}

}
