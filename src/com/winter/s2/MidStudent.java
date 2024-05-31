package com.winter.s2;

//Student 클래스를 확장해서 MidStudent 만들자
public class MidStudent extends Student {
	// Student 만든거에 history만 추가
	private int history;

	public MidStudent() {
		// 첫줄에 위치해야함
		// super(); -Student를 생성하고 자기자신을 확장해서 만들어줌
		// this() 도 첫줄에 와야하기 때문에 둘이 같이는 못씀
		super(10);
	}

	public void midInfo() {
		super.info();
		System.out.println(this.history);
//		System.out.println("midInfo : " + this.getNum());

	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

}
