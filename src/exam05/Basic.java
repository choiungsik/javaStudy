package exam05;

public interface Basic {

	// �������̽� �ȿ��� �߻�޼ҵ�� ���(�׻� �������ִ� ��)�� ���� �� ����
	public static final String GAMENAME = "�����ý��丮";
	// �������̽������� static final�̶�� ��Ī�� �Ⱥپ �ڵ����� �̸� �ٿ� ���� ������
	
	public abstract void attack();
	public abstract void move();
	
	// �������̽����� �Ϲ����� �޼ҵ�� ����� �Ұ��������� �̸� default�� ���ؼ� �����ϵ��� ����� ��� ����
	default public void hello() {
		System.out.println("�ȳ�");
	}
	
}
