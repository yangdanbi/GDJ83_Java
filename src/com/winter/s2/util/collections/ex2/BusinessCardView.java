package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;

import com.winter.s1.lang.wrapper.ex.WeatherDTO;

public class BusinessCardView {
	public void view(ArrayList<BusinessCardDTO> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("이름: " + ar.get(i).getName());
			System.out.println("직급: " + ar.get(i).getRank());
			System.out.println("번호: " + ar.get(i).getPhone());
			System.out.println("이메일: " + ar.get(i).getEmail());
			System.out.println("회사 주소: " + ar.get(i).getAddr());
			System.out.println("=====================");

		}

//		return ar;

	}
	public void view(BusinessCardDTO businessCardDTO) {
		if (businessCardDTO != null) {
			// 멤버변수의 타입이 private라 게터세터
			System.out.println(businessCardDTO.getName());
			System.out.println(businessCardDTO.getRank());
			System.out.println(businessCardDTO.getPhone());
			System.out.println(businessCardDTO.getEmail());
			System.out.println(businessCardDTO.getAddr());
			System.out.println("=====================");

		} else {
			System.out.println("명함정보가 없습니다.");
		}
	}

}
