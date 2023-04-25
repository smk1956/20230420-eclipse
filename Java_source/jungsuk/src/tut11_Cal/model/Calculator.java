package tut11_Cal.model;

public class Calculator {
	// 1. 필드
	// 정수 2개 저장하는 필드(변수)
	// 캡슐화 작업에서 필드는 무조건 private으로 선언
	private int num1; // 숫자1
	private int num2; // 숫자2
	private String userid;

	// 2. 생성자(생략 가능)

	// 3. getter, setter : 필드가 있어야 getter, setter 생성
	// 마우스 우클릭 -> source -> Generated Getter, Setter -> Select all -> Generate
	public int getNum1() { // num1 값을 사용할 때
		return num1;
	}

	public void setNum1(int num1) { // num1 변수에 값을 지정할 때
		if (num1 < 1000) {
			this.num1 = 10000;
			System.out.println("포인트 값이 잘못 입력 되었습니다.\n회원가입 포인트 기본값 10000으로 초기화 합니다.");
		} else {
			this.num1 = num1;
		}
	}

	public int getNum2() { // num2 값을 사용할 때
		return num2;
	}

	public void setNum2(int num2) { // num2 변수에 값을 지정할 때
		if (num2 < 1) {
			// 현재 페이지에 있는 필드에 값을 저장
			// 잘못된 값이 들어오면 무조건 1을 곱해주기
			System.out.println("음수는 사용할 수 없습니다.\n1을 곱합니다.");
			this.num2 = 1;
		} else {
			// 정상적인 숫자가 들어오면 그대로 저장
			this.num2 = num2;
		}
	}

	public String getUserid(String userid) {
		this.setUserid(userid);
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	// 4. method(생략 가능)

}
