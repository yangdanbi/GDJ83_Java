package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		// Network
		// ipLport => Socket
		// Network 통신은 Socket 끼리 1:1 통신
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null; // 문자열을 읽어줌
		OutputStream os = null;
		OutputStreamWriter ow = null;
		Scanner scanner = new Scanner(System.in);

		try {
			ss = new ServerSocket(8282);
			while (true) {
				System.out.println("서버 실행 후 클라이언트 기다림");
				sc = ss.accept();// 서버랑 client는 socket으로 얘기(?) 하면 됨
				System.out.println("Client와 연결 성공");
				// 서버를 열고 Client 접속을 기다림
				// 받는 입장임
				// socket이 연결되면 output,input이 하나씩 생김
				// 연결된 걸 받아서 문자로 만들어주는 애가 필요함
				// 빨대가 3개 꽂힘
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				os = sc.getOutputStream();// 0과 1을 처리
				ow = new OutputStreamWriter(os);// buffer에 있는걸 내보낼 준비

				while (true) {
					String msg = br.readLine();

					if (msg.toLowerCase().equals("exit")) {
						System.out.println("Server에서 exit 요청");
						break;
					}
					System.out.println("=============================");
					System.out.println("client에서 보낸 메세지 : " + msg);
					System.out.println("=============================");

					System.out.println("Server에서 Client로 보낼 메세지 입력 : ");
					msg = scanner.next();

//			System.out.println("str : " + str);

					ow.write(msg + "\r\n");
					ow.flush();

					if (msg.toLowerCase().equals("exit")) {
						System.out.println("Client에서 exit 요청");
						break;
					}
				}
			}
		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				ss.close();
				sc.close();
				ow.close();
				os.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
