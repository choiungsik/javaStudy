package exam02;

import java.util.Scanner;

public class loginprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String c_id = "Hello";
		int c_pw = 1234;
		String select = "";
		int count = 0;

		while (true) {
			System.out.print("아이디를 입력하세요 >> ");
			String a_id = scan.next();
			System.out.print("비밀번호를 입력하세요 >> ");
			int a_pw = scan.nextInt();
			if (a_id.equals(c_id) && a_pw == c_pw) {
				System.out.println("로그인 성공!");
				break;
			} else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
				count++;
			}
			if (count == 3) {
				System.out.println("아이디와 비밀번호가 3회 틀렸습니다. 본인인증을 해주세요.");
				break;
			}
			System.out.print("계속 하시겠습니까? (Y/N) ");
			select = scan.next();
			if (select.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
