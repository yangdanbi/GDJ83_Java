package com.winter.s6.network.ex1.client;

public class ClientMain {

	public static void main(String[] args) {
		ClientConnect clientConnect = new ClientConnect();
		ClienService clientService = new ClienService();

		try {
			clientConnect.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
