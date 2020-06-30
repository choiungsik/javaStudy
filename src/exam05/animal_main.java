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
		//부모타입으로 변경되어서 Animal타입으로 list에 추가된 것을 upcasting으로 정의
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(cat);
		list.add(dog);
		list.add(deer);
		
		//3개의 동물 중 랜덤으로 한개의 동물의 울음 메소드를 실행
		Random rand = new Random();
		list.get(rand.nextInt(list.size())).shouting();
		
		System.out.println();
		
		long num1 = 10;
		int num2 = (int) num1;
		
		// Animal 타입이 더 큰 의미를 가지기 때문에 데이터변형시 에러가 발생하는 걸 감수하고 강제형변환을 하면 다운캐스팅이 가능
		Cat cat2 = (Cat)list.get(0);
		cat2.moveing();
		
		
	}

}
