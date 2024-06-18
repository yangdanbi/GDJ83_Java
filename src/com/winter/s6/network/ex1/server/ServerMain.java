package com.winter.s6.network.ex1.server;

public class ServerMain {

	public static void main(String[] args) {
		ServerConnect serverConnect = new ServerConnect();
		try {
			serverConnect.getConnect();
			System.out.println("연결성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
