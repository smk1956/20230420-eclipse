package lms_ex_01;

/*
	switch(조건) ~ case ~ break ~ (default); = if ~ else
	: 조건 - 등호(==, >=, <=) 부등호를 쓸 수 없음
 */

public class LMS_01_switch {
	public static void main(StringEx[] args) {
		// T면 총점, A면 평균, 그 외에는 시스템 종료 (system.exit(0);)

		char sel = '0';
		int i = 1;
		// : 뒤에 계속 코드 나옴
		// ; 코드 끝에 나옴
		switch (i) {
		case 1:
			System.out.println("총점이 출력됩니다.");
			break;

		case 2:
			System.out.println("평균이 출력됩니다.");
			break;

		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}

	}

}
