package ch06;

import java.util.Scanner;

class Cals {
	int x;
	int y;

	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}

}

public class Cals_Ex {

	public static void main(String[] args) {

		Cals c = new Cals();
		System.out.println("더하기 : " + c.add(7, 5));
		System.out.println("빼기 : " + c.sub(7, 5));
		System.out.println("곱하기 : " + c.mul(6, 6));
		System.out.println("나누기 : " + c.div(6, 2));
		System.out.println("-------------------------------");

		int res1 = c.add(100, 200);
		int res2 = c.sub(300, 200);
		int res3 = c.mul(100, 200);
		int res4 = c.div(200, 200);
		System.out.println("더하기 : " + res1);
		System.out.println("빼기 : " + res2);
		System.out.println("곱하기 : " + res3);
		System.out.println("나누기 : " + res4);

		// Scanner를 이용한 사칙연산
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int n2 = sc.nextInt();
		System.out.print("원하는 (+, -, *, /)연산을 넣으세요 : ");
		char cal = sc.next().charAt(0);

		int result = 0;
		switch (cal) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
		System.out.println("계산 결과 : " + result);

	}
}
