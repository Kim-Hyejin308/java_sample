package ch02;

public class NunberTypedemo {

	public static void main(String[] args) {

//		소리가 1시간(60 * 60초) 동안 가는 거리
		int mach;
		int distance;
		mach = (int) 340.0f; // 강제 형변환 할때 명시적으로 앞에 작석해줘야함(int) = 명시적 형변환
		distance = 60 * 60 * mach;
		System.out.printf("소리가 1시간(60 * 60초) 동안 가는 거리는 %dm입니다\n", distance);

//		반지름이 10.0 인 원의 넓이
		final double PI = 3.14;
//		int radius = 10;
		double radius = 10; // int 를 자동으로 double 로 자동형 변환
		double area = PI * radius * radius;
		System.out.printf("반지름이 10.0인 원의 넓이는 %.2f 입니다", area);

		long l = (long) 3.14d;

	}

}
