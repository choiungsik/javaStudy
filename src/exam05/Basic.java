package exam05;

public interface Basic {

	// 인터페이스 안에는 추상메소드와 상수(항상 정해져있는 수)만 넣을 수 있음
	public static final String GAMENAME = "메이플스토리";
	// 인터페이스에서는 static final이라는 명칭이 안붙어도 자동으로 이를 붙여 생략 가능함
	
	public abstract void attack();
	public abstract void move();
	
	// 인터페이스에서 일반적인 메소드는 사용이 불가능하지만 이를 default를 통해서 가능하도록 만들어 사용 가능
	default public void hello() {
		System.out.println("안녕");
	}
	
}
