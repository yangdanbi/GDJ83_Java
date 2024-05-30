package com.winter.study3.ex3;

public class Car {
	String color;
	String brand;
	String company;

	// 참조변수(객체의 주소를 담고있는 변수) this : 자기자신의 객체의 주소를 담고있다.
	// 객체 생성기 값이 대입되는 변수
	// 각각의 객체 내에서만 사용가능
	// this 는 생략가능

	// Car car
	public void info() { // 자동차 색을 찍고싶음 멤버변수를 찾아가려면 객체가 있는 주소를 알아야하니까
		// Car타입인 매개변수/지역변수 주소를 담는 참조변수 car
		System.out.println("info 메서드");
		System.out.println("this : " + this);
		System.out.println(this.color);
		System.out.println(brand);
		this.go();
		// this 객체 내에서만 가능
//		System.out.println(car.color);
		this.go();
	}

	public void go() {
		System.out.println(this.company);
	}

}
