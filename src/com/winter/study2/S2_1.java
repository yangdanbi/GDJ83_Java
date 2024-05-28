package com.winter.study2;

import java.util.Scanner;

public class S2_1 {

	public static void main(String[] args) {
		int[] ar = new int[5];
		Scanner sc = new Scanner(System.in);

		// 각 인덱스번호 칸에 값을 키보드로 입력받아서 저장하기
		for (int i = 0; i < ar.length; i++) {
			System.out.println("숫자 입력: ");
			ar[i] = sc.nextInt();

		} // 각 인덱스번호 칸에 값을 키보드로 입력받아서 저장하기
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
		System.out.println("배열의 크기를 입력");
		int n = sc.nextInt();
		int[] ar2 = new int[n];

	}

}
