package com.winter.study3;

import java.util.Random;

public class StudyReturn {
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){}

	public Test t5(Test t) {// 쉼표로 매개변수 여러개 줄수있음 Test 클래스의 데이터 타입을 가지는 t라는 매개변수 받는..

		System.out.println(t.level);// 1
		t.level = 200;
		t = new Test();
		t.level = 500;
		// 500을 보여주려면 리턴해야함

		return t;

	}

	// 매개변수 선언
	public void t4(int sal) {
		// 프리랜서 월급을 받아서 3.3 % 제외한 실수령액 계산하기
		// 실수령액=월급-월급*0.033
		double result = sal - sal * 0.033;// 자동형변환

		System.out.println(result);

		sal = 100;

	}

	// 리턴타입의 제한은 없음
	public int t1() {
		int num = 3;
		if (num % 2 == 0) {
			return 0;
		}
		int num2 = 6;
		int result = num * num2;

		// 리턴의 데이터 갯수는 딱 하나만 가능
//		return num,num2;

		return result;
	}

	public void t2() {
		Random rendom = new Random();
		// 0이상 10미만의 정수 하나를 랜덤하게 리턴
		int num = rendom.nextInt(10);
		if (num % 2 == 0) {
			return;// 조건문 종료의미로 쓰면 void여도 쓸 수 있음
		} else {
			System.out.println(num);
		}

	}

}
