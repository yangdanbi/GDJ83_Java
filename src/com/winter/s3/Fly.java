package com.winter.s3;

public interface Fly extends Landing {
	// 상수 접근지정자는 public만 가능
	// 변경 불가
	public final static int NUM = 1;
	// static
	String NAME = "abc";
	// 메서드 오버로딩 : 같은 이름 메서드를 여러개 만드는것
	// 메서드 오버라이딩 : 상속받은 메서드를 자신에게 맞게 재정의하는것

	// 추상 메서드
	// 접근 지정자 public abstract
//	public abstract void t1();
//
//	public int t2();// 자동으로 abstact
//
//	abstract String t3(int num);
//
//	void t4();

	public abstract void flyable();

}
