package com.winter.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;

public class Collection2 {

	public void useList(List<Integer> ar) {// 매개변수명은 상관없음 list로 받음
		// for(초기식;조건식;증감식){}
		// 향상된 for : for(꺼낼 데이터타입 변수명: collection 의 참조변수명{} )
		// 배열이나 집합체에 사용가능
		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));
		}
		System.out.println("=================");
		for (Integer n : ar) {
			System.out.println(n);
		}

	}

	public void useMap(Map<String, Integer> map) {
		map.get("");

	}

}
