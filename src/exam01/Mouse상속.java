package exam01;

public class Mouse��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� Mouse Ŭ������ �޾� ����� ��� ����
		Mouse mouse = new Mouse();
		mouse.leftClick();
		mouse.rightClick();
		
		// Mouse�� ��� ���� WheelMouse�� ���� �θ�Ŭ������ ��ɵ� ��� ����
		WheelMouse wheel = new WheelMouse();
		wheel.scroll();
		wheel.leftClick();
		wheel.rightClick();
	}

}
