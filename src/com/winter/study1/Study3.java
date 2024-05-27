package com.winter.study1;

public class Study3 {
	public static void main(String[] args) {
		// 연산자 +,-,*,/
		// + 산술연산자
		// + 연결연산자 : 문자열 + primitive => 문자열
		// sysout + ctrl+space
		System.out.println("1" + 1); // 11
		System.out.println(1 + "1" + 1); // 111
		System.out.println(1 + 'a' + "1"); // 981 a=아스키코드로 97 + 1 +"1"

		// 물건을 고르고, 물건의 총합계,돈을 내고 ,
		// 물건의 총 합을 담을 변수(int),
		int total = 25550;
		int don = 50000;
		// 잔돈 계산
		int jandon = don - total;

		// 만원 갯수를 담을 변수
		int man = jandon / 10000;	
//		int man = jandon / 10000;	
		
		// 천원 갯수를 담을 변수
		int cheon = (jandon - man * 10000) / 1000;
		// 백원 갯수를 담을 변수
		int back = (jandon-(man*10000) -(cheon*1000))/100;
		// 십원 갯수를 담을 변수
		int sip = (jandon-(man*10000) -(cheon*1000)-(back*100))/10;

		// int

		// chen =

		System.out.println("잔돈 : " + jandon);
		System.out.println("만원 : " + man + "장");
		System.out.println("천원 :  " + cheon + "장");
		 System.out.println("백원 : " + back + "개");
		System.out.println("십원 :  " + sip + "개");
	}

}
