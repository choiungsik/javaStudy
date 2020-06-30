package exam01;

public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 26개의 요소를 넣을 수 있는 배열 2개를 만든 형태(배열 2개는 요소가 저장된 공간의 주소값만 가진 형태
		int[][] score = new int[2][26];
		
		// 2개의 배열을 가지고 있어서 length는 배열의 갯수를 나타냄
		System.out.println(score.length);
		System.out.println(score[0].length);
		int num = 0;
		
		int[][] array = new int[5][5];
		
		System.out.println("array의 모든 값 : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				num++;
				array[i][j] = num;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
				// printf의 경우 println과 마찬가지로 줄바꿈 기능이 포함된 상태
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("array의 모든 값 : ");
		for (int i = 0; i < array.length; i++) {
			for (int va : array[i]) {
				System.out.print(va+" ");
			}
		}
	}

}
