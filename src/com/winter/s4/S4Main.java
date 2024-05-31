package com.winter.s4;

public class S4Main {

	public static void main(String[] args) {
		// 하이마트
		// tv : 브랜드, 사이즈, 가격, 포인트
		// computer : 브랜드, 가격, cpu, 포인트
		// phone : 브랜드, 가겨그 칼라, 포인트

		Tv tv = new Tv();
		tv.brand = "Samsung";
		tv.price = 500;
		tv.point = 50;
		tv.size = 100;

		Computer computer = new Computer();
		computer.brand = "Apple";
		computer.price = 300;
		computer.point = 30;
		computer.cpu = "M3";

		Phone phone = new Phone();
		phone.brand = "LG";
		phone.price = 150;
		phone.point = 15;
		phone.color = "Pink";

		// 손님
		Customer coustomer = new Customer();
		coustomer.don = 1000;
		coustomer.point = 0;

		coustomer.buy(computer);

	}

}
