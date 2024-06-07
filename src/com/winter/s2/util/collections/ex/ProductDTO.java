package com.winter.s2.util.collections.ex;

public class ProductDTO {
	// 멤버변수는 private
	// 게터세터
	private Integer price;// 가격
	private String name;// 제품명
	private Integer stock;// 수량

	public ProductDTO() {

	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
