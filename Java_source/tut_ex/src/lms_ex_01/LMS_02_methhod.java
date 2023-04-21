package lms_ex_01;

public class LMS_02_methhod {
	public static void main(StringEx[] args) {
		int kor, eng, math, total;
		double avg;

		kor = 77;
		eng = 88;
		math = 99;

		total = 0;
		avg = 0.0;

		char sel = 'T';

		if (sel == 'T') {
			disp();
			total = add(kor, eng, math);
			System.out.println("총점 : " + total + "점");
		} else {
			disp();
			avg = add(kor, eng, math) / 3;
			System.out.println("평균 : " + avg + "점");
		}

	}

	// 화면출력 메소드
	public static void disp() {
		System.out.println("============= KOREA IT 성적관리시스템 ===============");
	}

	// kor + eng;
	// 객체지향 : 오버로딩(이름은 같지만 타입이나 매개변수를 다르게 해서 표현하는 것)
	// 생성자 오버로딩
	// overloading
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;

	}

	// 기업 타이틀 메소드로 구현하기 : 반복 작업 또는 유지 보수를 편하게 하기 위해서
	// 접근제한다 static void 메소드이름() {내용} : 화면에 출력하는 결과가 sysout
	// 접근제한다 static int 메소드이름() { return 내용} : 화면에 출력 결과가 정수면
	// 접근제한다 static double 메소드이름() { return 내용} : 화면에 출력 결과가 실수면
	// 접근제한다 static String 메소드이름() { return 내용} : 화면에 출력 결과가 문자열이면

}
