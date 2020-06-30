package exam02;

public class WhildAnimal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WildAnimal ani = new Lion();
		ani.hunt();
		System.out.println();
		
		WildAnimal[] aniArr = new WildAnimal[3];

		// 상속관계이기에 각각의 업캐스팅시켜 배열에 넣음
		aniArr[0] = new Wolf();
		aniArr[1] = new Lion();
		aniArr[2] = new Eagle();

		for (int j = 0; j < aniArr.length; j++) {
			aniArr[j].hunt();
		}
	}

}
