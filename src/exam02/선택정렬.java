package exam02;

public class 선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 45, 7, 25, 12, 4 };
		int temp = 0;
		int point = 0;
		
		for (int i = 0; i < array.length-1; i++) {
			point = i;
			for (int j = i; j < array.length; j++) {
				if (array[point] < array[j]) {
					point = j;
					
				}
			}
			temp = array[i];
			array[i] = array[point];
			array[point] = temp;
			for (int k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for (int i : array) {
			System.out.print(i+" ");
		}
	}

}
	
