package exam01;

import 접근제한자.Test;

public class Protectedclass extends Test{

	Test test = new Test();
	int scor = super.score;
	
	public void info() {
		// 상속관계여도 private 와 default는 접근이 불가능함
		System.out.println(super.age);
		System.out.println(this.score);
	}
}
