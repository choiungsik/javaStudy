package exam02;

public class getsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(6));
	}
	
	public static int getSum(int x) {
		int result = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				result += i;
			}
		}
		return result;
	}

}
