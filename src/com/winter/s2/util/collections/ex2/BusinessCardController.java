package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessCardController {
	private ArrayList<BusinessCardDTO> ar;
	private BusinessCardService businessCardService;
	private BusinessCardView businessCardView;
	private Scanner sc = new Scanner(System.in);

	public BusinessCardController() {
		this.businessCardService = new BusinessCardService();
		this.businessCardView = new BusinessCardView();

		this.ar = new BusinessCardService().init();

	}

	public void start() {
		boolean flag = true;

		System.out.println("1. 명함전체조회 2. 명함추가 3. 명함삭제 4.프로그램종료");
		int mode = sc.nextInt();

		if (mode == 1) {
			System.out.println("명함전체조회");
			this.businessCardView.view(this.ar);
		}
	}

}
