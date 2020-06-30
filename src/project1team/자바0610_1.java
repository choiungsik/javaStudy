package project1team;

public class 자바0610_1 {

	public static String getPerfectNumber(int x, int y) {
		int array[] = new int[y];
		int sum = 0;
		int count = 0;
		String result = "";

		System.out.print(x + "~" + y + "까지의 완전수 : ");
		for (int i = x; i <= y; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				array[count] = sum;
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			result += array[i] + " ";
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

}
