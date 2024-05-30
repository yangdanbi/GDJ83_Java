package com.winter.study3.ex2;

public class Study {
//
	public int[] remove(int[] ar) {
		int[] ar2 = new int[ar.length - 1];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = ar[i];
		}
		return ar2;

		// return int[];
	}

	// 메서드
	public int[] add(int ar[]) {// 매개변수로 int ar[] 을 받을 거임
		System.out.println(ar.length); // main에 있는 ar과 같은 거
		// ar[0] = 5;// 둘은 같은 주소값을 보고있기 때문에 변경 가능
//		System.out.println(ar[0]);// 5
		int[] ar2 = new int[ar.length + 1];// 기존에 갖고있던 주소값은 ar에 있으니까 복사 먼저 해주고

		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}
//		for (int i = 0; i < ar2.length; i++) {
//			ar[i] = ar2[i];
//			ar[i] = ar2[i];
//			ar[i] = ar2[i];
//		}
//		ar[3] = ;
		// 새로운 배열을 추가하기 위해선 리턴
		// System.out.println(ar[1]);// 5
//		ar = new int[4]; // 4칸으로 만들어주기
		return ar2;

		// 배열을 찍으면 1230
	}

}
