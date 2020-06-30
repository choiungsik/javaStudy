package exam02;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine {

	ArrayList<Toy> toyList= new ArrayList<Toy>();
	Random rand = new Random();
	
	public Toy getToy() {
		int randomIndex = rand.nextInt(toyList.size());
		return toyList.get(randomIndex);
	}
	
	// 부모클래스를 담아 자식클래스를 업캐스팅 가능하도록 만들어 사용
	public void addToy(Toy toy) {
		toyList.add(toy);
	}
}
