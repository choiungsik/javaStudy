package exam02;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단 : ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
	}

}
