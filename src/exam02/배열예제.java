package exam02;

public class �迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		int sum = 0;
		array = new int[10];
		
		array[0] = 13;
		array[1] = 5;
		array[2] = 7;
		array[3] = 17;
		array[4] = 3;
		array[5] = 16;
		array[6] = 19;
		array[7] = 20;
		array[8] = 2;
		array[9] = 1;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			sum += array[i];
		}
		System.out.println();
		System.out.println("��ü ������ �� : "+sum);
		
		sum = 0;
		System.out.println(array);
		for (int var : array) {
			// �迭 ��ü�� ���ؼ� var��� ������ ��� �װ� ����ϴ� ���
			System.out.print(var+" ");
			sum += var;
		}
		System.out.println();
		System.out.println("��ü ������ �� : "+sum);
		System.out.println("��հ� : "+sum/array.length);
	}

}
