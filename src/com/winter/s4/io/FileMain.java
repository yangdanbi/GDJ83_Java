package com.winter.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		// 파일 정보를 담고 있는 객체
		File file = new File("C:\\study");

		System.out.println(file.exists()); // 실제로 있는 파일의 경로가 맞는지
		System.out.println(file.isDirectory()); // 폴더인지
		System.out.println(file.isFile()); // 파일인지
		System.out.println(file.getName());// 파일명,폴더명 등 정보 가져오기
		System.out.println(file.length());// 크기
		System.out.println("==============");
		// file = new File("C:\\study.java", "test.txt");// 폴더 ,하위의 있는 파일
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println("==============");
		if (!file.exists()) {

			file.mkdir();// makeDirectorry
		}
		file = new File("C:\\study\\sub2\\student");// sub2파일이 있어야 만들 수 있음

		file.mkdirs();

		file = new File("C:\\study\\test.txt"); // test.txt 파일이 삭제됨
		file.delete();

		file = new File("C:\\study\\sub2\\student");// 폴더를 비우려면 폴더안이 비워져있어야함
		file.delete();

		file = new File("C:\\study");

		File[] list = file.listFiles();
		file.listFiles();

		for (File f : list) {
			if (f.isDirectory()) {
				System.out.println("폴더입니다");
			} else {

				System.out.println("파일입니다");
			}
			System.out.println(f);
		}

	}

}
