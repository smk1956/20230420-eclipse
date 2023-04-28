package ch05;

public class ArrayDefinition_Ex {

	public static void main(String[] args) {
		// 배열 : 고정(배열명.length) = 동적(배열명.size())
		// int[] ArrayList<Integer> : 순서가 있다
		// HashMap "userid" : "koreait"

		// 배열 : 고정(배열명.length)
		// 1. 배열크기 지정
//		int x = 5;
//		double[] d = new double[5];
//		d[0] = 0.0;
//		d[1] = 0.1;
//		d[2] = 0.2;
//		d[3] = 0.3;
//		d[4] = 0.4;
//		for (int i = 0; i < d.length; ++i) {
//			System.out.println(d[i]);
//		}
//		for (double dbi : d) {
//			System.out.println(dbi);
//		}

		// 2. 배열크기를 지정 + 초기화
		String[] str = new String[] { "Seoul", "Busan", "Deagu" };
		for (int i = 0; i < str.length; ++i) {
			System.out.println(str[i]);
		}
		for (String st : str) {
			System.out.println(st);
		}
	}
}
