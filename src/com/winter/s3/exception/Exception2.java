package com.winter.s3.exception;

public class Exception2 {
	public void hap(int n1, int n2) throws Exception {
		int h = n1 + n2;

		if (h > 99) {
			throw new MyException("3자리수는 몰라요");
		}

	}

}
