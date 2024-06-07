package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherContoroller {
	//
	private WeatherDTO[] dtos;
	private WeatherService weatherSrrvice; // 데이터타입 변수
	private WeatherView weatherView;
	private Scanner sc;

	// start
	// dtos 초기화는 WeatherController의 생성자 내에서 초기화
	// 1. 날씨 정체정보출력
	// 2. 종료
	public WeatherContoroller() {// 기본생성자
		// 자가자신을 가르키는 참조변수
		// 초기화는 대입하자
		this.weatherSrrvice = new WeatherService();// 내가 원하는 공간에 올바른게 들어감
		this.weatherView = new WeatherView();

		// 메서드내에서 메서드 호출 WeatherService().init()를 호출하면 dtos[] 정보를 받을 수 있음
		this.dtos = new WeatherService().init();
		this.sc = new Scanner(System.in);

	}

	// 멤버변수의 타입이 private라 게터세터
	public void start() {

		boolean flag = true;
		while (flag) {
//			Scanner sc = new Scanner(System.in);
			System.out.println("1. 날씨전체정보출력 , 2. 날씨정보검색, 3. 도시정보추가 4. 날씨정보삭제 5. 종료");

			int mode = sc.nextInt();
			if (mode == 1) {
				this.weatherView.view(this.dtos);
			} else if (mode == 2) {

				WeatherDTO weatherDTO = weatherSrrvice.findByCity(dtos, sc);
				weatherView.view(weatherDTO);

			} else if (mode == 3) {

				dtos = weatherSrrvice.addWeather(dtos, sc);
				System.out.println("추가가 완료되었습니다.");

			} else if (mode == 4) {

				dtos = weatherSrrvice.removeWeather(sc, dtos);
				System.out.println("삭제가 완료되었습니다.ㅣ");

			} else if (mode == 5) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			} else {
				System.out.println("올바른 숫자를 입력해주세요  ");
			}

		}

	}

}
