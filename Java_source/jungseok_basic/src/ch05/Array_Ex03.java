package ch05;

import java.util.Arrays;

public class Array_Ex03 {

	public static void main(String[] args) {
		// 배열 3개 값을 입력한 후
		// int[] i = new int[] {1, 2, 3};
		// 제일 큰값 구하기
		// 제일 작은값 구하기
		// -> 비교값
		int[] scores = new int[] { 2, 3, 1 };
		int max = scores[0];
		int min = scores[0];

		for (int i = 0; i < scores.length; ++i) {
			if (scores[i] > max) {
				max = scores[i];
			} else if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("-----------------------------");

		// Boolean 타입
		// 배열을 문자열로 출력
		boolean[] b = new boolean[] { true, false };
		for (boolean bo : b) {
			System.out.println(bo); // 값을 하나하나

		}
		System.out.println(Arrays.toString(scores));
	}
}
