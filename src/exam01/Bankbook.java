package exam01;

public class Bankbook {

	int money;
	
	// private로 만든 것은 다른 클래스에서 사용이 불가능하고 매소드를 호출해서만 사용이 가능함
//	private int money;
	
	public void Deposit(int a) {
		System.out.println("돈을 넣는다.");
		money += a;
		System.out.println(a+"원을 넣었습니다.");
	}
	
	public void Withdraw(int a) {
		System.out.println("돈을 인출한다.");
		money -= a;
		System.out.println(a+"원을 인출합니다.");
	}
	
	public void ShowMoney() {
		System.out.println("잔액을 보여준다.");
		System.out.println("잔액 : "+money+"원이 남아있습니다.");
	}
}
