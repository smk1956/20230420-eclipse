package ch03;

public class Operator_Ex {

	public static void main(String[] args) {
//		int x, y; // 정수가 저장될 메모리 공간이 할당
//		x = y = 3;
//		System.out.println(x);
//		System.out.println(y);
//
//		System.out.println("-----------증감연산자----------");
//		int i = 5;
//		int j = 0;
//
//		j = i++;
//		System.out.println(j);
//
//		System.out.println("---------------------------");

		// 프로그램은 특별한 지정을 하지 않으면 숫자는 기본적으로 int로 저장을 함
//		System.out.println(5 / (double) 2); // 정수를 실수로 변환할 때는 제수에 형변환을 작업
//		System.out.println(5 / (float) 2); // 정수를 실수로 변환할 때는 제수에 형변환을 작업

		// 1 / 10 - ceil(0.1) -> 1페이지
		// 한 페이지 10
		// 한 페이지 11
		// 웹 게시물 -> 쪽번호 : 1 -> 1

		System.out.println("------------------------------");

		// 8bit = 2*2*2*2*2*2*2*2
		// -128~ 0 127
		// 저장공간이 1byte = 8(bit)
		// -128 ~ 0 ~ 127
		byte a = 10;
		byte b = 13;
		byte c = (byte) (a * b); // 130 -> -126 : 127까지 저장이 안되서 130은 -값으로가서 -128 -127 -126

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
