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
	
	// �θ�Ŭ������ ��� �ڽ�Ŭ������ ��ĳ���� �����ϵ��� ����� ���
	public void addToy(Toy toy) {
		toyList.add(toy);
	}
}
