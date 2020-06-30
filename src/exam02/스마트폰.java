package exam02;

public class 스마트폰 extends 전화{

	
	// 부모클래스에 대해서 있는 생성자가 자동으로 자식클래스에 생성됨
	// 부모클래스에 있는 형태를 가져가기 위해 super를 통해 이를 끌어옴
	public 스마트폰(Object phoneNumber) {
		super(null);
	}

	public void musicPlay() {
		System.out.println("음악재생");
	}
	
	public void internet() {
		System.out.println("인터넷사용");
	}
}
