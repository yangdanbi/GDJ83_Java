package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력 : ");
		// 991225-1234567
		String jumin = sc.next();
		// 1. 성별을 검증
		char ch = jumin.charAt(7);
		if (ch % 2 == 0) {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}

		// 1. 성별을 검증
		// int idx = jumin.indexOf("-");
//		String result = jumin.substring(7, 8);// 성별뽑기
//
//		if (result.equals("1") || result.equals("3")) {
//			System.out.println("남성입니다.");
//		} else if (result.equals("2") || result.equals("4")) {
//			System.out.println("여성입니다.");
//		} else {
//			System.out.println("올바른 주민번호를 입력해주세요");
//		}
//		System.out.println(result);

		// 2. 나이계산
		// 2024-출생년도
//		String result = jumin.substring(0, 2);
		String y = jumin.substring(0, 2);

		int r = 1900;
		if (ch == '3' || ch == '4') {
			r = 2000;
		}
		int ye = r + Integer.parseInt(y);
		System.out.println(2024 - ye);
//		int n = Integer.parseInt(result);
//		int year = 2024 - n;
		// System.out.println(age);

//		String age2 = Integer.toString(year).substring(2);
//		System.out.println("나이는 " + age2 + "세 입니다.");
		// System.out.println(2024 - n);

		// 3. 주민번호 유효성 검증
		// 9 5 1 2 2 6 - 1 2 3 4 5 6 7(검증용 숫자)

		// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5
		// 18 15 4 10 12 42 8 18 6 12 20 30
		// 122
		// 총합을 11로 나눈 나머지를 구하기
		// 122%11 --1
		// 나머지를 11로 뺀 결과값을 검증용 숫자랑 같은지 비교
		// 11-1 => 10
		// 11로 뺀 결과값이 2자리수 라면
		// 뺀 결과값을 10으로 나눈 나머리를 검증용 숫자랑 비교
//		18 24 0 15 0 14    16 9 18 6 12  5 
		// int형으로 변환
		// num1 은 주민번호
		int[] gop = { 2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5 };
		int total = 0;
		int oth = 0;
		for (int i = 0; i < jumin.length() - 1; i++) {
			if (i == 6) {
				continue;
			}
			char juminch = jumin.charAt(i);
			String str = String.valueOf(juminch);

			int juminnum = Integer.parseInt(str + "");// char+문자는 문자
			total = total + juminnum * gop[i];

			int num = 11 - total % 11;

			if (num == jumin.length()) {

			}

//			System.out.println("곱: " + juminnum * gop[i]);// 문자열로 계산됨
//			System.out.println("입력값 : " + juminnum);

//			if(total % 11==jumin.length()) {
//				
//			}
		}

//		if()
//		System.out.println("total : " + total);

//		String a = jumin.replace("-", 0);
//		int[] ar = new int[Integer.parseInt(jumin)];
//		int tot = 0;
//
//		for (int i = 0; i < 13; i++) {
//
//			tot += gop[i] * Integer.parseInt(jumin.substring(i, 1));
//		}
		// System.out.println(tot);
//		System.out.println();

	}

}
