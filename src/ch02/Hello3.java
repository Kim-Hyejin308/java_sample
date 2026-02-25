package ch02;

public class Hello3 { // 클래스

	public static void main(String[] args) { // 매서드(특정 목적을 달성하기 위한 코드 모음)

//	메인 메서드 내부
		System.out.println("안녕"); // 화면에 문자열을 출력

		int v1 = 3; // 변수 선언과 값 할당을 동시에 함
		System.out.println(v1); // 화면에 변수 값 출력

		String str = "hello";
		System.out.println(str);

		System.out.print(str);
		System.out.print(str);
		System.out.print(str);
		System.out.print(str);
		System.out.print(str); // print -> 줄바꿈 없이 출력

		System.out.println(" ");

		System.out.printf("\n %d   %d", v1, v1);

		System.out.printf("\n %s   %s", str, str);

		System.out.printf("\n %.2f   %f", 3.14, 3.15);

	}

}
