package com.winter.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// Generic :타입의 제한을 줌 <>
		// <E> :<>안에 E는 변수
//		string 만 모으는 arrayList 안정성 확보
		ArrayList<String> ar = new ArrayList<String>();

		ar.add("first");
//		ar.add(2);
//		ar.add('c');
//		ar.add(true);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// 같은 타입만 모아서 object로 받고 꺼내야함
		// 모든 String 이 object는 아니니까 형변환해줘야함
//		String name = (String)ar.get(0);
		// 리스트 선언시 string으로 보장을 했기때문에 형변환없이 사용가능
		String name = ar.get(0);
		System.out.println(name);
	}

}
