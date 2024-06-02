package com.winter.s1;

//선입선출
public class QueStudy {
	public int[] add(int[] ar) {
		// 받은 배열에서 하나의 임의의 데이터를 추가
		// 제일 앞에 추가되게 하기 unshift
		// 추가된 배열을 리턴
		int[] ar2 = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			ar2[i + 1] = ar[i];
		}
		ar2[0] = 5;
		return ar2;

	}

	public int[] remove(int[] ar) {
//		맨 뒤에 요소삭제
		// 하나의 요소를 삭제하고
		// 삭제된 배열을 리턴
		// 하나씩 밀리게 지우기..?
		int[] ar2 = new int[ar.length - 1];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = ar[i];
		
		}
		return ar2;

	}
}
