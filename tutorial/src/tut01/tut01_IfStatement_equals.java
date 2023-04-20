package tut01;

public class tut01_IfStatement_equals {

	public static void main(String[] args) {
		//문자열 변환
		//대소문자 구분 없이 비교
		
		String sysPwd = "abcdef";
		String priPwd = "ABCDEF";
		
		if(sysPwd.equalsIgnoreCase(priPwd))
			System.out.println("성공");
		else
			System.out.println("실패");
		
		System.out.println(sysPwd.equalsIgnoreCase(priPwd) ? "성공" : "실패");
		
		
		System.out.println(sysPwd.toUpperCase());
		System.out.println(priPwd.toLowerCase());
		
		
		System.out.println("------------------------------------------------");
		
		//문자열 비교 : equals
		//메모리 주소를 비교 : ==
		String s1 ="abc";
		String s2 = new String("abc"); //객체 생성할 때
		
		if(s1.equals(s2))
			System.out.println("값이 일치 합니다.");
		if(s1 == s2)
			System.out.println("메모리 주소(저장위치)가 일치합니다.");
		else
			System.out.println("메모리 주소(저장위치)는 일치하지 않습니다.");
		
		// !(반전)
		boolean b = true;
		if( b )
			System.out.println(!b);
		
		System.out.println("------------------------------------------------");
		
		int grade = 80;
		int point = 80;
		
		if(grade >=90 && point >= 80)
			System.out.println("골드");
		else
			System.out.println("실버");
		
		if(grade >=90 || point >= 80)
			System.out.println("골드");
		else
			System.out.println("실버");
		
		if(grade < 80)
			System.out.println("이 내용은 화면에 표시 되지 않습니다");
		
		
		//논리연산자
		// &&(모두 참일 때 참), ||[파이프](하나만 참일 때도 참)
		//등급이 90이상이면서 포인트가 80이상이면 골드 : 이면서, 이고 -&&
		
		//등급이 90이상이거나 포인트가 80이상이면 골드 :이거나, 또는 - ||
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
