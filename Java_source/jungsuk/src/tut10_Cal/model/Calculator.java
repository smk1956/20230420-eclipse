package tut10_Cal.model;

public class Calculator {
		//사칙연산 작업을 할 객체 생성 준비
		//동작메소드이름() : add(), sub(), mul(), div(0
		//더하거나 빼거나 곱하거나 나눌 매개변수에 따라 오버로딩을 진행
		
		//접근제한자 리턴타입 메소드이름(매개변수1, 매개변수2){
			//return -> 리턴타입이 void일 때는 없어도 된다. = 무슨 동작 할건지??
		//}
		//public : 다같이사용(다른페이지에서도 사용가능)
		String title = "코리아아이티";
		public void disp(String title) { //void 없다 = return이 없다.!
			System.out.println("===== " + title +" 계산기 =====");
		}
		
		public int add(int num1, int num2) {
			
			return num1 + num2;
		}
		
		public int add(int num1, int num2, int num3) { //메소드 오버로딩
			
			return num1 + num2 + num3;
		}
		
		public int sub(int num1, int num2) {
			
			return num1 - num2;
		}
		//곱하기 : 리턴타입 정수 3개 곱하기 메소드
			//main메소드에서 실행해 보기
		public int mul(int num1, int num2, int num3) {
			
			return num1 * num2 * num3;
		}
		//나누기 : 리턴타입 실수 2개 나누기 메소드
			//main메소드에서 실행해 보기
		public int div(int num1, int num2) {
			
			return num1 / num2;
		}
		
		
		
		//private : 혼자사용(여기페이지에서만 사용가능)
		
		
	}

