package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		// 클래스면 생성자확인하기
		// 크기 선언 없이 계속 넣을 수 있음
		// list
		// arrat list는 뒤에 붙이기만 할땐 빠름
		// 중간에 삭제하거나 변경하면 컴퓨터는 일을 여러번 하기 때문에 느려짐
		// 데이터에 접근하는것은 빠름

		ArrayList ar = new ArrayList();
		// 다형성
		String name = "winter";
		int num = 2;
		ar.add(name);// 0
		// System.out.println(ar);
		// 데이터 타입을 가리지 않고 크기를 정하지 않아도 됨
		ar.add(num);// 1 Integer로 바꼈다가 Integer는 레퍼런스타입이라 object
		ar.add(3.12);// 2 Double 레퍼런스타입으로autoBoxing 됨
		ar.add('a'); // 3 char 타입으로 autoBoxing
		ar.add(false);// 4 boolean 타입으로 autoBoxing
		ar.add(num);// 중복된 값도 허용함

		ar.add(1, "test");
		ar.set(0, 'c');// 0번인덱스를 c로 바꿈 winter->c
		ar.remove(0);// 0번 인덱스 지우기
		ar.remove(2);

		// list는 length 가 없고 size를 사용
		// System.out.println(ar.get(4));

		ar.clear();// 전체삭제
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// LinkedList
		// 순서유지
		// 값을 변경할때 속도가 빠름
		// 앞뒤 주소값을 가져오기 때문에 값 변경시 빠르지만 뒤에 추가할땐 불필요한 주소까지 가져옴
		// 데이터가 많아질수록 느려짐
		// 뒤로가기하면 최근것이 없이지는 스택구조

		LinkedList lk = new LinkedList();
		lk.add("ad");
		System.out.println(lk);
	}

}
