package com.winter.study3.ex4;

public class Car {
	String color;
	String brand;
	String company;
	int price;

	// 생성자 : 객체 생성시 딱 한번 호출되는 특수한 메서드
	// 생략가능

	// Car car
	public void info() { // 자동차 색을 찍고싶음 멤버변수를 찾아가려면 객체가 있는 주소를 알아야하니까
		// Car타입인 매개변수/지역변수 주소를 담는 참조변수 car
		System.out.println("info 메서드");
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
		// this 객체 내에서만 가능
	}

}
