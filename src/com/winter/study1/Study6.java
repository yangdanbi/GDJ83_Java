package com.winter.study1;

public class Study6 {
	public static void main(String[] args) {

		int total = 300;
		int avg = total / 3;

		// 평균이 90점 이상이면 A
		// 평균이 80점 이상이면 B
		// 평균이 70점 이상이면 C
		// 평균이 60점 이상이면 D
		// 그 외 F
		switch (avg / 10) {
		case 10:
		case 9:
			System.out.println("A");
			int n = 10;// 지역변수
			break;
		case 8:
			// 9가 아니면 8로 넘어오기때문에 같은 변수이름 사용x
			//int n = 10
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("F");
			break;
		}

	}

}
