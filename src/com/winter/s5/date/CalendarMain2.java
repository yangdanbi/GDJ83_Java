package com.winter.s5.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		birth.set(1998, 2, 2);
		System.out.println("birth : " + birth.getTime());

		long c = ca.getTimeInMillis();
		long a = birth.getTimeInMillis();
		System.out.println("getTimeInMillis : " + c);
		System.out.println(1000 * 60 * 60 * 24 * 2 / 1000 * 60 * 60 * 24);
		System.out.println(a / (1000 * 60 * 60 * 24));

		long b = birth.getTimeInMillis();
		b = b + 1000 * 60 * 60 * 24 * 100L;

		birth.setTimeInMillis(b);
		System.out.println(birth.getTime());
//		birth.roll(0, false);

	}

}
