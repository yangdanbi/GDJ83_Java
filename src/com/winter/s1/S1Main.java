package com.winter.s1;

public class S1Main {

	public static void main(String[] args) {
		StackStudy stack = new StackStudy();
		QueStudy que = new QueStudy();

		int[] ar = { 1, 2, 3, 4 };

		ar = stack.add(ar);

		System.out.println("add 메서드");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		ar = que.remove(ar);
		System.out.println("remove 메서드");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
//		Object obj = ,new Object();
//		Test test = new Test();
//		String str = test.toString();
//
//		System.out.println(str);
//		System.out.println(test.toString());
//
//		// 클래스변수 사용법
//		// 클래스명.변수
//		System.out.println(String.CASE_INSENSITIVE_ORDER);
////		obj.toString();
//
//		// 같음
//		String n = new String("winter");
//		String name = "winter";
//		System.out.println(name.toString());// 주소가 아니라 값이 나옴
	}

}
