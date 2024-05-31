package com.winter.s2;

//student + history 까지 추가된 MidStudent 상속
//상속은 하나만 받을 수 있음
//extends 를 안하면 둘은 아무 관계없는 
public class HighStudent extends MidStudent {
	private int science;

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

}
