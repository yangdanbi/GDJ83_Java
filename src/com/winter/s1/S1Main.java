package com.winter.s1;

import com.winter.s2.Korea;

//import com.winter.s2.Member;

public class S1Main {

	public static void main(String[] args) {
		Test test = new Test();
		test.num = 10;
//		test.name = "aa";// 같은 패키지라도 클래스가 달라서 name 은 사용불가

		Korea korea = new Korea();
		korea.setPop(20);
		// 꺼내씀
		int p = korea.getPop();
		System.out.println(p);

//		korea.pop = 1;
//		Member member = new Member();
//		Member mem = new Member();
		// s2
//		member.name = "test";
		// member.age = 20;
//		korea.name = "";

	}

}
