package project1team;

public class 자바0610_1다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	public static void getPerfectNumber(int x, int y) {
		System.out.print(x + "~" + y + "까지의 완전수 : ");
		for (int i = x; i < y; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}

}
