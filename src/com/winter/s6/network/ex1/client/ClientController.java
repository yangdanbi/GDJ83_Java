package com.winter.s6.network.ex1.client;

import java.util.Scanner;

public class ClientController {
	private ClientConnect clientConnect;
	private ClienService clienService;

	public ClientController() {
		clientConnect = new ClientConnect();
		clienService = new ClienService();

	}

	public void start() throws Exception {
		// 접속을 하고
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		clientConnect.getConnection();// 한번만 실행할 거라 여기에 위치해도 상관없음

		while (flag) {
			System.out.println("1.전체 2.상세정보 3.종료");
			int select = sc.nextInt();

			if (select == 1) {
				clientConnect.getOw().write(select + "\n\r");// 쓰기
				clientConnect.getOw().flush();
				// 서버에서 보내면 받기
				String info = clientConnect.getBr().readLine();// write이 먼저 선언되고 나서 읽기
				// 받은 info 파싱
				clienService.getInfo(info);
			} else if (select == 2) {

			} else {

			}
		}
	}

}
