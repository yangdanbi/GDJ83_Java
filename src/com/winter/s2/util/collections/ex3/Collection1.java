package com.winter.s2.util.collections.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Collection1 {
	public List<Integer> makeList() {// 다형성
//		ArrayList<Integer> ar = new ArrayList<Integer>();
		List<Integer> ar = new ArrayList<Integer>();

		ar.add(1);
		ar.add(2);

		return ar;

	}

	public Map<String, Integer> makeMap() {
		return null;

	}

}
