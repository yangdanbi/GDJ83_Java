package com.winter.s4;

public class S4Main {

	// 메인이 static인 이유 : 객체 생성없이 메인을 실행하려고
	public static void main(String[] args) {

		// 객체를 만들지 않고 사용
		// static으로 선언된 건
		// 클래스명.변수명 으로 사용
		// Car.company = "aa";
		// System.out.println(Car.company);

		// 주소를 모르니까
		Car.info();
		// 공통적으로 들어가는 것들은 static으로 사용하면 좋음

		System.out.println(Math.E);

		double b = Math.abs(1.2);
		System.out.println(b);
	}

}
