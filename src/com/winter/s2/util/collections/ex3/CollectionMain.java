package com.winter.s2.util.collections.ex3;

import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		Collection1 c1 = new Collection1();
		Collection2 c2 = new Collection2();

		// c1에서 만든 arrayList를 c2로 보내야함
//		List<Integer> ar = c1.makeList();
//		c2.useList(ar);
		// 한줄로 정리한것
		List<Integer> ar = c1.makeList();
		c2.useList(ar);
		c2.useList(c1.makeList());
	}

}
