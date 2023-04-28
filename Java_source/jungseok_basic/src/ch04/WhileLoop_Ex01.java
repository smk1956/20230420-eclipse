package ch04;

import java.util.Scanner;

public class WhileLoop_Ex01 {

	public static void main(String[] args) {
		// (int)(math.random()*10) + 1
		// 컴퓨터가 만들어낸
		//

		// 한바퀴 돌 때마다 랜덤수, 사람이 입력을 받아야 함 = true
		// com > per : 큰수 com < per : 작은 수
		// 맞추면 프로그램 종료

		Scanner sc = new Scanner(System.in);
//		int com = (int) (Math.random() * 10) + 1;
//		int per = sc.nextInt();
//		int com = 0;
//		int per = 0;
//		boolean isRun = false;

//		while (!isRun) {
//			com = (int) (Math.random() * 6) + 1;
//			System.out.print("정수입력 > ");
//
//			per = sc.nextInt();
//
//			if (com > per) {
//
//				System.out.print("큰 수를 입력 > ");
//			} else if (com < per) {
//
//				System.out.print("작은 수를 입력 > ");
//			} else {
//				System.out.println("정답 입니다.");
//				return;
//			}
//		}

//		int com = (int) (Math.random() * 3) + 1;
//
//		System.out.println("1 ~ 3 사이의 숫자를 입력 하세요 > ");
//		int per = sc.nextInt();
//
//		if (com > per) {
//			System.out.println("더 큰 수를 선택하세요.");
//		} else if (com < per) {
//			System.out.println("더 작은 수를 선택하세요.");
//		} else {
//			System.out.println("정답입니다.");
//		}

		int com = (int) (Math.random() * 10) + 1;

		System.out.print("1 ~ 10 사이의 숫자를 입력 하세요 > ");
		int per = sc.nextInt();

		while (com != per) {
			if (com > per) {
				System.out.println("");
				System.out.print("더 큰 수를 선택하세요. > ");

			} else if (com < per) {
				System.out.println("");
				System.out.print("더 작은 수를 선택하세요. > ");

			}
			per = sc.nextInt();

		}
		System.out.println("정답입니다.");
		System.exit(0);

	}

}
