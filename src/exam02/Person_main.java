package exam02;

public class Person_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("±è¹ÌÈñ");
		System.out.println(p1.name+" "+p1.age);
		Person p2 = new Person("ÃÖ¿õ½Ä", 28);
		System.out.println(p2.name+" "+p2.age);
		Person p3 = new Person(30);
		System.out.println(p3.name+" "+p3.age);
		
//		PersonVO person1 = new PersonVO("ÃÖ¿õ½Ä", 20, "010-1234-5678");
		
		int[] arr = new int[3];
		PersonVO[] personArr = new PersonVO[3];
		personArr[0] = new PersonVO("ÃÖ¿õ½Ä", 28, "010-5698-7234");
		System.out.println(personArr[0].getAge());
	}

}
