package exam02;

public class �л������������α׷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] stArr = new student[2];
		
		stArr[0]=new student("�����", 1, 20);
		stArr[1]=new student("������", 2, 12);
		
		for (int i = 0; i < stArr.length; i++) {
			System.out.print(stArr[i].getName()+", ");
			System.out.print(stArr[i].getBan()+"��, ");
			System.out.println(stArr[i].getNum()+"��");
		}
		
	}

}
