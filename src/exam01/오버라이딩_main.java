package exam01;

public class 오버라이딩_main {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		Dog dog = new Dog();
		
		ani.eat();
		ani.move();
		System.out.println();
		
		dog.eat();
		dog.move();
		dog.move("빠르게 ");
		System.out.println();
		
		// Dog 클래스가 animal클래스를 상속받고 있을 때는 하위클래스를 상위클래스 타입으로 자동 타입변환을 시킴
		// 자동 변환되는게 바로 Upcasting
		Animal anim = new Dog();
		// 업캐스팅은 부모클래스에서 상속받은 기능만 접근 가능해서 자식클래스 고유기능은 사용 불가함(Dog의 고유기능 bite는 사용불가)
		// 단 오버라이딩한 경우 자식클래스의 기능을 가져옴 (Dog클래스의 eat를 호출해서 사용함)
		anim.eat();
		anim.move();
		System.out.println();
		
		Animal anima = new Cat();
		anima.eat();
		anima.move();
		System.out.println();
		
		
		// 다운캐스팅은 업캐스팅 된 상태에서만 사용가능
		// 업캐스팅된 상태에서는 자식 고유의 형태는 사용할 수 없고 그 때 다운캐스팅으로 정의하여 필요한 메소드를 뽑아서 사용가능(Dog의 고유기능 bite 사용가능)
		Dog d = (Dog)anim;
		d.bite();
		System.out.println(anim);
		System.out.println(d);
		
	}

}
