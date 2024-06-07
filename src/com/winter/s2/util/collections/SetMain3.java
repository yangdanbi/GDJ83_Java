package com.winter.s2.util.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {

	public static void main(String[] args) {
		HashSet<Integer> ar = new HashSet<Integer>();

		ar.add(10);
		ar.add(8);
		ar.add(16);

		// set이 중복된 데이터가 없이 쓸때는 좋지만 하나씩만 꺼낼때는 이렇게 사용
		Iterator<Integer> ir = ar.iterator();// 열거형이기때문에 하나꺼내고 하나꺼내고 반복 그렇기때뭉에 while
		while (ir.hasNext()) {
			Integer num = ir.next();
			System.out.println(num);
		}

//		System.out.println(ar);
	}

}
