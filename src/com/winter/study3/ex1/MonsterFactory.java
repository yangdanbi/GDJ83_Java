package com.winter.study3.ex1;

import java.util.Random;

public class MonsterFactory {
	public Monster createMonster() {
		// 몬스터 객체 만들어줌
		// Monster 에 저장해놓은 변수값대로 몬스터가 만들어짐
		Monster m = new Monster();// 몬스터 만드는 식
		return m;

	}

	public Monster[] createMonsterGroup() {
		Random random = new Random();
		int count = random.nextInt(5) + 2;
		// 모으려고 하는 데이터 타입
		Monster[] monsters = new Monster[count];

		for (int i = 0; i < count; i++) {
			Monster m = new Monster();// 몬스터 만드는 식
			monsters[i] = m;
		}

		return monsters;
	}

}
