package extendsTest;

import java.util.Scanner;

public class EnrollMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner st = new Scanner(System.in);

		System.out.println("Speaker 등록 메인 메뉴입니다. 단 2명만 등록할 수 있습니다.");
		System.out.println("어떤 Speaker를 등록하는 지 선택하세요.");
		System.out.println("1. Reader 등록");
		System.out.println("2. Worker 등록");
		int Speaker = sc.nextInt();

		System.out.println("이름을 입력하세요");
		String name = st.nextLine();

		System.out.println("어떤 Speaker를 등록하는 지 선택하세요.");
		System.out.println("1. Reader 등록");
		System.out.println("2. Worker 등록");
		int Speaker2 = sc.nextInt();

		System.out.println("이름을 입력하세요");
		String name2 = st.nextLine();

		System.out.println("두 명 Speaker의 등록이 완료되었습니다. 이제 Speaker들의 speak 실행");
		System.out.println("결과입니다.");

		if (Speaker == 1) {
			Reader r = new Reader(name);
			System.out.println(r.speak());
		} else {
			Worker w = new Worker(name);
			System.out.println(w.speak());
		}

		if (Speaker2 == 1) {
			Reader r = new Reader(name2);
			System.out.println(r.speak());
		} else {
			Worker w = new Worker(name2);
			System.out.println(w.speak());
		}
	}

}
