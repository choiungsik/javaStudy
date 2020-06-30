package exam01;

import 접근제한자.Test;
// 다른 패키지에 있는 클래스를 불러오기 위해 import가 생성됨


public class Protected{
	public static void main(String[] args) {
		
		Test test = new Test();
		Protectedclass pro = new Protectedclass();
		// 접근제한자가 public인 경우 사용가능
		System.out.println(test.age);
		
		// 별도 명칭이 없는 경우 default클래스가 되기에 같은 패키지 내에서만 사용 가능
		// 다른 패키지에서 사용하려면 protected형태로 만들어서 상속받아야 사용 가능
		// 사용하려면 상복받은 클래스에서 별도로 지정해서 써야가능
		System.out.println(pro.scor);
		
		
	}
}
