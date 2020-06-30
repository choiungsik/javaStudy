package project1team;

public class 자바0609_4 {

	public static String findKim(String[] names) {
		String result = "";
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kim")) {
				result = "김서방은 "+(1+i)+"에 있다.";
			}
		}		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));
	}

}
