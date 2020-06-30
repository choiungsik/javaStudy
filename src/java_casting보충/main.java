package java_casting보충;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 월급계산기
		SalayCalculator sa_cal = new SalayCalculator();
		// 여기서 calculate는 employee객체를 받는 것으로 인식하는데 이를 자식클래스가 부모클래스처럼 인식되어 각각의 값을 가져오는 것임.
		int money = sa_cal.calculate(new TempEmployee("smhrd001", "황해도", 3000));
		System.out.println("비정규직 : " + money);
		money = sa_cal.calculate(new RegularEmployee("smhrd002", "김미희", 4000, 400));
		System.out.println("정규직 : " + money);
		money = sa_cal.calculate(new PartTimeEmployee("smhrd002", "최웅식", 10, 10));
		System.out.println("파트타임 : " + money);
	}

}
