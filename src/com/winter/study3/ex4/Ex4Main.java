package com.winter.study3.ex4;

public class Ex4Main {

	public static void main(String[] args) {
		// 클래스명과 동일
		Car car = new Car();// 클래스명 변수 = new 생성자호출

		car.info(); // 변수.메서드();// 이게 실행돼서 같은 위랑 출력나옴

		Car car2 = new Car(200);// 매개변수가 1개인 생성자만 실행된것
		car2.info();
//
//		Bike bilk = new Bike("", 4);
	}

}
