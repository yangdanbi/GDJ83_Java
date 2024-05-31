package com.winter.s3;

//animal을 상속받으려고 하면 추상메서드가 있어서 에러남
//1. abstract class 지정해주거나
//public abstract class Tiger extends Animal {

//}

//2.추상코드 완성하면 됨
public class Tiger extends Animal {
	int power;
	// 메서드 오버로딩 : 같은 이름 메서드를 여러개 만드는것
	// 메서드 오버라이딩 : 상속받은 메서드를 자신에게 맞게 재정의하는것
	// 메서드의 선언부는 (Header) 는 동일하게 수정x
	// 접근지정자는 같은 범위나 더 넓은 범위로는 수정이 가능 ex) anmal sleep이 dafault 면 더 큰 범위로 변경 가능

	public void sleep() {
		System.out.println("누워자기");

	}
}