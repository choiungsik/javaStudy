package exam06;

import java.util.Scanner;

public class GameSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if������ ������ ���� ����ϵ��� �ϴ� ���
		// �迭�� ���� ������ �־���� �迭��ȣ�� �ҷ� ������ �ҷ����� ���
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �����ϼ��� [1]���ϱ���� [2]������� [3]���ϱ���� >> ");
		int input = scan.nextInt();
		Game game = null;
		// null���� �ƴϸ� ���� ���ٰ� �����Ǿ� ������ ������ ���� null���� �ְų� else�� ����ؼ� ���ܸ� �����ؾ���
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
			System.out.print("������ �Է��ϼ��� : ");
			int sum = scan.nextInt();
			game.check(sum);
			System.out.println("���� ���� : " + game.life());
		}
		System.out.println("������ ����Ǿ����ϴ�.");
		scan.close();
	}

}
