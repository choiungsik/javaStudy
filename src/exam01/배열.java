package exam01;

public class �迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray;  //�迭�� ����
		intArray = new int[5];  //�迭�� ����, �ʱ�ȭ�� ���¿����� �⺻ 0���� ������.
		int[] intArray2 = {1, 2, 3, 4, 5};
		int intArray3[] = {1, 3, 4, 5, 6};
		
		System.out.println(intArray);  //�迭 ��ü�� ��½� �ش��ϴ� ��������� ���� �ּҸ� �����
		
		int[] temp = intArray;
		
		temp[1] = 15;
		
		System.out.println(temp[1]);
		System.out.println(intArray[1]);
		
		System.out.println(temp);  //�ּҿ� ���� �͸� �����ϱ⿡ ���� �ּҸ� �����ϰ� �ȴ�.
		
		//�迭�� ũ�⸦ Ȯ���ϴ� leangth
		System.out.println(intArray.length);  
	}

}
