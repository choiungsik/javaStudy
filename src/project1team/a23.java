package project1team;

public class a23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseStr("ZAbcdVefEg"));
	}

	public static String reverseStr(String a) {

		char[] array = new char[a.length()];
		char temp = array[0];
		String result = "";

		for (int i = 0; i < array.length; i++) {
			array[i] = a.charAt(i);
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
					if ((int) array[j] > (int) array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
				}
			}

		}
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k]);
			temp = array[k];
		}
		return result;

	}

}
