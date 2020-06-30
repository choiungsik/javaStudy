package project1team;

public class a14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = {92, 32, 52, 9 , 81, 2, 68};
		int dis = 0;
		int min = 999;
		int point1 = 0;
		int point2 = 0;
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if(i != j) {
					dis = point[i] - point[j];
					if (Math.abs(dis) < Math.abs(min) ) {
						min = dis;
						point1 = i;
						point2 = j;
					}
				}
			}
		}
		
		System.out.println("result = ["+point1+", "+point2+"]");
		
	}

}
