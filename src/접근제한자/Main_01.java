package 접근제한자;

public class Main_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();
		System.out.println(test.age);
		
		// 별도 명칭이 없는 경우 default클래스가 되기에 같은 패키지 내에서만 사용 가능
		System.out.println(test.phoneNumber);
		
		System.out.println(test.score);
	}

}
