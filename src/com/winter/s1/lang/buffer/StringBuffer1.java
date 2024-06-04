package com.winter.s1.lang.buffer;

public class StringBuffer1 {
	public static void main(String[] args) {
		// 문지열을 더하고 싶을때
		// 두개는 쓰는법과 결과가 똑같은데 buffer가 더 쓰레드에 안전
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		sb2.append(false);
		// 더하면 새로운 객체가 생김
		// winter + iu
		sb.append("winter");
		sb.append("iu");
		sb.append(10);

		// 타입이 다르니
		String result = sb.toString();

		System.out.println(sb); // winteriu10
		System.out.println(result); // winteriu10

	}

}
