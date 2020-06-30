package exam02;

public class 전화_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 부모클래스에 대해서 있는 생성자가 자동으로 자식클래스에 생성됨
		// 부모클래스에 있는 프린트문을 그대로 가져와 스마트폰에 없는 프린트문도 출력이 됨
		스마트폰 smart = new 스마트폰(null);
		
		smart.call();
		smart.takecall();
		smart.musicPlay();
		smart.internet();
		
		
		
	}

}
