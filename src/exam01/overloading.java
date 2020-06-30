package exam01;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = add('+', 5);
		System.out.println(result);
	}
	// 매소드 오버로딩이란 중복정의란 의미
	// 매개변수의 갯수가 다르거나 타입이 다를 경우 같은 명칭을 사용해서 중복 정의가 가능하다.
	
	public static int add(float i, float j) {
		return (int) (i + j);
	}
	
	private static int add(int i, int j) {
		return i + j;
	}
	
	public static int add(int i, int j, int z) {
		return i + j + z;
	}
	
	public static int add(char op, int i) {
		if (op == '+') {
			return i + 1;
		} else {
			return 0;
		}
	}
}
