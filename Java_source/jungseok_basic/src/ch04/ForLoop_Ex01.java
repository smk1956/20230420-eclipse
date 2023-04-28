package ch04;

public class ForLoop_Ex01 {

	public static void main(String[] args) {
		// for 가로 세로
//		for (int i = 0; i < 10; ++i) {
//			System.out.print(i);
//		}

		// for 예제
		// 출력결과 0|1|2|3|4|5|6|7|8|9
		for (int i = 0; i < 10; ++i) {
			System.out.print(" | " + i);
			if (i == 9) {
				System.out.print(" | ");
			}

		}
	}
}
