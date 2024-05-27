package com.winter.study1;

public class Study2 {
	public static void main(String[] args) {
		// 자바에선camel 표기 많이 씀
//		int age = 30;
//		System.out.println(age);

		// Reference type(객체)
		// 문자열

		String name = new String("winter");
		// String name="winter";
		Object obj = new Object();
		int age = 30;
		String na = "iu";

		age = 1;
		na = "1";

		// 연산자는 같은 타입끼리만 연산이 가능
		// 산술연산자 : +, -, *, /, %
		// double + int
		//System.out.println(1.2 + 3);
		// 형변환(Cascading)
		// primitive 타입끼리만 형변환 가능(boolean 제외)

		// 형태의 변환(type의 변환)
		// 강제 형변환(명시적형변환)
		// 큰 타입을 작은 타입에 넣을때
		// 값의 변화있을 수 있음
		long num1 = 30L;
		long num2 = (int) num1;

		float f1 = 1.2f;
		// 자동형변환 (묵시적 형변환)
		// 작은타입을 큰타입에 넣을 때
		// 값의 변화x
		double d1 = f1;

		// 자동형변환
		// byte -> short,chat->int->long->float -> double
		// 수 표현의 갯수(비트 조합)

//		int total = 100;
//		int avg = total / 3;
//		System.out.println(avg);
//		33
		
//		double total = 100;
//		double avg = total / 3;
//		System.out.println(avg);
//		//33.333333333333336

//		int total = 100;
//		double avg = total / 3;
//		System.out.println(avg);
		//33.0 int 로 연산을 한 후 double에 담기만 
		
		int total = 100;
		double avg = (double)total / 3;
		System.out.println(avg);
		//33.333333333333336
		
		avg=33.22;
		total=(int)(avg*10);
		//형변환을 먼저 하기전에 계산을 해야함.
		
		System.out.println(avg);
		System.out.println(total);
		
		//over flow
		byte b = 127;
		byte b2 = 1;
		b=(byte) (b+b2);
		System.out.println(b);
		
		//under flow


	}

}
