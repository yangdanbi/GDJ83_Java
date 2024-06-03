package com.winter.s1.lang;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		StringBuffer sb = new StringBuffer();
		// import 생략 :
		// 1. 같은 패키지내의 클래스를 사용할 때
		// 2. java.lang 내의 클래스를 사용할때
		Object obj = new Object();
		Object obj2 = new Object();
		String n = new String("winter");
		String n2 = "winter";
		// obj 주소가 나옴
		// n 입력한 데이터
		// 참조변수를 찍으면 클래스에서 상속받은 toSting 자동 호출
		System.out.println(n == n2);// true
		System.out.println(obj == obj2);// false
		// 클래스 내엔 변수 메서드

		// static 없음 멤버
		// 참조변수명.멤버들
		// charAt 문자열에서 원하는 index 한글자를 빼내오는/ 한글자라 char타입
		char a = n.charAt(1);
		System.out.println(a);

		int i = n.length();
		System.out.println(i);
		System.out.println("문자열 입력");

		n = sc.next();
		for (int j = 0; j < n.length(); j++) {

//			System.out.println(n.charAt(j));
		}
		System.out.println(n.length() * 1000 + "원 입니다.");

		System.out.println();

	}

}
