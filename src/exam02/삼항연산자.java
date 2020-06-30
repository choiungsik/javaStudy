package exam02;

// 똑같은 명칭을 가진 함수가 있으니 어디에 있는지 명시해야됨
// 근데 왜 String은 추가가 안되지?
import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		
		// 대문자 S로 시작하는 String으로 문자열을 표시(반드시 대문자일것)
		// 사용자 정의데이터타입
		String str = number > 5 ? "5보다 크다" : "5보다 작다";
		
		System.out.println(str);
		
		// 값을 입력할 수 있게 만드는 스캐너함수를 변수에 지정해서 사용
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = scan.nextInt();
		
		String res = num % 2 == 1 ? "홀수" : "짝수";
		
		System.out.println(num+"은(는) "+res+"입니다.");
	}

}
