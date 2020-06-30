package exam02;

public class 학생정보관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] stArr = new student[2];
		
		stArr[0]=new student("김미희", 1, 20);
		stArr[1]=new student("이은비", 2, 12);
		
		for (int i = 0; i < stArr.length; i++) {
			System.out.print(stArr[i].getName()+", ");
			System.out.print(stArr[i].getBan()+"반, ");
			System.out.println(stArr[i].getNum()+"번");
		}
		
	}

}
