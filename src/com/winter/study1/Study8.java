package com.winter.study1;

import java.util.Scanner;

public class Study8 {

	public static void main(String[] args) {
		// 이중 for
		// FPS(배그, 서든, 배필)
		// 총알(30발, 탄창 3개)
		// 점사(10발), 단발(30발)

		// 1. 단발모드 2. 점사모드
		// 탕 *30
		// 타타탕 * 10
		int tan = 3;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tan; i++) {
			System.out.println("1번 단발모드, 2번 점사모드: ");// 반복문이 돌아가면서 3번 물어봄
			int mode = sc.nextInt();
			if (mode == 1) {
				for (int j = 0; j < 30; j++) {
					System.out.println(j+1+"번 탕");
				}//안쪽 for

			} else if (mode == 2) {
				for (int j = 0; j < 10; j++) {
					System.out.println(j+1+"번 타타탕");
				}//안쪽 for
			}else {
				System.out.println("다시 선택");
			}
		}

	}

}
