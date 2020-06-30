package exam01;

public class 객체와클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 객체를 생성, 클래스의 인스턴스화(실체화)
//		People p = new People();
//		// new를 사용할 경우 기본적으로 초기화가 됨. string의 경우 null, int의 경우 0으로 초기화
//
//		// 객체의 속성에 접근
//		p.name = "최웅식";
//		System.out.println(p.name);
//		p.age = 28;
//		System.out.println(p.age);
//		p.sex = "남자";
//		System.out.println(p.sex);
//		p.height = 173;
//		System.out.println(p.height);
//
//		// 설계도는 people로 똑같지만 다른 명칭으로 해서 새로운 객체에 대해 정의할 수 있음
//		People choi = new People();
//		System.out.println(choi.name);
//		choi.age = 28;
//		choi.name = "최웅식2";
//		choi.height = 175;
//		choi.sex = "male";
//		
//		System.out.println("p의 속성");
//		System.out.println(p.name+p.age+p.height+p.sex);
//		System.out.println("choi의 속성");
//		System.out.println(choi.name+choi.age+choi.height+choi.sex);
//		
//		// 객체가 가진 기능사용, 뒤에 소괄호가 들어갈 경우 메소드로 확인한다.
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
