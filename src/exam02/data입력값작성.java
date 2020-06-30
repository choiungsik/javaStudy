package exam02;

import java.util.Scanner;

public class data입력값작성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("User : ");
		String data = scan.next();

		switch (data) {
		case "안녕하세요.":
			System.out.println("PC : 네, 안녕하세요!");
			break;
		case "반가워요.":
			System.out.println("PC : 네, 반가워요!");
			break;
		case "수고하세요.":
			System.out.println("PC : 네, 수고하세요!");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

}
