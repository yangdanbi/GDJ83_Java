package com.winter.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudt2 {

	public static void main(String[] args) {
		// 하나의데이터를 여러개로 나누는것 파싱
		// 파싱의결과물 토큰
		String name = "a-b-c";
		// 자를 기준이 없을때
		StringTokenizer st = new StringTokenizer(name);

		while (st.hasMoreTokens()) {
			// 삭제할 것을 다시 정의할 수 있음
			System.out.println(st.nextToken("-"));

		}
	}

}
