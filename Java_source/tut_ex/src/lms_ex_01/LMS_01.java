package lms_ex_01;
/*
 	프로그램명 : 학사행정관리시스템 - 성적관리
 	작성자 : 이근호
 	작성일자 : 2023. 04. 21
 	내용 : 기본타입 변수, 조건물을 활용한 프로그램 작성
 	
 	primitive type : 소문자로 시작하는 자료형은 무조건
 	reference type : 그 외는 전부 객체
 	
 	-정수형은 int, 실수형은 double, true(false), boolean
 	-정수형 : byte, char(문자를 숫자로 인식), short, int
 	-실수형 : float, double
 	-boolean : true false
 	
 	예시)
 	int kor = 0;
 	double total = 0.0;
 	boolean b = false;
*/
	



public class LMS_01 {

	public static void main(StringEx[] args) {
		/*
			1. 국어, 영어, 수학 점수를 입력 받아 총점 및 평균을 산출하시오.
				-변수 이름은 kor, eng, math, total. avg
				-국어, 영어 ,수학, 총점은 정수, 평균은 실수가 출력 되도록 하시오.
				- 조건으로 T를 입력하면 총점, A를 입력하면 평균이 산출 되도록 하시오.
				- 조건은 char 타입 또는 String을 이용하시오.
		 
		 		** 프로그래밍의 변수 또는 객체는 꼭 초기화 작업을 하고 사용
		 			- 메모리를 비우고 초기 값을 설정하고 사용
		 			- 초기 값을 뭐를 입력해야 되는지 ???
		 			객체는 null 그외 기본 타입은 상황에 맞게
		 */
		
		int kor, eng, math ,total;
		double avg;
		
		kor = 77;
		eng = 88;
		math = 99;
		
		total = 0;
		avg = 0.0;
		
		char sel = 'T'; // = String sel = "T";
		
		//정수 또는 실수 같은 숫자는 같다를 ==
		//같지 않다는 !=
		//문자(String)의 값이 같다는 equals
		// A = B;		B를 A에 집어 넣어라
		if(sel == 'T') {
			//총점
			//글자와 숫자를 연결(붙일 때는) +
			//숫자 + 숫자 = 합
			total = kor +eng + math;
			System.out.println("총점 : " +total + "점");
		}else {
			//평균
			avg = (kor + eng + math) / 3;
			System.out.println("평균 : " + avg + "점");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
