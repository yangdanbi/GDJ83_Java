package com.winter.s7.thread;

public class PrintWord implements Runnable { // Runnable 인터페이스를 구현
	@Override
	public void run() {
		this.print();
	}

	public void print() {
		for (int i = 'a'; i < 'a' + 10; i++) {
			System.out.println((char) +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
