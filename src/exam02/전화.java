package exam02;

public class ��ȭ {

	String phoneNumber;
	
	public ��ȭ(String phoneNumber) {
		super();
		System.out.println("�̰� �θ�Ŭ���� �������Դϴ�.");
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void call() {
		System.out.println("��ȭ�ɱ�");
	}
	
	public void takecall() {
		System.out.println("��ȭ�ޱ�");
	}
}
