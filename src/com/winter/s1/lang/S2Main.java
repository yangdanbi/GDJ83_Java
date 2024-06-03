package com.winter.s1.lang;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag);
//		obj1==obj2
		Test t1 = new Test();
		Test t2 = new Test();
		t1.age = 9;
		System.out.println(t1 == t2);
		flag = t2.equals(t1);
		System.out.println(flag);

		String name = "winter";
		System.out.println("이름입력 : ");
		String name2 = sc.next();
		String name3 = "winter";
		System.out.println(name == name2);// false
		System.out.println(name == name3);// true
		// name 과 name3는 값이 winter로 같은 곳을 보고있어서 true
		// 값이 같으면 equals
		System.out.println(name.equals(name2));// true

		// 두개를 더한 새로운 객체가 만들어짐 객체 총 3개
		name3 = name3 + name2;

	}

}
