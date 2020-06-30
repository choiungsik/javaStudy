package exam02;

public class close10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = -7;
		int num2 = 26;
		int result = close10(num1, num2);

		System.out.println("10에 가까운 수 : " + result);
	}

	public static int close10(int x, int y) {
		int result = Math.abs(10-x) < Math.abs(10-y) ?  x : y;
		
		if (Math.abs(10-x) == Math.abs(10-y)) {
			result = 0;
		}
		
		return result;
	}
}
