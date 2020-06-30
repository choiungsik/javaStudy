package exam02;

public class 전화 {

	String phoneNumber;
	
	public 전화(String phoneNumber) {
		super();
		System.out.println("이건 부모클래스 생성자입니다.");
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void call() {
		System.out.println("전화걸기");
	}
	
	public void takecall() {
		System.out.println("전화받기");
	}
}
