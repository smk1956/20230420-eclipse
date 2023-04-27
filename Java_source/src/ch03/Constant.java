package ch03;

public class Constant {

	public static void main(String[] args) {
		// r * r * 3.14
		// PI 상수 final
		// 변수이름 r 반지름 정수
		// 결과 result -> double
		final double PI = 3.14;
		int r = 10;
		double result = r * r * PI;
		// 숫자, 수치, 계산

		System.out.println(result);
		/*
		 * double result = 0.0; result = r * r * PI;
		 */
	}
}
