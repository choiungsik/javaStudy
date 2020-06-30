package project1team;

public class 자바0609_1 {

	public static boolean isDivid(int x, int y) {
		// TODO Auto-generated method stub
		
		if (x % y == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivid(num1, num2);
		System.out.println("결과 확인 : "+result);
	}

}
