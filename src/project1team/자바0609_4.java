package project1team;

public class �ڹ�0609_4 {

	public static String findKim(String[] names) {
		String result = "";
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kim")) {
				result = "�輭���� "+(1+i)+"�� �ִ�.";
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
