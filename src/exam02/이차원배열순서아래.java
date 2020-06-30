package exam02;

public class 이차원배열순서아래 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[5][5];
		int num = 20;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				num++;
				array[i][j] = num;
			}
		}
		
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
