package ch02;

import java.util.Scanner;

//Java Virtual Machine : JVM
//모든 프로그램의 기본 C > C++ > Java .... : 컴파일언어
//컴퓨터는 영어X > 컴퓨터가 읽을 수 > 프로그램 실행
//스크립트 : htmlcssjs 같이 포함 인터프리터
//컴파일러 : 자바
//인터프리터 : 웹 언어

//하이브리드 언어

public class Print_Ex { // static 공유, 누적

	// 배열 : 자료 많고 한 번 처리를 하나의 이름으로 처리
	// 고정배열 타입[] -> Register[]
	// 동적배열 List<> -> List<Register>()

	public static void main(String[] args) {

		// 입력 input
//		Scanner(System.in);
		// 출력 output
		System.out.print('A');
		System.out.println('B');
		System.out.println('C');
		// I/O Exception : 입출력

		// printf = format ex) Date.format(2023.04.26)
		int num1 = 100;
		System.out.printf("출력한 숫자는 %d", num1);
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 > ");
		String str = sc.next();
		System.out.printf("Scanner를 통해서 입력한 값은 %s", str);

	}
}
