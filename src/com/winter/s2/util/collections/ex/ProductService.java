package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {
	Scanner sc = new Scanner(System.in);
	private StringBuffer sb;

	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20");
	}

	// init
	public ArrayList<ProductDTO> init() {
		String info = this.sb.toString();// string으로 바꿔줌
		StringTokenizer st = new StringTokenizer(info, ",");

		// ProductDTO(제품)을 담을 가방
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
		// ar = sb.toString();

		while (st.hasMoreTokens()) {
			ProductDTO pDTO = new ProductDTO();

			pDTO.setPrice(Integer.parseInt(st.nextToken().trim()));// 전처리
			pDTO.setName(st.nextToken().trim());
			pDTO.setStock(Integer.parseInt(st.nextToken().trim()));

			ar.add(pDTO);// 원래값에 집어넣음
		}

		return ar;
	}

	// 기존의 가방에다가 새상품을 추가하기
	public void addProduct(ArrayList<ProductDTO> ar) {// 만든 가방을 받아오기
		// 추가되면 pDTO에 추가되게
		// Scanner sc = new Scanner(System.in);
		ProductDTO pDTO = new ProductDTO();

		System.out.println("추가할 상품명을 입력해주세요");
		pDTO.setName(sc.next());
		System.out.println("추가할 상품의 가격을 입력해주세요");
		pDTO.setPrice(sc.nextInt());
		System.out.println("추가할 상품의 재고수량 입력해주세요");
		pDTO.setStock(sc.nextInt());

		ar.add(pDTO);

	}

	// 기존의 가방을 받아서 ,물건의 이름을 입력받아서 삭제 , 리턴x
	public int removeProduct(ArrayList<ProductDTO> ar) {
		ProductDTO pDTO = new ProductDTO();
		System.out.println("삭제할 상품명을 입력해주세요");
		String delName = sc.next();
		int result = 0;

		for (int i = 0; i < ar.size(); i++) {
			if (delName.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}

}
