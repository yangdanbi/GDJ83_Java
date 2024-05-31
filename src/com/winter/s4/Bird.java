package com.winter.s4;

public abstract class Bird {
	// 추상 클래스 미완성의 클래스 이 클래스를 상속받아서 사용해라
	// abstract: 미완성 나중에 수정해야함을 의미
	int age;

	// 미완성의 메서드
	// 상속 받아서 사용해라
	// 추상 메서드
	public abstract void fly();

}
// 그외 지정자
// static: 변수, 메서드 앞에 붙음 클래스명.메서드명/변수명
// fianl : 변경x 클래스 변수 메서드 앞에 붙음
// avstract : 변경해라 클래스 메서드 앞에 붙음

//static final 은 둘이 같이 쓰는 경우가 많음 (변수명 대문자)
//공유하는 데이터인데 함부러 바꾸지 못하도록 막는 용도

//접근 지정자
//public protected defalut private
