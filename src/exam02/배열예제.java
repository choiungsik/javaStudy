package exam02;

public class 배열예제 {

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
		System.out.println("전체 데이터 합 : "+sum);
		
		sum = 0;
		System.out.println(array);
		for (int var : array) {
			// 배열 전체에 대해서 var라는 변수에 담고 그걸 출력하는 방법
			System.out.print(var+" ");
			sum += var;
		}
		System.out.println();
		System.out.println("전체 데이터 합 : "+sum);
		System.out.println("평균값 : "+sum/array.length);
	}

}
