package exam02;

public class Toy_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomToyMachine machine = new RandomToyMachine();
		machine.addToy(new Ball());
		machine.addToy(new Gun());
		machine.addToy(new Train());
		machine.addToy(new slime());
		
		// toy��� ȣ��� machine�� �ִ� �迭���� ������ ��ġ�� �ִ� ��Ҹ� �������� ��
		Toy toy = machine.getToy();
		toy.play();
	}

}
