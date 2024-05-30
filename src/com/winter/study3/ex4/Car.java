package com.winter.study3.ex4;

public class Car {
	String color = "white";
	String brand;
	String company;
	int price = 1000;
//1번 실행 잘안씀
	// 생성자 : 객체 생성시 딱 한번 호출되는 특수한 메서드
	{
		// 2번 실행 잘안씀
		// 인스턴스 초기화 블럭
		price = 200;
	}

	// 3번 실행
	public Car() {
		// 기본 생성자
		System.out.println("자동차가 만들어집니다.");// 생성자라 먼저 실행됨
		this.color = "black"; // 덮어 씀
		this.brand = "k3";
		this.company = "Kia";
		this.price = 2500;
		this.info();
		// this()자기 자신의 또 다른 생성자를 호출
		// this() 생성자 내에서 제일 첫줄에 위치
//				this(2500);

	}

	// 생성자 오버로딩.
	// 메서드 안에 변수라 지역변수
	// 힙에 생성
	public Car(int price) {
//		this(price, "black");

		// 멤버변수
		// 지역변수=지역변수
		this.price = price; // 멤버변수 =지역변수
		this.color = "black"; // 덮어 씀
		this.brand = "k3";
		this.company = "Kia";
	}

	public Car(int price, String color) {
		this.price = price;
		this.color = color;
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}

	// Car car
	public void info() { // 자동차 색을 찍고싶음 멤버변수를 찾아가려면 객체가 있는 주소를 알아야하니까
		// Car타입인 매개변수/지역변수 주소를 담는 참조변수 car
		System.out.println("info 메서드");
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
//		this.Car(); new를 만나야해서 이건 사용 못함
		// this 객체 내에서만 가능
	}

}
