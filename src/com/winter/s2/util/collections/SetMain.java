package com.winter.s2.util.collections;

import java.util.HashSet;

import com.winter.s2.util.collections.ex.ProductDTO;

public class SetMain {

	public static void main(String[] args) {
		// 입력한 데로 순서 유지x a부터 정렬
		// 중복데이터를 원하지 않을때, 중복값이 없어야할때 사용
		HashSet<String> hs = new HashSet<String>();

		hs.add("first");
		hs.add("second");
		hs.add("apple");
		// 똑같은 값은 하나만 보관
		hs.add("second");

		System.out.println(hs);

		HashSet<ProductDTO> hs2 = new HashSet<ProductDTO>();

		ProductDTO productDTO = new ProductDTO();
		ProductDTO productDTO2 = new ProductDTO();
		productDTO2 = productDTO;

		// 두개는 다른 주소값을 갖고있기때문에 중복x
		hs2.add(productDTO);
		hs2.add(productDTO2);

		System.out.println(hs2);

	}

}
