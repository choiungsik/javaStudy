package exam02;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("User1 이름입력 : ");
		String user1 = scan.next();
		System.out.print("User2 이름입력 : ");
		String user2 = scan.next();
		String replay = "";

		do {
			System.out.print(user1 + "님 가위, 바위, 보 중 하나를 입력하세요 >>> ");
			String select1 = scan.next();
			System.out.print(user2 + "님 가위, 바위, 보 중 하나를 입력하세요 >>> ");
			String select2 = scan.next();

			if (select2.equals(select1)) {
				System.out.println("비겼습니다.");
			} else {
				if (select1.equals("바위") && select2.equals("가위")) {
					System.out.println(user1 + "님이 이겼습니다.");
				} else if (select1.equals("가위") && select2.equals("보")) {
					System.out.println(user1 + "님이 이겼습니다.");
				} else if (select1.equals("보") && select2.equals("바위")) {
					System.out.println(user1 + "님이 이겼습니다.");
				} else {
					System.out.println(user2 + "님이 이겼습니다.");
				}
			}
			System.out.print("다시 하시겠습니까? (Y/N) ");
			replay = scan.next();
		} while (replay.equals("Y") || replay.equals("y"));
		System.out.println("프로그램을 종료합니다.");
	}

}
