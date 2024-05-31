package com.winter.s4;

public class Car {
	// 변수선언
	// 접근지정자 {그외지정자} 데이터타입 변수명;
	// 자바 메모리 영역은 3개 (스택, 힙, 메서드 스태틱영역)
	// 스택이 영역을 먼저 차지(메인메서드가 올라가면서 실행되니까), 힙(만들어질수도 있고 아닐수도 있고)
	// 스택 지역변수 {} 끝나면 사라짐 제일 빨리 사라짐
	// 힙 인스턴스변수 멤버변수 객체가 new로 만들어질때 만들어지다가 참조변수가 있을때까지 사용
	// 메서드 영역 프로그램이 실행할때 만들어져서 종료될때까지 살아있음 변수중에 제일 오래 살아남
	public static final String COMPANY = "";

	// 멤버변수 선언
	// 힙 영역
	// static final 둘이 같이 많이 씀
	// final 이 붙은 변수는 구분하기 위해 대문자로 표기
	public int PRICE;
//	{
//		this.price = 30;
//	}

	// 생성자로 초기화
	public Car() {
//		this.price = 30;
	}

	// 메서드 영역에 만들어짐

	// static메서드
	public static void info() {
		System.out.println(Car.COMPANY);
		// this 에러 - 객체의주소를 담고있기 때문에
		// 힙에 price 객체가 만들어져있지 않기 때문에 this에러
//		System.out.println(this.price);
		System.out.println("static method");
		// 객체가 만들어져야 info2쓸수있는데 안만들어져서 또 에러
//		this.info2();
	}

//프로그램이 만들어지자마자 static메서드가 만들어지니까 사용가능
	// final은 변경하지 마라 라는 의미
	public final void info2() {
		Car.info();
		System.out.println(Car.COMPANY);
		// 지역변수 final 변할 수 없음 상수값으로 변함
		final int num = 30;
		// num = 20;

	}

}
