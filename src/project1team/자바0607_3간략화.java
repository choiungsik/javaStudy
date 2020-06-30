package project1team;

public class 자바0607_3간략화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 64;
		int B = 0;

		for (int i = 0; i < 5; i++) {
			if (i < 2) {
				for (int k = 0; k < B; k++) {
					System.out.printf("%s ", " ");
				}
				B++;

				for (int j = i; j < 5 - i; j++) {
					num++;
					System.out.printf("%s ", (char) num);
				}
			} else {
				for (int k = B; k > 0; k--) {
					System.out.printf("%s ", " ");
				}
				B--;

				for (int j = 4 - i; j < i + 1; j++) {
					num++;
					System.out.printf("%s ", (char) num);
				}
			}
			System.out.println();
		}
	}

}
