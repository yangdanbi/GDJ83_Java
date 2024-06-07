package com.winter.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "winter,25, iu,30, hani,29, 철수,18, 영희,20";

		// ,를 기준으로 자르기
		// 기본생성자가 없어서 객채를 만들어주면서 사용해야함
		StringTokenizer st = new StringTokenizer(names, ",");
		// 멤버메서드= 참조변수명.메서드명
		System.out.println(st.countTokens());

		// 토큰이 더 있냐. 토큰이 없을때까지돌기 winter 부터 시작
		while (st.hasMoreTokens()) {
			// 다음 토큰을 줘라
			String name = st.nextToken();
			String age = st.nextToken();

			// 출력
			System.out.println(name.trim()); // trim으로 공백제거
			System.out.println(age);
		}
		System.out.println("==========");
		// hasMoreTokens 더음 쉼표가 있는지 보기만 할뿐 아직 문자열에 있음
		// next 를 통해 쉼표로 이동하는것

		String[] n = names.split(",");

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i].trim());
		}
	}

}
