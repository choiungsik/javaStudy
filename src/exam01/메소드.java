package exam01;

public class 메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num(4, 5));
		print(3);
//		System.out.println(print(3));
		//프린트 문 안에 프린트를 넣는 형태라 에러가 발생하니 사용시 주의할 것
		printName();
	}

	public static int num(int i, int j) {
		return i + 1;

	}

	// 리턴 값이 없을때 void 사용
	public static void print(int i) {
		System.out.println("제가 가장 좋아하는 숫자는 " + i + "입니다.");
		System.out.println("매소드는 보이드를 만나기 전 몇줄을 써도 상관 없음");
	}

	// 매개변수가 없는 메소드
	public static void printName() {
		System.out.println("제 이름은 최웅식입니다.");
	}
	
}
