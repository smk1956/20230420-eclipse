package tut02_Datatype;

public class DataTypes2 {
	
	public static void main(String[] args) {
		//컴퓨터는 0, 1만 읽을 수 있다.
		//영어는 1글자는 1byte -> 8bit -> 00000000(8자리)
		//00000000(2) -> b -> 0b,0x
		//00 000 000(8)
		//0000 0000(16) : 0123456789 A B C D E F
		//0x1    1 -> x -> hexa(16진수)		//4자리를 1로
		
		//예)
//		int num = 0b101;
//		System.out.println(num);
//		
//		int num2 = 0x7E; //16진수
//		System.out.println(num2);
		
		//부동소수점 : 가수부 * 지수부 = 1.XX * 2(n)
		//e 지수표기법 : e10 = 10은 제곱근
		double d = 12e11; //
		System.out.println(d);
	}
}
