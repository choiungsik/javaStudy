package project1team;

public class 자바0605_1다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int dis = 0;
		int min = 999;
		int point1 = 0;
		int point2 = 0;

		// 최소값에 이르는 값을 저장해서 그 값이 찾아가는 방법
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					dis = point[i] - point[j];
					if (min > Math.abs(dis)) {
						min = Math.abs(dis);
						point1 = i;
						point2 = j;
					}
				}
			}
		}
		System.out.print("result = ["+point1+", "+point2+"]");
	}

}
