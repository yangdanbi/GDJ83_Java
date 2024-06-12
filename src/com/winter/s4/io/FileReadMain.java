package com.winter.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadMain {

	public static void main(String[] args) {
		File file = new File("C:\\study", "study.java");
		Scanner sc = new Scanner(System.in);
		sc.close();// 해줘야함
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);// 파일경로를 적으면 문자로
			br = new BufferedReader(fr);// 문자를 연결해서 문자열로 만들어줌

			while (true) {
				String s = br.readLine(); // 커서가 더 내려가지 않는다면
				if (s == null) {
					break;
				}
				System.out.println(s);

			}
		} catch (Exception e) {// catch를 한번만 사용하고 싶으면 Exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// try catch랑 같이 다니는애들로 예외가 있던 없던 실행함 보통 자원해제를 함/ 연결된 순서 역순으로 해제
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println("종료");

	}

}
