package ch04;

import java.util.Scanner;

public class InfiniteLoop_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menu = 0;

		while (true) {
			System.out.println("(1) Square");
			System.out.println("(2) Square Root");
			System.out.println("(3) Log");
			System.out.print("원하는 메뉴 (1 ~ 3)를 선택하세요. (종료 : 0) : ");

			menu = sc.nextInt();
			if (menu == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (menu > 3 || menu < 1) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}

			System.out.println("선택하시메뉴는 " + menu + "번입니다.");
			return;
		}

	}
}
