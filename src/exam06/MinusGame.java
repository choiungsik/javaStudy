package exam06;

import java.util.Random;

public class MinusGame implements Game {

	private int num1; // 첫번째 정수
	private int num2; // 두번째 정수
	private int sum; // 정답을 기억할 변수
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
			System.out.println("정답입니다.");
			select();
		} else {
			System.out.println("오답입니다.");
			life--;
		}

	}

	@Override
	public int life() {
		return life;
	}

}
