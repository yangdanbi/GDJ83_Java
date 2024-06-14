package com.winter.s5.date;

public class Single {
	// singleTone
	private static Single single;

	private int num = 10;

	private Single() {

	}

	public static Single get() {
		if (single == null) {

			Single.single = new Single();
		}

		return Single.single;
	}

}
