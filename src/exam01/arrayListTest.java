package exam01;

import java.util.ArrayList;

public class arrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList��ü ����
		ArrayList<String> list = new ArrayList<String>();
		
		// ������ �߰�
		list.add("���");
		list.add("����");
		
		// ������ ��������
		System.out.println(list.get(1));
		
		// ���ϴ� ��ġ�� ������ �߰�(������ �ִ� �����ʹ� ���� ��ġ�� �̵�)
		list.add(1, "��");
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// ����� ���� Ȯ��
		System.out.println("list�� ���� : "+list.size());
		
		// ������ ����
		list.remove(0);
		System.out.println(list.get(0));
		
		// ������ ��ü ����
		list.clear();
		System.out.println(list.get(0));
	}

}
