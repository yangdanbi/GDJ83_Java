package com.winter.study3.ex1;

public class Exmain {

	public static void main(String[] args) {
		Monster m = new Monster();

		m.hp = 100;
		m.lv = 1;
		m.jongjog = "a";
		m.exp = 50;
		m.name = "ydb";

//		System.out.println("체력 : " + m.hp);
//		System.out.println("레벨 : " + m.lv);
//		System.out.println("종족 : " + m.jongjog);
//		System.out.println("경험치: " + m.exp);
//		System.out.println("이름 : " + m.name);

		Ax ax = new Ax();
		ax.name = "손도끼";
		ax.damage = 100;
		ax.range = 200;
		ax.Durability = 50;
		ax.upgrade = 0;

//		System.out.println("무기이름 : " + ax.name);
//		System.out.println("공격력 : " + ax.damage);
//		System.out.println("사거리 : " + ax.range);
//		System.out.println("내구성 : " + ax.Durability);
//		System.out.println("강화수치 : " + ax.upgrade);

		System.out.println(" ");

		m.ax = ax;// 몬스토 도끼변수에 도끼를 넣음

		System.out.println(m.ax.name);

		ax = new Ax(); //
		ax.name = "황금도끼";
		System.out.println(m.ax.name);

		Monster m2 = new Monster();
		m2.ax = ax;
	}

}
