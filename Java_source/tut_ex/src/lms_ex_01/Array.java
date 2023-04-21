package lms_ex_01;

public class Array {
	public static void main(StringEx[] args) {
		// 학생 100명의 국어점수를 저장하시오. 변수 score(scores)
		int[] scores = new int[5]; // 인덱스 번호는 0번부터 시작 0,1,2
		scores[0] = 100;
		scores[1] = 40;
		scores[2] = 80;
		scores[3] = 60;
		scores[4] = 70;

		/*
		 * System.out.println(scores[0]); System.out.println(scores[1]);
		 * System.out.println(scores[2]); for(데이터타입 인덱스이름: 인덱스이름 < 배열개수; i++) { //++i
		 * System.out.println(배열이름[인덱스이름]);
		 */
		// 배열은 0번부터 시작
		int total = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i);

			// 합계 구하기

			System.out.println("배열을 이용해서 합계를 구합니다.   ");
			System.out.println(total);
		}
	}

}
