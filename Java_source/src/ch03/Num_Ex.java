package ch03;

public class Num_Ex {

	public static void main(String[] args) {
		int i1 = 1_000_000;
		int i2 = 2_000_000;
		// int : 4byte = 대략 10억
		int result = i1 * i2;
		System.out.println((long) result);
	}
}
