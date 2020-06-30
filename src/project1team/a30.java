package project1team;

public class a30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHarshad(11));
	}

	private static boolean isHarshad(int i) {
		boolean result;
		int temp = i;
		int sum = 0;

		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}
		
		if (temp % sum == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
