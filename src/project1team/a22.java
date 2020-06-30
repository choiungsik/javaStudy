package project1team;

public class a22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : "+ result);
	}

	private static boolean isDivide(int num1, int num2) {
		boolean result;
		
		if (num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}

}
