package exam01;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = add('+', 5);
		System.out.println(result);
	}
	// �żҵ� �����ε��̶� �ߺ����Ƕ� �ǹ�
	// �Ű������� ������ �ٸ��ų� Ÿ���� �ٸ� ��� ���� ��Ī�� ����ؼ� �ߺ� ���ǰ� �����ϴ�.
	
	public static int add(float i, float j) {
		return (int) (i + j);
	}
	
	private static int add(int i, int j) {
		return i + j;
	}
	
	public static int add(int i, int j, int z) {
		return i + j + z;
	}
	
	public static int add(char op, int i) {
		if (op == '+') {
			return i + 1;
		} else {
			return 0;
		}
	}
}
