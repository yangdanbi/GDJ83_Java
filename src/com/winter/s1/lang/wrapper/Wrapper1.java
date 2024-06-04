package com.winter.s1.lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// 클래스
		// int long,,,,
		// 변수명이 대문자면 상수

		// static 필드 클래스메서드 : 클래스명.변수명/ 객체안만들어도됨 그래서 생성자x
		//
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Double.BYTES);
		System.out.println(Double.SIZE);
		System.out.println(Double.TYPE);
		System.out.println(Double.MIN_VALUE);

		Integer i = new Integer("10");

		int num = 10;

		i = new Integer(num);

		System.out.println();
		// 문자열을 해당 타입으로 변환
		int n = Integer.parseInt("10");
		Double.parseDouble("3.12");

		// wrapper
		num = 10;
		// 레퍼런스 참조변수
		// auto boxing
		// 같은 타입의 박스로 감싼다
		Integer n1 = num;
		// auto unboxing
		// 레퍼런스타입을 프리타입
		num = n1;

		Double d1 = 3.12;
		// int,integer만 사용할 수 있음 굳이 더블을 넣을거면 형변환
		n1 = (int) 3.12;

		System.out.println(n1);

		// primitive
		// int,char를 제외하곤 앞글자 대문자로 변경
		// byte short int-Integer long
		// float double
		// boolean
		// char-Character

	}

}
