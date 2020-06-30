package exam02;

public abstract class Figure {

	// 추상 메소드가 있는 추상클래스 Figure 형성
	// 추상 메소드를 활용할 때 abstract을 붙여 선언함
	// 추상메소드에 있는 기능은 반드시 자식클래스에서 형성해야 하므로 이를 잘 구분해야한다.
	// 추상메소드가 있으면 반드시 자식클래스는 해당 메소드를 오버라이드해야함(오버라이드가 빠질 경우 에러가 발생함)
	// 추상메소드는 반드시 필요한 기능만 추려서 작성하도록 하자.
	public abstract double cal();

}
