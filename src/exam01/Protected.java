package exam01;

import ����������.Test;
// �ٸ� ��Ű���� �ִ� Ŭ������ �ҷ����� ���� import�� ������


public class Protected{
	public static void main(String[] args) {
		
		Test test = new Test();
		Protectedclass pro = new Protectedclass();
		// ���������ڰ� public�� ��� ��밡��
		System.out.println(test.age);
		
		// ���� ��Ī�� ���� ��� defaultŬ������ �Ǳ⿡ ���� ��Ű�� �������� ��� ����
		// �ٸ� ��Ű������ ����Ϸ��� protected���·� ���� ��ӹ޾ƾ� ��� ����
		// ����Ϸ��� �󺹹��� Ŭ�������� ������ �����ؼ� ��߰���
		System.out.println(pro.scor);
		
		
	}
}
