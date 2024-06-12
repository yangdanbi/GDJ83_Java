package com.winter.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		// study2 폴더를 삭제
		File file = new File("C:\\study2");

		File[] list = file.listFiles();
		file.listFiles();

		for (File f : list) {// 데이터타입 변수명 : 선언한 File[]의 변수
//			if (f.isFile()) {// 파일이 있음 파일 지우고
			f.delete();
//			}
		}
		// file.delete();// 폴더안에 파일이 지워지고 난 후 폴더 지우기

	}

}
