package exam01;

public class 변수_치환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 4;
		// 치환을 위한 임시변수 temp
		int temp;
		temp = a;
		a = b ;
		b = temp ;
		
		//,로 중복된 값을 출력할 수 없음
		//단 문자와 숫자열을 가리지 않고 합쳐서 나올 수 있음
		System.out.println(a+","+b);
		//자동형변환은 작은 데이터타입에서 큰 데이터타입으로 변경할 때 무리없이 변형함
		//','은 char타입으로 문자로 인식해서 4+44+3로 계산해버림
		System.out.println(a+','+b);

		char c1 = 44;
		System.out.println(c1);
		//강제적 형변환을 진행할 때 ()안에 타입을 명시한다.
		char c2 = (char)(a+','+b);
		System.out.println(c2);
		//넣어지는 데이터타입이 표현할 수 없을 경우 넘치는 것을 유실한다.
		int i2 = 10000000;
		short c3 = (short)i2;
		System.out.println(c3);
		
	}

}
