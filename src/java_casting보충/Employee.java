package java_casting보충;

// 1개 이상의 추상메소드가 있으면 클래스도 추상클래스로 만들어야한다.
public abstract class Employee {

	String EmpNo;
	String Name;
	int Pay;
	
	// calculate는 자식클래스에게 이름만 빌려주는 정도라 추상메소드로 작성
	public abstract int calculate();
	

}
