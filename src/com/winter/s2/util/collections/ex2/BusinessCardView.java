package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;

public class BusinessCardView {
	public ArrayList<BusinessCardDTO> view(ArrayList<BusinessCardDTO> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("이름: " + ar.get(i).getName());
			System.out.println("직급: " + ar.get(i).getRank());
			System.out.println("번호: " + ar.get(i).getPhone());
			System.out.println("이메일: " + ar.get(i).getEmail());
			System.out.println("회사 주소: " + ar.get(i).getAddr());

		}

		return ar;

	}

}
