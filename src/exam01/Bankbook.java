package exam01;

public class Bankbook {

	int money;
	
	// private�� ���� ���� �ٸ� Ŭ�������� ����� �Ұ����ϰ� �żҵ带 ȣ���ؼ��� ����� ������
//	private int money;
	
	public void Deposit(int a) {
		System.out.println("���� �ִ´�.");
		money += a;
		System.out.println(a+"���� �־����ϴ�.");
	}
	
	public void Withdraw(int a) {
		System.out.println("���� �����Ѵ�.");
		money -= a;
		System.out.println(a+"���� �����մϴ�.");
	}
	
	public void ShowMoney() {
		System.out.println("�ܾ��� �����ش�.");
		System.out.println("�ܾ� : "+money+"���� �����ֽ��ϴ�.");
	}
}
