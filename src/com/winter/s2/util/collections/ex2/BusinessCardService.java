package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BusinessCardService {

	private StringBuffer sb;

	public BusinessCardService() {
		this.sb = new StringBuffer();
		this.sb.append("유재석,사원,010-1111-1111,서울시 종로구,ujs@gamil.com");
		this.sb.append("강호동,대리,010-2222-2222,인천시 서구,kanghd@naver.com");
		this.sb.append("하동훈,과장,010-3333-3333,수원시 단원구,haha@gamil.com");
		this.sb.append("정준하,과장,010-4444-4444,서울시 금천구,jun@naver.com.com");

	}

	public ArrayList<BusinessCardDTO> init() {
		String info = sb.toString();
		StringTokenizer st = new StringTokenizer(info, ",");// 입력해놓은 info 파싱

		ArrayList<BusinessCardDTO> ar = new ArrayList<BusinessCardDTO>();

		while (st.hasMoreTokens()) {
			BusinessCardDTO bcDTO = new BusinessCardDTO();

			bcDTO.setName(st.nextToken().trim());// 이름
			bcDTO.setRank(st.nextToken().trim());// 직급
			bcDTO.setPhone(st.nextToken().trim());// 폰번호
			bcDTO.setAddr(st.nextToken().trim());// 회사주소
			bcDTO.setEmail(st.nextToken().trim());// 이메일

			ar.add(bcDTO);
		}
		return ar;

	}

}
