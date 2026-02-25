package ch02;

public class Hello2 {

	public static void main(String[] args) {
		// 요구사항 -> 30억 + 50억 의 결과를 화면에 출력하는 프로그램 작성
		long v1 = 3000000000L;
		long v2 = 5000000000L;
		System.out.println(v1 + v2);

		// 요구사항 -> 3.14 + 5.4 의 결과를 화면에 출력하는 프로그램 작성
		float v3 = 3.14f;
		float v4 = 5.4f;
		float sum = v3 + v4;
		System.out.printf("sum = %.16f", sum);

		// 요구사항 -> 3.14 + 5.4 의 결과를 화면에 출력하는 프로그램 작성
		double v5 = 3.14;
		double v6 = 5.4;
		double sum2 = v5 + v6;
		System.out.printf("sum = %.16f", sum2);

	}

}
