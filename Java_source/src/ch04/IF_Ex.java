package ch04;

import java.util.Scanner;

public class IF_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";

		System.out.print("점수(정수)를 입력하세요 : ");
		score = sc.nextInt();

//		if (score >= 90)
//			grade = "A+";
//		else if (score >= 80)
//			grade = "B+";
//		else if (score >= 70)
//			grade = "C+";
//		else
//			grade = "F";
//
//		System.out.println("성적은 " + grade + " 등급입니다.");

		// 90이상인 점수중 95이상이면 A+ 90점이상이면 A
		// 80이상인 점수중 85이상이면 B+ 90점이상이면 B
		// 70이상인 점수중 75이상이면 C+ 90점이상이면 C
		// 나머지는 F

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else if (score >= 90) {
				grade = "A";
			}

		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else if (score >= 80) {
				grade = "B";
			}

		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else if (score >= 70) {
				grade = "C";
			}

		} else {
			grade = "F";
		}
		System.out.println("성적은 " + grade + " 등급입니다.");
	}
}
