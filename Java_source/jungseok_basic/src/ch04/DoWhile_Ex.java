package ch04;

public class DoWhile_Ex {

	public static void main(String[] args) {
		// while
//		int i = 0;
//		while (i < 0) {
//			System.out.println(i);
//			i++;
//		}
//
		// do ~ while
//		int j = 0;
//		do {
//			System.out.println(j);
//			++j;
//		} while (j < 0);
//	
//		for(int i = 0; i < 배열명.length; ++i) {
//			배열명[i].disp()
//		}

		int[] arr = new int[] { 1, 2, 3 }; // 3 length

		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
