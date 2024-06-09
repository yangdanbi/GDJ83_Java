package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BusinessCardService {

	private StringBuffer sb;

	public BusinessCardService() {
		this.sb = new StringBuffer();
		this.sb.append("유재석,사원,010-1111-1111,서울시 종로구,ujs@gamil.com");
		this.sb.append(",강호동,대리,010-2222-2222,인천시 서구,kanghd@naver.com");
		this.sb.append(",하동훈,과장,010-3333-3333,수원시 단원구,haha@gamil.com");
		this.sb.append(",정준하,과장,010-4444-4444,서울시 금천구,jun@naver.com.com");

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

	public ArrayList<BusinessCardDTO> addCard(ArrayList<BusinessCardDTO> ar, Scanner sc) {// BusinessCardDTO 를 받음

		BusinessCardDTO bcDTO = new BusinessCardDTO();
		// ArrayList<BusinessCardDTO> ar = new ArrayList<BusinessCardDTO>();
		System.out.println("추가할 명함의 이름을 입력하세요: ");
		bcDTO.setName(sc.next());
		System.out.println("추가할 명함의  직급을 입력하세요: ");
		bcDTO.setRank(sc.next());
		System.out.println("추가할 명함의 번호를 입력하세요: ");
		bcDTO.setPhone(sc.next());
		System.out.println("추가할 명함의 회사주소를 입력하세요: ");
		bcDTO.setAddr(sc.next());
		System.out.println("추가할 명함의 이메일을 입력하세요: ");
		bcDTO.setEmail(sc.next());

		ar.add(bcDTO);

		return ar;
	}

	public ArrayList<BusinessCardDTO> removeCard(ArrayList<BusinessCardDTO> ar,Scanner sc) {
		BusinessCardDTO bcDTO = new BusinessCardDTO();
		System.out.println("삭제할 명함의 이름을 입력해주세요");
		String delName = sc.next();
		for(int i=0;i<ar.size();i++) {
			if(delName.equals(ar.get(i).getName())) {
				ar.remove(i);
				break;
				
			}
		}
		return ar;
	
	}
	public BusinessCardDTO findCard(ArrayList<BusinessCardDTO> ar,Scanner sc) {
		BusinessCardDTO bcDTO = null;
		System.out.println("검색 할 이름을 입력하세요: ");
		String findName = sc.next();
		
		for(int i=0;i<ar.size();i++) {
			if(findName.equals(ar.get(i).getName())) {
				bcDTO =ar.get(i);
				break;
			}
			
		}
		return bcDTO;
		
	}

}
