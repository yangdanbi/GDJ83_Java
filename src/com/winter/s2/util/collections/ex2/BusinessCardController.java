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
		this.sc = new Scanner(System.in);

	}

	public void start() {
		boolean flag = true;
		while (flag) {

			System.out.println("1. 명함전체조회 2. 명함추가 3. 명함삭제 4. 명함찾기 5.프로그램종료");
			int mode = sc.nextInt();

			if (mode == 1) {
				// System.out.println("명함전체조회");
				this.businessCardView.view(this.ar);
			} else if (mode == 2) {
				ar = businessCardService.addCard(ar, sc);
				System.out.println("명함이 추가되었습니다.");
			} else if (mode == 3) {
				ar = businessCardService.removeCard(ar, sc);
				System.out.println("명함을 삭제했습니다.");

			} else if (mode == 4) {
				BusinessCardDTO businessCardDTO = businessCardService.findCard(ar, sc);
				businessCardView.view(businessCardDTO);
				System.out.println("명함을 찾았습니다.");
				
			} else if (mode == 5) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}

		}
	}

}
