package exam01;

public class pocketmon_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pocketmon pika = new Pocketmon("��ī��", "�鸸��Ʈ", 1000, 1, 200, 2000);
		Pocketmon kkobuk = new Pocketmon("������", "������", 500, 1, 200, 1000);

		pika.getStatus();
		kkobuk.getStatus();

		// ��ī�� �����̸� �����ؼ� Hp�� ��� ������ּ���.
		System.out.println();
		kkobuk.setHp(kkobuk.getHp() - pika.getAttack());
		System.out.println("�������");
		kkobuk.getStatus();
		System.out.println();
		System.out.println("���ϸ� ���� ȸ�� ��� �츮��~");
		kkobuk.setHp(200);
		kkobuk.getStatus();
		
		System.out.println();
		pika.setLevel(10);
		pika.getStatus();

	}

}
