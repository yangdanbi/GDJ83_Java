package com.winter.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		birth.set(1998, 2, 2);
		System.out.println("birth : " + birth.getTime());

		long c = ca.getTimeInMillis();
		long birth2 = birth.getTimeInMillis();
		System.out.println("getTimeInMillis : " + c);
		System.out.println(1000 * 60 * 60 * 24 * 2 / 1000 * 60 * 60 * 24);
		System.out.println(birth2 / (1000 * 60 * 60 * 24));

		long b = birth.getTimeInMillis();
		b = b + 1000 * 60 * 60 * 24 * 100L;

		birth.setTimeInMillis(b);
		System.out.println("setTimeInMillis : " + birth.getTime());
//		birth.roll(0, false);

		String n = "1995-03-12";
		// -기준으로 가져와야함
		String[] a = n.split("-");
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[2]));

		System.out.println("[] a 배열 -> ca : " + ca.getTime());

		ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분");
		String s = sd.format(ca.getTime());
		System.out.println("SimpleDateFormat : " + s);

		// 절대 중복되지 않음
		String id = UUID.randomUUID().toString();

		System.out.println("uuid : " + id);
	}

}
