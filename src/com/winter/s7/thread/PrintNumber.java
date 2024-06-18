package com.winter.s7.thread;

public class PrintNumber extends Thread {// Thread상속받음

	@Override
	public void run() {
		this.info();
	}

//synchronized 결제페이지같이 한사람만 들어갈수있도록 동기화
	public synchronized void info() {
		Object obj = new Object();

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
