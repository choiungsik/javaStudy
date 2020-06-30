package exam05;

public class Warrior implements Basic{

	@Override
	public void attack() {
		System.out.println("대검으로 공격!");
		
	}

	@Override
	public void move() {
		System.out.println("뚜벅이로 이동이동!!!");
	}

}
