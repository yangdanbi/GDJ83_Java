package com.winter.s1.lang;

public class Test {
	int age = 10;
	double num = 3.1;

	@Override
	public boolean equals(Object obj) {
		// 부모의 equals를 호출해라
//		return super.equals(obj);
		Test t = (Test) obj;
		if (this.age == t.age && this.num == t.num) {
			return true;
		} else {
			return false;
		}
	}

}
