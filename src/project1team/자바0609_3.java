package project1team;

public class ÀÚ¹Ù0609_3 {
	public static String reverseStr(String str) {
		char[] array = new char[str.length()];
		char temp = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
		}
		for (int i = 1; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if ((int) array[j] > (int) array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		str = "";
		for (char i : array) {
			str += i;
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseStr("ZAbcdVefEg"));
	}

}
