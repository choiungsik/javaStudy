package exam05;

import java.util.ArrayList;
import java.util.Random;

public class animal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		cat.shouting();
		
		Dog dog = new Dog();
		dog.shouting();
		
		Deer deer = new Deer();
		deer.shouting();
		
		System.out.println();
		//VO
		//�θ�Ÿ������ ����Ǿ AnimalŸ������ list�� �߰��� ���� upcasting���� ����
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(cat);
		list.add(dog);
		list.add(deer);
		
		//3���� ���� �� �������� �Ѱ��� ������ ���� �޼ҵ带 ����
		Random rand = new Random();
		list.get(rand.nextInt(list.size())).shouting();
		
		System.out.println();
		
		long num1 = 10;
		int num2 = (int) num1;
		
		// Animal Ÿ���� �� ū �ǹ̸� ������ ������ �����ͺ����� ������ �߻��ϴ� �� �����ϰ� ��������ȯ�� �ϸ� �ٿ�ĳ������ ����
		Cat cat2 = (Cat)list.get(0);
		cat2.moveing();
		
		
	}

}
