package java_casting����;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ް���
		SalayCalculator sa_cal = new SalayCalculator();
		// ���⼭ calculate�� employee��ü�� �޴� ������ �ν��ϴµ� �̸� �ڽ�Ŭ������ �θ�Ŭ����ó�� �νĵǾ� ������ ���� �������� ����.
		int money = sa_cal.calculate(new TempEmployee("smhrd001", "Ȳ�ص�", 3000));
		System.out.println("�������� : " + money);
		money = sa_cal.calculate(new RegularEmployee("smhrd002", "�����", 4000, 400));
		System.out.println("������ : " + money);
		money = sa_cal.calculate(new PartTimeEmployee("smhrd002", "�ֿ���", 10, 10));
		System.out.println("��ƮŸ�� : " + money);
	}

}
