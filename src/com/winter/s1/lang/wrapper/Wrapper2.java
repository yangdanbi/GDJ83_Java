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
		// String result = "최소 1 이상의 대문자를 포함해야함";
		int upper = 0;
		int lower = 0;
		int digit = 0;

		// String idx = pw.substring(0);
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);// 한글자꺼내옴
			if (Character.isUpperCase(ch)) {// 대문자인지 판별
				upper++;
//				result = "통과";
//				flag = false;
//				break;
			} else if (Character.isLowerCase(ch)) {// 소문자냐
				lower++;
			} else if (Character.isDigit(ch)) {// 숫자냐
				digit++;
			}
//			flag = Character.isUpperCase(ch);
			// System.out.println(ch);
		} // for 끝
		if (upper > 0 && lower > 0 && digit > 0) {
			System.out.println("대/소문자,숫자 확인");
		} else {
			System.out.println("실패");
		}
		// System.out.println(result);
//		if (flag) {
//			System.out.println("대문자가 포함되었습니다.");
//		} else {
//			System.out.println("대문자를 포함해야 합니다.");
//		}

	}

}
