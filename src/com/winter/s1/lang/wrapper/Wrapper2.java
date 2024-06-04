package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비번 길이는 최소 6글자 이상
		// 대소문자, 숫자 1개 이상이 있어야함
		Scanner sc = new Scanner(System.in);
		System.out.println("pw를 입력하세요 : ");
		String pw = sc.next();
		System.out.println(pw);

//		boolean flag = true;
		String result = "대문자를 포함해야함";

		// String idx = pw.substring(0);
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) {
				result = "통과";
//				flag = false;
				break;
			}
//			flag = Character.isUpperCase(ch);
			// System.out.println(ch);
		}
		System.out.println(result);
//		if (flag) {
//			System.out.println("대문자가 포함되었습니다.");
//		} else {
//			System.out.println("대문자를 포함해야 합니다.");
//		}

	}

}
