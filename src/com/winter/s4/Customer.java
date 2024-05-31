package com.winter.s4;

public class Customer {
	int don;
	int point;

	public void buy(Product t) {
		// 매개변수로 물건의 가격,물건의 포인트 받아와야함
		// 물건 값 계산
		// 가진 돈- 물건의 값
		// 가진 포인트 + 물건의 포인트
		this.don = this.don - t.price;
		this.point = this.point + t.point;

		System.out.println(don);
		System.out.println(point);
	}

}
