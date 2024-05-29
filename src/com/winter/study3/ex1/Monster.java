package com.winter.study3.ex1;

public class Monster {
	// 멤버변수에 초기값을 넣어서 사용가능하지만 잘 사용x
	// 메인메서드x
	// 멤버변수
	// 멤버변수가 하는일 =메서드
	String name = "오우거";
	int hp = 100;
	int lv;
	String jongjog = "오크";
	int exp;

	// 몬스터가 무기를 들수있도록
	Ax ax = new Ax();// 다른 클래스를 멤버로 넣음
}
