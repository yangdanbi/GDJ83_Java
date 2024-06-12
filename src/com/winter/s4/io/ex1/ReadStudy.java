package com.winter.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReadStudy {

	private ArrayList<MenuDTO> ar;

	public ArrayList<MenuDTO> read() throws Exception {
		// 호출시 파일 불러오기
		// info.txt 파일 읽어오기
		// 1. 항목별로 읽어서 파싱 후 출력
		// 2.읽어서 파싱 후 DTO를 만든 후에 리턴
		File file = new File("C:\\study", "info.txt");
//		String[] list = null;
//		file.listFiles();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
//			String[] list = s.split(",");
			StringTokenizer st = new StringTokenizer(s, ",");

			ArrayList<MenuDTO> ar = new ArrayList<MenuDTO>();

			MenuDTO mDTO = new MenuDTO();
			while (st.hasMoreTokens()) {

				mDTO.setMenuName(st.nextToken().trim());
				mDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
				mDTO.setKcal(Integer.parseInt(st.nextToken().trim()));

				System.out.println(ar.get(0).getPrice());
			}
			ar.add(mDTO);

//			for (String a : list) {
//				System.out.println(a.trim());
//			}
		}
		br.close();
		return ar;

	}
}
