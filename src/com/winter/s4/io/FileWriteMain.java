package com.winter.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		// 문자열 -> 문자 -> 01
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요: ");
		String fileName = sc.next();
		File file = new File("C:\\study", fileName);
		FileWriter fw = null;

		try {
			fw = new FileWriter(file, true);// false 는 똑같이 덮어씌움 true는 뒤에 추가

			while (true) {
				System.out.println("내용을 입력하세요: ");
				String s = sc.next();
				if (s.equals("e") || s.equals("E")) {
					break;
				}

				// e, E가 입력되면 종료
				fw.write(s + "\r\n");
//			fw.write("first");
//			fw.write("second");// 파일내용 덮어씌움
				// fw.write("\n5555");//
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("프로그램 종료");

	}

}
