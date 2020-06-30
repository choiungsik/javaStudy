package project1team;

public class 자바0607_3연습 {
	
	public static void main(String[] args) {
		int num = 64;
		int B = 0;
		
		for (int i = 0; i < 5; i++) {
			if (i < 2) {
				for (int j = 0; j < B; j++) {
					System.out.printf("%1s ", " ");
				}
				B++;
				
				for (int j = i; j < 5 - i; j++) {
					num++;
					System.out.printf("%1s ", (char)num);
				}
			}else {
				for (int j = 0; j < B ; j++) {
					System.out.printf("%1s ", " ");
				}
				B--;
				
				for (int j = 4-i; j < i +1 ; j++) {
					num++;
					System.out.printf("%1s ", (char)num);
				}
			}
			System.out.println();
		}
		
	}

}
