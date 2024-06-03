package com.winter.s1.lang;

public class S5Main {

	public static void main(String[] args) {
		String name = "   win            ter ";
		System.out.println(name);
		System.out.println(name.length());
//		name = name.trim();// 공백제거
		name = name.strip();// 앞에 있는 공백제거
		System.out.println(name);
		System.out.println(name.length());
		name = name.replace(" ", ""); // " "을 ""로 바꾸기-공백없애기
		System.out.println(name);
		System.out.println(name.length());

		name = "winter-24-서울";
		// 파싱한다
		name = name.replace("*", "-");
		String[] datas = name.split("-");

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		// static 쓰는법
		String s = String.valueOf(10.2 + "");
		System.out.println(s);
	}

}
