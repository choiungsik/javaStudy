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
			System.out.print("������ �Է��ϼ��� : ");
			int sum = scan.nextInt();
			game.check(sum);
			System.out.println("���� ���� : "+ game.life());	
		}
		System.out.println("������ ����Ǿ����ϴ�.");
		scan.close();
	}

}
