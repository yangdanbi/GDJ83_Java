package com.winter.s2;

public class Member {
	private String name;
	// 데이터를 넣거나 뺄수가 없음
	private int age;

//	public Member(String name, int age) { // alt + shift +s
//
//		this.name = name;
//		this.age = age;
//	}

	// 외부에서 접근할 수 있게 해주는 법
	// setter getter
	public void setAge(int age) {
		// if문 사용 가능
		this.age = age;
	}

	public int getAge() {
		return this.age;

	}

	public String getName() {// 꺼내감
		return name;
	}

	public void setName(String name) {// 데이터 넣음
		this.name = name;
	}
}
