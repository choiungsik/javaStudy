package exam01;

public class ��ü��Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// ��ü�� ����, Ŭ������ �ν��Ͻ�ȭ(��üȭ)
//		People p = new People();
//		// new�� ����� ��� �⺻������ �ʱ�ȭ�� ��. string�� ��� null, int�� ��� 0���� �ʱ�ȭ
//
//		// ��ü�� �Ӽ��� ����
//		p.name = "�ֿ���";
//		System.out.println(p.name);
//		p.age = 28;
//		System.out.println(p.age);
//		p.sex = "����";
//		System.out.println(p.sex);
//		p.height = 173;
//		System.out.println(p.height);
//
//		// ���赵�� people�� �Ȱ����� �ٸ� ��Ī���� �ؼ� ���ο� ��ü�� ���� ������ �� ����
//		People choi = new People();
//		System.out.println(choi.name);
//		choi.age = 28;
//		choi.name = "�ֿ���2";
//		choi.height = 175;
//		choi.sex = "male";
//		
//		System.out.println("p�� �Ӽ�");
//		System.out.println(p.name+p.age+p.height+p.sex);
//		System.out.println("choi�� �Ӽ�");
//		System.out.println(choi.name+choi.age+choi.height+choi.sex);
//		
//		// ��ü�� ���� ��ɻ��, �ڿ� �Ұ�ȣ�� �� ��� �޼ҵ�� Ȯ���Ѵ�.
//		p.Hi();
//		p.Run();
//		p.Shower();
//		
		
		Bankbook b = new Bankbook();
		b.money = 5000;
		
		b.ShowMoney();
		b.Deposit(4000);
		b.ShowMoney();
		b.Withdraw(4000);
		b.ShowMoney();
		
		
		
	}

}
