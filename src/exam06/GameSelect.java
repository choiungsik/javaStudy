package exam06;

import java.util.Scanner;

public class GameSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if등으로 별도의 값을 출력하도록 하는 방법
		// 배열을 통해 게임을 넣어놓고 배열번호를 불러 게임을 불러오는 방법
		Scanner scan = new Scanner(System.in);
		System.out.print("게임을 선택하세요 [1]더하기게임 [2]빼기게임 [3]곱하기게임 >> ");
		int input = scan.nextInt();
		Game game = null;
		// null값이 아니면 값이 없다고 생각되어 뒤쪽이 에러가 나니 null값을 넣거나 else를 사용해서 예외를 제거해야함
		if (input == 1) {
			game = new PlusGame();
		} else if (input == 2) {
			game = new MinusGame();
		} else if (input == 3){
			game = new MultiplyGame();
		}

		game.select();

		while (game.life() > 0) {
			System.out.println(game.Question());
			System.out.print("정답을 입력하세요 : ");
			int sum = scan.nextInt();
			game.check(sum);
			System.out.println("남은 생명 : " + game.life());
		}
		System.out.println("게임이 종료되었습니다.");
		scan.close();
	}

}
