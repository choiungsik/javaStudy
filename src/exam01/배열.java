package exam01;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray;  //배열의 선언
		intArray = new int[5];  //배열의 형성, 초기화된 상태에서는 기본 0값을 가진다.
		int[] intArray2 = {1, 2, 3, 4, 5};
		int intArray3[] = {1, 3, 4, 5, 6};
		
		System.out.println(intArray);  //배열 자체를 출력시 해당하는 저장공간에 대한 주소를 출력함
		
		int[] temp = intArray;
		
		temp[1] = 15;
		
		System.out.println(temp[1]);
		System.out.println(intArray[1]);
		
		System.out.println(temp);  //주소에 대한 것만 저장하기에 같은 주소를 공유하게 된다.
		
		//배열의 크기를 확인하는 leangth
		System.out.println(intArray.length);  
	}

}
