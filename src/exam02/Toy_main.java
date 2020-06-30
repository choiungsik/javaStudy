package exam02;

public class Toy_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomToyMachine machine = new RandomToyMachine();
		machine.addToy(new Ball());
		machine.addToy(new Gun());
		machine.addToy(new Train());
		machine.addToy(new slime());
		
		// toy라는 호출로 machine에 있는 배열에서 랜덤한 위치에 있는 요소를 가져오게 함
		Toy toy = machine.getToy();
		toy.play();
	}

}
