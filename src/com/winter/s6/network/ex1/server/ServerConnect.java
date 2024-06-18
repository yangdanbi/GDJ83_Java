package com.winter.s6.network.ex1.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnect {
	private ServerSocket ss;
	// 1. 연결
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;

	public void getConnect() throws Exception {
		ss = new ServerSocket(8282);

		socket = ss.accept();

		// Input
		// 받기
		is = socket.getInputStream();
		ir = new InputStreamReader(is);// 문자읽ㄱ기
		br = new BufferedReader(ir);// 받은거 읽기
		// Ouput
		// 보내기
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);

	}

//데이터를 주고받기 위해 필요한 두개
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
