package com.winter.study3.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Red";
		car.brand = "카니발";
		car.company = "현대";

		Car car2 = new Car();
		car2.color = "Black";
		car2.brand = "A7";
		car2.company = "Audi";
//
//		System.out.println("car : " + car);// 객체를 가르키는 주소
//		car.info();
//
//		System.out.println("car2 : " + car2);// 객체를 가르키는 주소
//		car2.info();

		Cal cal = new Cal();
		cal.hap(10L, 20);

	}

}
