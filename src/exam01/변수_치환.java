package exam01;

public class ����_ġȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 4;
		// ġȯ�� ���� �ӽú��� temp
		int temp;
		temp = a;
		a = b ;
		b = temp ;
		
		//,�� �ߺ��� ���� ����� �� ����
		//�� ���ڿ� ���ڿ��� ������ �ʰ� ���ļ� ���� �� ����
		System.out.println(a+","+b);
		//�ڵ�����ȯ�� ���� ������Ÿ�Կ��� ū ������Ÿ������ ������ �� �������� ������
		//','�� charŸ������ ���ڷ� �ν��ؼ� 4+44+3�� ����ع���
		System.out.println(a+','+b);

		char c1 = 44;
		System.out.println(c1);
		//������ ����ȯ�� ������ �� ()�ȿ� Ÿ���� ����Ѵ�.
		char c2 = (char)(a+','+b);
		System.out.println(c2);
		//�־����� ������Ÿ���� ǥ���� �� ���� ��� ��ġ�� ���� �����Ѵ�.
		int i2 = 10000000;
		short c3 = (short)i2;
		System.out.println(c3);
		
	}

}
