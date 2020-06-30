package project1team;

public class a21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		int num = 64;
		int B = 0;

		for (int i = 0; i < array.length; i++) {
			if (i < 2) {
				for (int j = 0; j < B; j++) {
					System.out.print("  ");
				}
				B++;

				for (int j = i; j < 5 - i; j++) {
					num++;
					System.out.print((char) num + " ");
				}
				System.out.println();

			} else {
				for (int j = B ; j > 0; j--) {
					System.out.print("  ");
				}
				B--;
				for (int j = 4 - i ; j < i + 1; j++) {
					num++;
					System.out.print((char) num+ " ");
				}
				System.out.println();
			}
		}
	}

}
