package com.winter.s7.thread;

public class ThreadMain {
//가상의 스택에 메서드를 올려서 두개의 메서드가 번갈아가면서 실행됨
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		PrintWord pw = new PrintWord();
		Thread thread = new Thread(pw);

		pn.start();
		thread.start();

//		pn.info();
//		pw.print();
	}

}
