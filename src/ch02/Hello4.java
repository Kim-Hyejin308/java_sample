package ch02;

public class Hello4 {

	public static void main(String[] args) {

//		변수 선언과 초기화, 사용(참조)하기 전에 초기화가 되어 있어야함 variable
		int firstValue1 = 3;
//		value1 = 10;
		System.out.println(firstValue1);

//		상수 선언과 초기화(재할당) 불가, 전체 문자가 대문자 contant
		final double NUMBER_PI = 3.14;
//		PI =3.14.000;
		System.out.println(NUMBER_PI);

		subFunction();

	}

	public static void subFunction() {
		System.out.println("hello");

	}

}
