package exam06;

import java.util.Random;

public class MinusGame implements Game {

	private int num1; // ù��° ����
	private int num2; // �ι�° ����
	private int sum; // ������ ����� ����
	Random rand = new Random();
	private int life = 5;

	@Override
	public void select() {
		num1 = rand.nextInt(50) + 1;
		num2 = rand.nextInt(50) + 1;
		sum = num1 - num2;
	}

	@Override
	public String Question() {
		String result = num1 + "-" + num2 + "= ?";
		return result;
	}

	@Override
	public void check(int sum) {
		if (this.sum == sum) {
			System.out.println("�����Դϴ�.");
			select();
		} else {
			System.out.println("�����Դϴ�.");
			life--;
		}

	}

	@Override
	public int life() {
		return life;
	}

}
