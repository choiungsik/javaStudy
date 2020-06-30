package exam02;

public class 배열순차변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseStr2("ZKabEdfHyi"));
	}

	private static String reverseStr2(String message) {
		char[] arr = message.toCharArray();

		
		for (int j = 0; j < arr.length - 1; j++) {
			for (char i : arr) {
				System.out.print(i);
			}
			System.out.println();
			int minIndex = j;
			for (int i = j+1; i < arr.length; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			char temp = arr[minIndex];
			arr[minIndex] = arr[j];
			arr[j] = temp;
		}
		message = "";
		for (int j = 0; j < arr.length; j++) {
			message += arr[j];
		}
			

		return message;
	}

}
