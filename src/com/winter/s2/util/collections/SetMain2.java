package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {

		// 로또 번호
		// 1-45번 : 6개
		Random random = new Random();

//		int num = random.nextInt(45) + 1;// 0이 나오지 않도록
		ArrayList<Integer> list = new ArrayList<Integer>();

//		while (list.size() != 6) {
//
//		}
		int[] ar = new int[6];
//중복제거 배열
		for (int i = 0; i < ar.length; i++) {
			ar[i] = random.nextInt(45) + 1;
		}
//중복제거 arrayList
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		// 중복값이 절대 있음 안됨
		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);

		}
		System.out.println(hs);

	}

}
