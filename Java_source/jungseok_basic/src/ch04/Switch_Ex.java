package ch04;

import java.util.Scanner;

public class Switch_Ex {

	public static void main(String[] args) {
		// 123 봄 456 여름 789 가을 101112 겨울
		// switch(조건) ~ case ~ break ~ default

		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몇월 인가요 : ");

		int num = sc.nextInt();
		switch (num) {

		case 1:

		case 2:

		case 3:
			System.out.println("지금은 봄입니다.");
			break;
		case 4:

		case 5:

		case 6:
			System.out.println("지금은 여름입니다.");
			break;
		case 7:

		case 8:

		case 9:
			System.out.println("지금은 가을입니다.");
			break;
		case 10:

		case 11:

		case 12:
			System.out.println("지금은 겨울입니다.");
			break;

		default:
			System.out.println("잘못 입력하셧습니다.");
		}
	}
}