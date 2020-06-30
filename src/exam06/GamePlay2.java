package exam06;

import java.util.Scanner;

public class GamePlay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MinusGame game = new MinusGame();

		game.select();
		
		while (game.life() > 0) {
			System.out.println(game.Question());
			System.out.print("정답을 입력하세요 : ");
			int sum = scan.nextInt();
			game.check(sum);
			System.out.println("남은 생명 : "+ game.life());	
		}
		System.out.println("게임이 종료되었습니다.");
		scan.close();
	}

}
