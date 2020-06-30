package exam02;

import java.util.Random;
import java.util.Scanner;
// ctrl+shift+o를 사용하면 지정안된 import값을 추가함

public class plusgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("====Plus Game ====");
		String replay = "";

		do {
			int num1 = 1 + rand.nextInt(10);
			int num2 = 1 + rand.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			int res = num1 + num2;
			int ask = scan.nextInt();
			if (res == ask) {
				System.out.println("Success");
				break;
			} else {
				System.out.println("Fail");
				System.out.print("계속하시겠습니까? (Y/N) ");
				replay = scan.next();
			}
			// replay와 "Y"는 위치가 바뀌어도 같은지 확인하는 것이기에 정상적으로 작동함
		} while (replay.equals("Y"));
		System.out.println("게임을 종료합니다.");

	}

}
