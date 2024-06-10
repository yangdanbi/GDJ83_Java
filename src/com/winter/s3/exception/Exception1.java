package com.winter.s3.exception;

public class Exception1 {
	public void ex1(int num) throws ArithmeticException, Exception {// catch문 여러개 사용
		int n = 20;
		System.out.println(n / num);

	}

}
