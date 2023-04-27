package ch04;

public class WhileLoop_Ex {

	public static void main(String[] args) {
		// for(int i = 0; i < 10; ++i) { 출력코드 }
		for (int i = 0; i < 10; ++i) {
			System.out.print(i);
		}

		System.out.println("");

		// while 반복
		int i = 0;
		while (i < 10) {
			System.out.print(i);
			++i;
		}

		// 무한루프
//		boolean isRun = true;
//		while (isRun) {
//		}
//
//		boolean isRun = false;
//		while (!isRun) {
//		}
//
//		while (true) {
//		} // Scanner 만나면 멈춤

	}
}
