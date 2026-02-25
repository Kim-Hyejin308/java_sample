package ch02;

public class CharDemo {

	public static void main(String[] args) {

		// 주소 호출과 타입(형변환) 실습

//		char c = 'A';

		char c = 65;

//		char c = '\u0041'; 

		System.out.println(c);

		char c2 = 3 + '0'; // '3' 숫자를 문자로
		System.out.println(c2);
		int i1 = c2 - '0'; // '3' 문자를 숫자로
		System.out.println(i1);

		String str = "hello";
		char c1 = str.charAt(0); // 문자열에서 0번째 문자를 가져와, 문자열을 문자로 변환
		System.out.println(c1);

		String str2 = c1 + "";
		System.out.println(str2); // 문자를 문자열로 변환

		String str3 = 7 + "";
		System.out.println(str3); // 숫자를 문자열로 바꿔(타입변환)

		// 아래 두 결과 값이 다름, 왼쪽 부터 연산
		String str4 = 7 + 7 + "";
		System.out.println(str4);
		String str5 = "" + 7 + 7;
		System.out.println(str5);

		// (int) 숫자 형태의 문자열을 숫자로
		String str6 = "30000" + 10;
		System.out.println(str6);
		int i6 = Integer.parseInt(str6) + 10;
		System.out.println(i6);

		String str7 = "3.140002";
		double d2 = Double.parseDouble(str7) + 10; // new Double 객체를 만들지 않고 뮨자열로 바로 실수로 바꿔
		System.out.println(d2);

	}

}

//double float long int shot,char byte