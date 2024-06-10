package com.winter.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("k1", 1);
		map.put("k2", 2);

		System.out.println("map.size : " + map.size());
		System.out.println("map.isEmpty : " + map.isEmpty());
		System.out.println("map.containsKey : " + map.containsKey("k1"));
		System.out.println("map.containsValue : " + map.containsValue(2));
		System.out.println("map.get : " + map.get("k1"));
		map.remove("k2", 3);// 일차하는 애가 없어서 지워지지 않음
		map.clear();// 요소들이 삭제

		Iterator<String> it = map.keySet().iterator();// keySet은 하나씩 꺼내는게 없음 그래서 iterator
		// map은 키를 알고있을때 자주 사용 반복문을 사용한다면 list이용
		while (it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);

		}
	}

}
