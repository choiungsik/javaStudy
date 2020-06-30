package javaJDBC;

public class ex00trycatch {

	public static void main(String[] args) {
		/*
		 * Java���� ����Ǵ� ���� - java -> ������ -> .class -> ���� 
		 * ������ 2���� 1. ������ ����, 2. ��Ÿ�ӿ���
		 * �����Ͽ����� ������ ���� 
		 * ��Ÿ�ӿ��� : ������ �Ǿ� �˼� �ִ� ���� (����ã�� �� (����) / DB / ��Ʈ��ũ ��) 
		 * try ~ catch(����ó��) ���� p 152
		 */

		System.out.println("�������");

		// try�� ���α׷��� �����ϴ� �κ�
		try {
			System.out.println(2 / 0);
		} catch (Exception e) {
			// catch�� ������ ���� �� ������ �κ�
			System.out.println("�����߻�");
			e.printStackTrace();
		}
		// ������ ���� catch�ʿ� �ִ� ��ɹ��� ������� ������ ������ ���������� �۵���Ŵ
		// e.printStackTrace()�� ���ؼ� � ������ �������� Ȯ�� �� �� ����(e��� ������ ���������� ������ ����)
		finally {
			System.out.println("try ~ catch ����");
		}
		// finally�� try~catch �������� ������ ����Ǵ� ��ɾ�(������ ���� �ȳ��� ������ �����)

		System.out.println("����Ϸ�");

	}

}
