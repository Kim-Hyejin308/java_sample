package ch02;

public class TypeCastDemo {

	public static void main(String[] args) {

		// 연산에서 자동 형변환

		// 정수의 나눗셈 - 정수의 몫
		int v1 = 10;
		int v2 = 3;
		int res1 = v1 / v2;
		System.out.println(res1);

		//
		double res10 = (double) 7 / 4;
		System.out.println(res10);
		double res11 = (double) (7 / 4);
		System.out.println(res11);

		// 실수의 나눗셈 - 소숫점까지 포함한 결과
		double res2 = 10.0 / 3.0;
		System.out.println(res2);

		// 실수를 정수로 나누면 - 자동 형변환을 진행함
		double res3 = 10.0 / 3;
		System.out.println(res3);

//		int res4 = 10.0 / 3;
//		System.out.println(res4);

	}

}
