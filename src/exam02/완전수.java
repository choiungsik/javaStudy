package exam02;

public class ¿ÏÀü¼ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
					}
				}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}
}