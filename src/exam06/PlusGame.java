package exam06;

import java.util.Random;

public class PlusGame implements Game {
	private int num1; // 첫번째 정수
	private int num2; // 두번째 정수
	private int sum; // 정답을 기억할 변수
	Random rand = new Random();
	private int life = 5;

	@Override
	public void select() {
		// 랜덤으로 num1과 num2를 저장(1~50
		// sum에 합을 저장
		num1 = rand.nextInt(50) + 1;
		num2 = rand.nextInt(50) + 1;
		sum = num1 + num2;

	}

	@Override
	public String Question() {
		String result = num1 + "+" + num2 + "= ?";
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
		// TODO Auto-generated method stub
		return life;
	}

}
