package exam01;

public class pocketmon_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pocketmon pika = new Pocketmon("피카츄", "백만볼트", 1000, 1, 200, 2000);
		Pocketmon kkobuk = new Pocketmon("꼬북이", "물대포", 500, 1, 200, 1000);

		pika.getStatus();
		kkobuk.getStatus();

		// 피카츄가 꼬북이를 공격해서 Hp를 깎게 만들어주세요.
		System.out.println();
		kkobuk.setHp(kkobuk.getHp() - pika.getAttack());
		System.out.println("전투결과");
		kkobuk.getStatus();
		System.out.println();
		System.out.println("포켓몬 센터 회복 띵띵 띠리딩~");
		kkobuk.setHp(200);
		kkobuk.getStatus();
		
		System.out.println();
		pika.setLevel(10);
		pika.getStatus();

	}

}
