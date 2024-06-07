package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		ProductService ps = new ProductService();
		ArrayList<ProductDTO> ar = ps.init();
		ps.addProduct(ar);

		System.out.println("상품명\t가격\t재고수량");
		System.out.println("=====================");

		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i).getName() + "\t" + ar.get(i).getPrice() + "\t" + ar.get(i).getStock());

		}

		int result = ps.removeProduct(ar);
		if (result > 0) {
			System.out.println("삭제 성공했습니다.");

		} else {
			System.out.println("삭제 실패했습니다.");
		}

	}

}
