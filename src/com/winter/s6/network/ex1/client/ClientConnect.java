package com.winter.s6.network.ex1.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientConnect {

	// 1. 연결
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;

	public void getConnection() throws Exception { // 예외던지기
		socket = new Socket("localhost", 8282); // 소켓을 통해서 받기

		// Input
		// 받기
		is = socket.getInputStream();
		ir = new InputStreamReader(is);// 문자읽ㄱ기
		br = new BufferedReader(ir);
		// Ouput
		// 보내기
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);

	}

	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}

	// 2. 자원 해제
	public void disConnect() throws Exception {
		br.close();
		ir.close();
		is.close();
		ow.close();
		os.close();
		socket.close();
	}

}
