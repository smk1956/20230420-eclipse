package ch06;

class CalArray {
	// 합을 구하는 메소드
	public int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; ++i) {
//			sum = sum + scores[i];
			sum += scores[i];
		}
		return sum;
	}

};

public class ArrayMethod {

//	public static int add(int[] scores) {
//		int sum = 0;
//		for (int i = 0; i < scores.length; ++i) {
//			sum = sum + scores[i];
//		}
//		return sum;
//	}

	// 1. ***리턴***: 메소드안에서만
	// 2. void 빼고 무조건 return
	// 3. 메소드 안에 sysout 명령어가 있으면 void - return x
	// 4. 리턴타입 i

	public static void main(String[] args) {
		// 배열을 이용해서 100, 200, 300, 400 ,500 더하는 프로그램을 작성하시오.
		// 더하기는 메소드를 이용해서
//		int[] scores = new int[] { 100, 200, 300, 400, 500 };
//		System.out.println(add(new int[] { 100, 200, 300, 400, 500 }));
//		System.out.println(add(scores));
		// 타입 변수 생성자
		// 메소드의 파라미터는 타입변수
		// 사용하는 메소드이름의 파라미터는 생성자
		int[] scores = new int[] { 10, 20, 30, 40 };

		CalArray ca = new CalArray();
		System.out.println(ca.add(scores));

	}
}
