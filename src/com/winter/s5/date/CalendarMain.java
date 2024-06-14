package com.winter.s5.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();

		// 객체가 생길때에 현재 시간과 날짜정보가 만들어짐
		ca = Calendar.getInstance();//
		System.out.println(ca);
		// 멤버변수 쓰는법
		// 참조변수명.참조변수
		System.out.println("YEAR : " + ca.get(Calendar.YEAR));// 클래스명.변수명 2024년
		System.out.println("HOUR_OF_DAY : " + ca.get(Calendar.HOUR_OF_DAY));// 클래스명.변수명 15시
		System.out.println("MONTH : " + ca.get(Calendar.MONTH) + 1);// 클래스명.변수명 0월 부터 시작하기때문에 +1
		System.out.println("DATE : " + ca.get(Calendar.DATE));// 14일
		Date date = ca.getTime();// data는 요즘 많이 쓰지않음 calendar을 추천
		System.out.println("DATE : " + date);

		Calendar future = Calendar.getInstance();
//		future.set(Calendar.YEAR, 2074);// 2074년도로 년도 바꾸기
//		System.out.println("future.getTime() : " + future.getTime());

		future.set(Calendar.DATE, future.get(Calendar.DATE) + 17);
		System.out.println("future.getTime() : " + future.getTime());
		Single single = Single.get();// singel에 있는 멤버변수 사용가능

	}

}
