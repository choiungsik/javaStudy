package exam01;

public class Mouse상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기존에 만든 Mouse 클래스를 받아 기능을 사용 가능
		Mouse mouse = new Mouse();
		mouse.leftClick();
		mouse.rightClick();
		
		// Mouse를 상속 받은 WheelMouse를 사용시 부모클래스의 기능도 사용 가능
		WheelMouse wheel = new WheelMouse();
		wheel.scroll();
		wheel.leftClick();
		wheel.rightClick();
	}

}
