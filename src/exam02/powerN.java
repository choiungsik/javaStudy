package exam02;

public class powerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("��� Ȯ�� : "+result);
	}
	
	public static int powerN(int x, int y) {
		int result = 1;
				
		for (int i = 0; i < y; i++) {
			result *= x;
		}
		
		return result;
	}

}
