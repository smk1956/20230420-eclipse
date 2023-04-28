package ch06;

class ToStringArr {

	public void printArr(int[] arr) {
//		System.out.println(Arrays.toString(arr));
		for (int a : arr) {
//			System.out.println(a);
		}
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; ++i) {
//			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("학생수 : " + arr.length + "명");
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + sum / (double) arr.length);
	}
}

public class ArrayMethod2 {

	public static void main(String[] args) {
		// 임의 정수 5개를 입력 받아서 배열을 문자열로 변환하여 출력하시오.
		// Arrays.toString() : 메소드 만들어서
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		ToStringArr tsa = new ToStringArr();
		tsa.printArr(arr);
	}
}
