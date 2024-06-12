package com.winter.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {

	// private ArrayList<MenuDTO> ar;

	public List<MenuDTO> read() throws Exception {
		// 호출시 파일 불러오기
		// info.txt 파일 읽어오기
		// 1. 항목별로 읽어서 파싱 후 출력
		// 2.읽어서 파싱 후 DTO를 만든 후에 리턴
		File file = new File("C:\\study", "info.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<MenuDTO> ar = new ArrayList<MenuDTO>();

		while (true) {
			String s = br.readLine();
			if (s == null) {// readLine읽어들인게 없다면 while문 실행x
				break;
			}
			StringTokenizer st = new StringTokenizer(s, ",");

			MenuDTO mDTO = new MenuDTO();
			while (st.hasMoreTokens()) {

				mDTO.setMenuName(st.nextToken().trim());
				mDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
				mDTO.setKcal(Integer.parseInt(st.nextToken().trim()));
			}
			ar.add(mDTO);
		}
		br.close();
		fr.close();
		return ar;
	}
}
