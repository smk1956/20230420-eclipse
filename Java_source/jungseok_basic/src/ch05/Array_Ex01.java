package ch05;

public class Array_Ex01 {

	public static void main(String[] args) {
		// 배열의 선언 : 배열공간: 3가지
		// 타입[] 배열명 = new 타입[배열개수]; 공간은 1 : 배열의 이름은 0

		/* 첫번 째 방법 */
//		int[] arr = new int[3];
//		//값초기화
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;

		/* 두번 째 방법 */
		// 배열을 선언하면 동시에 초기화
//		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		for (int i = 0; i < array.length; ++i) {
//			// System.out.println(배열이름[인덱스]);
//			System.out.println(array[i]);
//		}
		/* 세번 째 방법 */
		// 문자 배열로 char
//		char[] array2 = new char[] { 'a', 'b', 'c', 'd', 'e' };
//		for (int i = 0; i < array2.length; ++i) {
//			System.out.print((int) array2[i]);
//		}
//
//		// for(타입 변수 : 배열이름) {}
//		for (char c : array2) {
//			System.out.print((int) c);
//		}

		/* 실수로 배열만들기 */
		double[] d = new double[5];
		for (int i = 0; i < d.length; ++i) {
			d[i] = 0.1;
		}
		for (double d1 : d) {
			System.out.println(d1);
		}
	}
}
