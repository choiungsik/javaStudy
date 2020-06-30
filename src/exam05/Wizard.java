package exam05;

// 인터페이스를 구현할 때는 구현하다라는 뜻이 있는 implements를 활용하여  받아온다.
// 인터페이스는 상속과 다르게 여러개를 동시에 수식받을 수 있음
public class Wizard implements Basic{

	@Override
	public void attack() {
		System.out.println("지팡이로 공격!");
	}

	@Override
	public void move() {
		System.out.println("텔레포트 슈슉!");
	}

}
