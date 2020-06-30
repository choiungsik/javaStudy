package project1team;

public class a29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMiddle("test"));
	}

	private static char getMiddle(String string) {
		
		char[] array = string.toCharArray();
		char result=' ';
		
		if (array.length % 2 == 0) {
			System.out.print(array[array.length/2-1]);
			System.out.println(array[array.length/2]);
		} else {
			System.out.println(array[array.length/2]);
		}
		
		
		return result;
	}

}
