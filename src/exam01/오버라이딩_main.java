package exam01;

public class �������̵�_main {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		Dog dog = new Dog();
		
		ani.eat();
		ani.move();
		System.out.println();
		
		dog.eat();
		dog.move();
		dog.move("������ ");
		System.out.println();
		
		// Dog Ŭ������ animalŬ������ ��ӹް� ���� ���� ����Ŭ������ ����Ŭ���� Ÿ������ �ڵ� Ÿ�Ժ�ȯ�� ��Ŵ
		// �ڵ� ��ȯ�Ǵ°� �ٷ� Upcasting
		Animal anim = new Dog();
		// ��ĳ������ �θ�Ŭ�������� ��ӹ��� ��ɸ� ���� �����ؼ� �ڽ�Ŭ���� ��������� ��� �Ұ���(Dog�� ������� bite�� ���Ұ�)
		// �� �������̵��� ��� �ڽ�Ŭ������ ����� ������ (DogŬ������ eat�� ȣ���ؼ� �����)
		anim.eat();
		anim.move();
		System.out.println();
		
		Animal anima = new Cat();
		anima.eat();
		anima.move();
		System.out.println();
		
		
		// �ٿ�ĳ������ ��ĳ���� �� ���¿����� ��밡��
		// ��ĳ���õ� ���¿����� �ڽ� ������ ���´� ����� �� ���� �� �� �ٿ�ĳ�������� �����Ͽ� �ʿ��� �޼ҵ带 �̾Ƽ� ��밡��(Dog�� ������� bite ��밡��)
		Dog d = (Dog)anim;
		d.bite();
		System.out.println(anim);
		System.out.println(d);
		
	}

}
