package exam01;

public class �޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num(4, 5));
		print(3);
//		System.out.println(print(3));
		//����Ʈ �� �ȿ� ����Ʈ�� �ִ� ���¶� ������ �߻��ϴ� ���� ������ ��
		printName();
	}

	public static int num(int i, int j) {
		return i + 1;

	}

	// ���� ���� ������ void ���
	public static void print(int i) {
		System.out.println("���� ���� �����ϴ� ���ڴ� " + i + "�Դϴ�.");
		System.out.println("�żҵ�� ���̵带 ������ �� ������ �ᵵ ��� ����");
	}

	// �Ű������� ���� �޼ҵ�
	public static void printName() {
		System.out.println("�� �̸��� �ֿ����Դϴ�.");
	}
	
}
