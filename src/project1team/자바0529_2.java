package project1team;

public class ÀÚ¹Ù0529_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 1) {
				System.out.print(j + " ");
				sum += j;
			} else {
				System.out.print(-j + " ");
				sum -= j;
			}
		}
		System.out.println();
		System.out.println(sum);

	}

}
