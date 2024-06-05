package com.winter.s1.lang.wrapper.ex;

public class WeatherView {
	public void view(WeatherDTO weatherDTO) {
		if (weatherDTO != null) {
			// 멤버변수의 타입이 private라 게터세터
			System.out.println(weatherDTO.getCity());
			System.out.println(weatherDTO.getGion());
			System.out.println(weatherDTO.getStaus());
			System.out.println(weatherDTO.getHuminity());
			System.out.println("=====================");

		} else {
			System.out.println("날씨정보가 없습니다.");
		}
	}

	// view
	// 날씨들의 정보를 받아서 이쁘게 출력-배열
	public WeatherDTO[] view(WeatherDTO[] dtos) { // WeatherDTO[]인 str1을 받을거임 WeatherDTO을 모아놓은 배열 dtos
		// System.out.println("dtos 호출");
		for (int i = 0; i < dtos.length; i++) {
			// 멤버변수의 타입이 private라 게터세터
			System.out.println(dtos[i].getCity());
			System.out.println(dtos[i].getGion());
			System.out.println(dtos[i].getStaus());
			System.out.println(dtos[i].getHuminity());
			System.out.println("=====================");
		}
		return dtos;

	}

}
