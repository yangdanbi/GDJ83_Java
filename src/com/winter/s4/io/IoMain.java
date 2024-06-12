package com.winter.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {

	public static void main(String[] args) {// 메인에서 메서드에 throw를 해주면 메인은 갈곳이 없어jvm이 처리해줘야함
		// stream : 연결선
		// 양쪽에서 주고받기 a가 내보내면 b는 받기만해야함 안그럼 충돌
		// 1byte = 1bit
		// 키보드에서 입력받으면 0과 1로 컴퓨터에 들어감
		InputStream is = System.in;
		// 받아서 문자를 만들 애가 필요
		// char 문자들을 처리하는 애
		InputStreamReader ir = new InputStreamReader(is);// 문자를 처리함
		// String
		BufferedReader br = new BufferedReader(ir);// 다형성때문에 가능
		// 입력받을 준비 끝

		System.out.println("입력하세요 : "); // 엔터를 칠때까지
		// 변수 초기화 필수
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 한줄 읽어오기
		System.out.println(s);// 내보내는것

	}

}
