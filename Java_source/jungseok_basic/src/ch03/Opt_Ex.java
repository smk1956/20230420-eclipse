package ch03;

import java.util.Scanner;

public class Opt_Ex {

	public static void main(String[] args) {
		// Scanner 정수를 입력 받아서
		// 짝수(Even)인지 홀수(Odd)인지 표시하시오
		Scanner sc = new Scanner(System.in);

//		System.out.print("정수 입력 > ");
//		int num = sc.nextInt();
//		System.out.println(num);
		// 숫자나 객체는 == 동등비교
		// 숫자나 객체는 != 같지 않다
		// 문자나 문자열은 equals()

//		if (num % 2 == 0)
//			System.out.println("짝수");
//
//		else
//			System.out.println("홀수");

		while (true) {
			System.out.print("메뉴선택(정수) > ");
			int select = sc.nextInt();

			// 1 누르면 확인
			// 2 정지
			switch (select) {

			case 1:
				System.out.println("");
				System.out.print("홀수와 짝수를 구할 숫자 : ");

				int num = sc.nextInt();
				if (num % 2 == 0) {
					System.out.println("짝수");
					System.out.println("");
				} else {
					System.out.println("홀수");
					System.out.println("");
				}
				break;
			default:
				System.out.println("");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;

			}
		}

	}

}
