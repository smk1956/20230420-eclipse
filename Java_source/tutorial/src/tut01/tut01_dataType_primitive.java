/*
1. 자료형(Data Type) : 정수, 실수, 문자(열) 각각에 맞게 저장
* 컴퓨터는 0, 1로만 구성 : 1bit < 1byte(8bit) : 저장공간
 - Primitive Type : 첫글자 소문자
 	- 정수형 : 실수가 아닌 것
 	 -byte(1) : 데이터 전송
 	 - short(2)
 	 - int(4byte = 32bit)
 	 - long(8)
 	 
 	- 실수형 : 소수점이 있는 것
 	 - float(4) : 소수점 자리수가 7자리 이상이면 오차 발생 - gps
 	 - double(8) : 소수점 자리수가 15자리 이상이면 오차 발생
 	 
 	- 문자형(형) : 문자 작은따옴표(''), 문자형 큰 따옴표("")
 	 - char(2) 'A', 'B'			한글자
 	 
 	- 논리형 : boolean(1 => true, false)
 	*** int(정수형), double
 - Reference Type : 첫글자 대문자, 객체, 배열
*/
package tut01;

public class tut01_dataType_primitive {

	public static void main(String[] args) {
		//정수를 저장 : 저장할 이름은 num, 저장할 값은 100 정수형이니깐 int
		// 데이터타입 변수명 = 값;
		int i; //stack 메모리에 i라는 저장 공간이 할당이 되는데 공간 크기는 4byte로 설정
		i = 100; // 메모리 i 공간에 값을 저장
		int num = 100;
		
		//실수를 저장 : 저장할 이름은 d, 저장할 값은 10.0 실수니깐 double
		// 데이터타입 변수명 = 값;
		double d; //stack에 8바이트 공간을 설정
		d = 10.0;
		double d2 = 10.0;
		
		//문자(열) 처리 : String
		char c;
		c = 'A';
		char ch = 65;
		
		//boolean 참, 거짓 : 무한 반복 또는 flag 참또는 거짓중 하나만 표시해야 할 때
		boolean b;
		b = false;
		
		//문자열
		String s;
		s = "abcdfa123456123";
		
		
		
		//int date = 10; //사람이 사용하는 숫자는 10진수
		//2진수 컴퓨터가 사용하는 숫자는 2진수
		//System.out.println(Integer.toBinaryString(date)); //binary = 2진수
		
		//8진수        2진수가 너무 길어서 3자리씩 줄인 것
		//System.out.println(Integer.toOctalString(date));
		
		//16진수로 바꾸기 2진수가 너무 길어서 4자리씩 줄인 것
		
		
		
		
		
	}

}


















