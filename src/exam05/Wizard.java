package exam05;

// �������̽��� ������ ���� �����ϴٶ�� ���� �ִ� implements�� Ȱ���Ͽ�  �޾ƿ´�.
// �������̽��� ��Ӱ� �ٸ��� �������� ���ÿ� ���Ĺ��� �� ����
public class Wizard implements Basic{

	@Override
	public void attack() {
		System.out.println("�����̷� ����!");
	}

	@Override
	public void move() {
		System.out.println("�ڷ���Ʈ ����!");
	}

}
