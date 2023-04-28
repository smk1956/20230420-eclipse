package ch04;

public class BreakContinue_Ex {

	public static void main(String[] args) {
		// break; 바로 밑에 중괄호를 빠져나감
//		for (int i = 0; i < 5; ++i) {
//			if (i == 3)
//				break;
//			System.out.println(i);
//
//		}
//		System.out.println("반복문 종료");

		// continue : 해당 조건을 건너 뜀
//		for (int i = 0; i < 10; ++i) {
//			if (i == 3)
//				continue;
//			System.out.println(i);
//		}
//		System.out.println("반복문 종료");

		// while문을 이용해서 0 ~ 10 더하는 프로그램
		// 더하거나 계산하거나 한 후 결과가 하나만 나올때는 바깥에 변수
		int sum = 0;
		int num = 0;
		while (num < 10) {
//			if (num == 6)
//				break;
//			if (num == 6)
//				continue;			
			++num;
			sum += num;

		}
		System.out.println("총합 : " + sum);

	}
}
