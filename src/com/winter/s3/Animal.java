package com.winter.s3;

public abstract class Animal {
	// new Animal 못함
	// 무조건 상속받아서 써야함
	int age;
	String name;

	// 상속받아서 나머지는 구현해라
	public abstract void sleep();

}
