package com.winter.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 특정한 구간 문자 뽑아내기
		String name = "computer Science";

		String result = name.substring(3);// puter Science

		result = name.substring(3, 5);// pu 3번부터 시작, 5번안에 있는 문자를 뽑기
		System.out.println(result);
		// 확장자만 분리
		// jpg, png, gif, jpeg, jiff
		System.out.println("파일명을 입력하세요 확장자 포함");
		String file = sc.next(); // abc.pdf
		int idx = file.lastIndexOf(".");
		result = file.substring(idx + 1);
//		int result2 = file.indexOf('.');// .뒤에 자리 찾기
//		result = file.substring(result2);
		System.out.println(result);
//		String[] files = { "jpg", "png", "gif", "jpeg", "jiff" };
//		for (int i = 0; i < files.length; i++) {
//
//		}

//		name.equals(name2)
		if (result.equals("jpg") || result.equals("png") || result.equals("gif") || result.equals("jpeg")
				|| result.equals("jiff")) {
			System.out.println(result + "은 사진파일입니다.");
		} else {
			System.out.println(result + "은 사진파일이 아닙니다.");
		}

	}

}
