package com.winter.study1;

import java.util.Scanner;

public class Study9 {

	public static void main(String[] args) {

		// 로그인검증
		// id=1234, pw=5678

		// 로그인 시도전에 1.로그인, 2.종료
		// 사용자의 id와 pw를 입력 받아서 로그인 시도를 n번 시도
		// 틀리면 로그인 실패 출력,로그인 성공하면 성공을 출력하고 반복문 종료

		// 반복문이 종료후 종료를 선택했다면 프로그램 종료
		// 로그인이 성공 후 반복문이 종료됐다면 게임을 시작하자.

		Scanner sc = new Scanner(System.in);
		int user_id = 1234;
		int user_pw = 5678;
		boolean login = false;

		// 로그인
		while (!login) { // true일때
			System.out.println("1번 로그인, 2번 종료 ");
			int mode = sc.nextInt();

			if (mode == 1) {

				System.out.println("id를 입력하세요 : ");
				int id = sc.nextInt();
				System.out.println("pw를 입력하세요 : ");
				int pw = sc.nextInt();

				if (user_id == id && user_pw == pw) {
					System.out.println("로그인성공");
					login = true;

				} else {
					System.out.println("로그인실패");
				}

			} else {
				System.out.println("종료");
				break;
			}

		} // while

		// MMORPG :
		// 시작레벨은 1 로 시작해서 15가 만렙
		// gold : 0으로 시작
		// 1 ->2 :3마리
		// 2 ->3 :6마리
		// 3 ->4 :9마리
		// ...
		// 14 ->15 :42마리
		// 5레벨 달성시 1000G 지급
		// 10레벨 달성시 2000G 지급
		// 15레벨 달성시 3000G 지급

		// 현재 레벨,골드 출력하고 종료

		int lv = 1;
		int finLv = 15;
		int gold = 0;

		while (login) {

			System.out.println("1번 게임하기, 2번 종료 ");
			int game = sc.nextInt();
			if (game == 1) {
//				if (i % 5 == 0) {
//					gold = gold += 1000; 
//					System.out.println("골드 획득" + gold);
//				}

				// for (int i = lv; i <= finLv; i++) { 5로 나눴을때마다 누적되니까

				if (lv % 5 == 0) {
					gold += 1000;
					System.out.println("골드 획득 : " + gold);
				}
				// }
				System.out.println("현재레벨 :" + lv + ", 잡은 몬스터 수 : " + lv * 3);
				lv++;
//				for (int j = 0; j <= 15; j++) {
//					j += 5;
//					gold = gold += 1000; // 1000 0
//					//System.out.println("현재골드 " + gold);
//
//				}
			}

			else {
				lv--;
				System.out.println("최종레벨 :" + lv + ", 잡은 몬스터 수 : " + lv * 3 + ", 획득 골드: " + gold);
				System.out.println("종료");
				break;
			}

		}

	}
}
