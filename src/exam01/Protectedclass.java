package exam01;

import ����������.Test;

public class Protectedclass extends Test{

	Test test = new Test();
	int scor = super.score;
	
	public void info() {
		// ��Ӱ��迩�� private �� default�� ������ �Ұ�����
		System.out.println(super.age);
		System.out.println(this.score);
	}
}
