package project1team;

public class �ڹ�0610_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] array = score.split(",");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "A":
				a++;
				break;
			case "B":
				b++;
				break;
			case "C":
				c++;
				break;
			case "D":
				d++;
				break;
			case "F":
				f++;
				break;
			}
		}
		
		System.out.println("A : "+a+"��");
		System.out.println("B : "+b+"��");
		System.out.println("C : "+c+"��");
		System.out.println("D : "+d+"��");
		System.out.println("F : "+f+"��");
		
	}

}
