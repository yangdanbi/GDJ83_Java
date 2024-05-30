package com.winter.study3.ex3;

public class Cal {
	// Method Overloading
	// 같은 이름의 메서드를 여러개 만드는 것(New)
	// 매개변수의 타입의 조합이나 갯수가 다르면 성립
	// 메서드의 내용은 달라도 상관없음
	public void hap() {// 매개변수 갯수가 없으니 메서드명 동일하게 가능
	}

	// 매개변수로 두개의 숫자를 받아서 합을 출력
	public void hap(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public void hap(int n1, long n2) {
		System.out.println(n1 * n2);

	}

	public void hap(long n1, int n2) {
		System.out.println(n1 + n2);

	}

}
